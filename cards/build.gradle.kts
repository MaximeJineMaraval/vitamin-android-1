plugins {
    id("com.android.library")
    id("kotlin-android")
    id("com.vanniktech.maven.publish")
    id("VitaminLibraryPlugin")
}

dependencies {
    api(project(":foundation:foundation"))
}
