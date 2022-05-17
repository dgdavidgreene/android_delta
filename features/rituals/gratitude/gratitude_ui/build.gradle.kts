apply {
    from("$rootDir/compose-module.gradle")
}

dependencies {
    "implementation"(project(Modules.core))
    "implementation"(project(Modules.ui))
    "implementation"(project(Modules.gratitude_domain))

    "implementation"(Coil.coilCompose)
}