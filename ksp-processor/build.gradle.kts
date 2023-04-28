plugins {
    kotlin("multiplatform")
}

kotlin {
    jvm {
        jvmToolchain(11)
    }
    sourceSets {
        val jvmMain by getting {
            dependencies {
                implementation("com.squareup:kotlinpoet:1.12.0")
                implementation("com.squareup:kotlinpoet-ksp:1.12.0")
                implementation("com.google.devtools.ksp:symbol-processing-api:1.8.10-1.0.9")
            }
        }
        val jvmTest by getting
    }
}
