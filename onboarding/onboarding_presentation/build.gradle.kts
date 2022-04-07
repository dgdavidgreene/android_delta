apply {
    from("$rootDir/compose-module.gradle")
}

dependencies {
    "implementation"(project(Modules.core))
    // "implementation"(project(Modules.coreUi))
    "implementation"(project(Modules.ui))
    "implementation"(project(Modules.onboardingDomain))
    "implementation"("androidx.window:window:1.0.0")
}