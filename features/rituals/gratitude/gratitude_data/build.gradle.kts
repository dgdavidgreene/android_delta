apply {
    from("$rootDir/base-module.gradle")
}

apply {
    from("$rootDir/data-module.gradle")
}
dependencies {
    "implementation"(project(Modules.domain))
    "implementation"(project(Modules.gratitudeDomain))

    /*"implementation"(Retrofit.okHttp)
    "implementation"(Retrofit.retrofit)
    "implementation"(Retrofit.okHttpLoggingInterceptor)
    "implementation"(Retrofit.moshiConverter)

    "implementation"(SQLDelight.sqlDelightDriver)
    "implementation"(SQLDelight.sqlDelightCoroutines)*/
}