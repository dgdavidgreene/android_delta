apply {
    from("$rootDir/compose-module.gradle")
}

dependencies {
    "implementation"(project(Modules.domain))
    "implementation"(project(Modules.ui))
    "implementation"(project(Modules.gratitudeDomain))

    "implementation"(Coil.coilCompose)
}
