apply {
    from("$rootDir/base-module.gradle")
    //from("sqldelight.database.gradle")
}

dependencies {
    "implementation"(project(Modules.core))
    "implementation"(project(Modules.gratitude_domain))

    "implementation"(Retrofit.okHttp)
    "implementation"(Retrofit.retrofit)
    "implementation"(Retrofit.okHttpLoggingInterceptor)
    "implementation"(Retrofit.moshiConverter)

    "kapt"(Room.roomCompiler)
    "implementation"(Room.roomKtx)
    "implementation"(Room.roomRuntime)

    "implementation"(SQLDelight.androidDriver)
}