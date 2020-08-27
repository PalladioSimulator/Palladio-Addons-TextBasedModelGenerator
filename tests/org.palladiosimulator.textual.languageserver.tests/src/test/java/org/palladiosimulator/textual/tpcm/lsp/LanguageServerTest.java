package org.palladiosimulator.textual.tpcm.lsp;

import org.eclipse.lsp4j.InitializeParams;
import org.eclipse.lsp4j.InitializedParams;
import org.eclipse.lsp4j.PublishDiagnosticsParams;
import org.eclipse.lsp4j.WorkspaceFolder;
import org.eclipse.lsp4j.jsonrpc.Launcher;
import org.eclipse.lsp4j.launch.LSPLauncher;
import org.eclipse.lsp4j.services.LanguageServer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.engine.discovery.UriSelector;

import java.io.*;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class LanguageServerTest {
    public static String EXAMPLE_MODELS_LOCATION_PARAMETER = "examples.location";
    public static String EXAMPLE_MODELS_LOCATION_DEFAULT = "../../examples/org.palladio.textual.tpcm.examples/";

    Process lsProc;
    LanguageServer serverUnderTest;
    MockLanguageClient mockClient;

    @Test
    void testEmpty() throws InterruptedException, TimeoutException, ExecutionException {
        testSingleFileNoDiagnostics("testInitialization");
    }

    @Test
    void testPathmap() throws InterruptedException, TimeoutException, ExecutionException {
        testSingleFileNoDiagnostics("testPathmap");
    }

    @Test
    void testParseFilesOfExamplesProject() throws InterruptedException, TimeoutException, ExecutionException, IOException {
        Path examplesPath = Paths.get(System.getProperty(EXAMPLE_MODELS_LOCATION_PARAMETER, EXAMPLE_MODELS_LOCATION_DEFAULT));
        var tpcmFiles = Files.walk(examplesPath).filter(f -> f.toString().endsWith(".tpcm"))
                .map(path -> {
                    try {
                        return path.toRealPath().toUri().toString();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }).collect(Collectors.toSet());
        var failed = new HashMap<String, String>();

        assertTimeoutPreemptively(Duration.ofSeconds(60), () -> {
            initializeLanguageServer(examplesPath);
            while (!tpcmFiles.isEmpty()) {
                var diag = mockClient.publishedDiagnostics.poll(60, TimeUnit.SECONDS);
                var uri = Paths.get(URI.create(diag.getUri())).toRealPath().toUri().toString();
                System.out.println("Received: " + uri);
                if (tpcmFiles.remove(uri) && diag.getDiagnostics().size() > 0) {
                    failed.put(diag.getUri(), diag.toString());
                }
            }
        }, () -> "The test timed out while waiting for a server diagnostic of files: " + tpcmFiles.toString());

        assertEquals(0, failed.size(), () -> "The examples should have been parsed without issues. Instead the following files failed: " + failed.toString());
        assertEquals(0, tpcmFiles.size(), () -> "The server should have been parsed all files from the examples folder. Instead the following files were not processed: " + tpcmFiles.toString());
    }

    void testSingleFileNoDiagnostics(String testName) throws InterruptedException, ExecutionException, TimeoutException {
        initializeLanguageServer(getTestArtifactsFolder(testName));

        var diagnostic = mockClient.publishedDiagnostics.poll(10, TimeUnit.SECONDS);
        assertEquals(diagnostic.getUri(), getTestDocument(testName).toUri().toString());
        assertEquals(0, diagnostic.getDiagnostics().size(), () -> "The file should have been parsed without an issue. The server returned the following issues: " + diagnostic.toString());
    }

    Path getTestDocument(String testName) {
        return getTestArtifactsFolder(testName).resolve("test.tpcm");
    }

    Path getTestArtifactsFolder(String testName) {
        return Paths.get(System.getProperty("test.basepath")).resolve(testName);
    }

    void initializeLanguageServer(Path basePath) throws InterruptedException, ExecutionException, TimeoutException {
        var params = new InitializeParams();
        params.setRootUri(basePath.toUri().toString());

        WorkspaceFolder folder = new WorkspaceFolder(basePath.toUri().toString(), "Test Workspace");
        params.setWorkspaceFolders(Collections.singletonList(folder));

        var res = serverUnderTest.initialize(params).get(10, TimeUnit.SECONDS);
        serverUnderTest.initialized(new InitializedParams());
    }

    void shutdownLanguageServer() throws InterruptedException, ExecutionException, TimeoutException {
        serverUnderTest.shutdown().thenRun(() -> serverUnderTest.exit()).get(10, TimeUnit.SECONDS);
    }

    @BeforeEach
    void startLanguageServer() throws IOException, InterruptedException {
        boolean isWindows = System.getProperty("os.name").toLowerCase().startsWith("windows");

        ProcessBuilder builder = new ProcessBuilder();
        if (isWindows) {
            builder.command("cmd.exe", "/c", "bin\\ls.bat");
        } else {
            builder.command("sh", "-c", "bin/ls");
        }
        File folder = Paths.get(System.getProperty("ls.path")).toFile();
        builder.directory(folder);
        lsProc = builder.start();
        StreamGobbler stdErrRedirect = new StreamGobbler(lsProc.getErrorStream());
        stdErrRedirect.start();

        mockClient = new MockLanguageClient();
        Launcher<LanguageServer> launcher = LSPLauncher.createClientLauncher(mockClient, lsProc.getInputStream(), lsProc.getOutputStream());
        launcher.startListening();
        serverUnderTest = launcher.getRemoteProxy();
    }

    @AfterEach
    void terminateLanguageServerProcess() throws InterruptedException, TimeoutException, ExecutionException {
        shutdownLanguageServer();

        if (lsProc.isAlive()) {
            Thread.sleep(2000);
            if (lsProc.isAlive()) {
                lsProc.destroy();
            }
        }
    }

    class StreamGobbler extends Thread {
        InputStream is;

        // reads everything from is until empty.
        StreamGobbler(InputStream is) {
            this.is = is;
        }

        public void run() {
            try {
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr);
                String line=null;
                while ( (line = br.readLine()) != null)
                    System.out.println(line);
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }

}