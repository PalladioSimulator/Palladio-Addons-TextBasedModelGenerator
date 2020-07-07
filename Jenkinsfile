@Library('MDSD.tools@single_artifact_deploy') _
PalladioPipeline {
    deployUpdatesite 'releng/org.palladiosimulator.textual.updatesite/target/repository'
    deploySonatype {
        singleArtifactDeploy true
        gpgId = '6819ab28-7bb8-4f24-b687-67f014150f9c'
        settingsId = 'fc491284-5a6e-46de-a386-0c3de60e715a'
    }
    skipDeploy false
}