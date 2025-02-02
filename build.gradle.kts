buildscript {
    dependencies {
        // Firebase Google services plugin dependency
        classpath("com.google.gms:google-services:4.3.15")
    }
}

plugins {
    id("com.android.application") version "8.1.0" apply false
    id("org.jetbrains.kotlin.android") version "1.9.10" apply false
}
