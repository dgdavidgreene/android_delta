apply {
    from("$rootDir/base-module.gradle")
}

dependencies {
    "implementation"(project(Modules.domain))
    "implementation"(Coroutines.coroutines)
}
666