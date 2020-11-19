package org.palladiosimulator.textual.tpcm.lsp;

import org.eclipse.lsp4j.*;
import org.eclipse.lsp4j.services.LanguageClient;

import java.nio.file.Paths;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.LinkedBlockingQueue;

public class MockLanguageClient implements LanguageClient {
    @Override
    public CompletableFuture<ApplyWorkspaceEditResponse> applyEdit(ApplyWorkspaceEditParams params) {
        return null;
    }

    @Override
    public CompletableFuture<Void> registerCapability(RegistrationParams params) {
        return null;
    }

    @Override
    public CompletableFuture<Void> unregisterCapability(UnregistrationParams params) {
        return null;
    }

    @Override
    public void telemetryEvent(Object o) {
    }

    public LinkedBlockingQueue<PublishDiagnosticsParams> publishedDiagnostics = new LinkedBlockingQueue<>();
    @Override
    public void publishDiagnostics(PublishDiagnosticsParams publishDiagnosticsParams) {
        publishedDiagnostics.add(publishDiagnosticsParams);
    }

    @Override
    public void showMessage(MessageParams messageParams) {
    }

    @Override
    public CompletableFuture<MessageActionItem> showMessageRequest(ShowMessageRequestParams showMessageRequestParams) {
        return null;
    }

    @Override
    public void logMessage(MessageParams messageParams) {
    }

    @Override
    public CompletableFuture<List<WorkspaceFolder>> workspaceFolders() {
        return null;
    }

    @Override
    public CompletableFuture<List<Object>> configuration(ConfigurationParams configurationParams) {
        return null;
    }

    @Override
    public void semanticHighlighting(SemanticHighlightingParams params) {
    }
}
