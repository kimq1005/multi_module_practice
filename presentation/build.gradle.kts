plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
//    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.example.presentation"
    compileSdk = 34

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
        externalNativeBuild {
            cmake {
                cppFlags("")
            }
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

//    buildFeatures {
//        buildConfig = true
//    }
//
//    flavorDimensions += "version"
//
//    productFlavors {
//        create("dev") {
//            buildConfigField("String" , "BaseUrl" , "\"www.this.dev\"")
//
//        }
//
//        create("prod") {
//            buildConfigField("String" , "BaseUrl" , "\"www.this.prod\"")
//        }
//    }

    externalNativeBuild {
        cmake {
            path("src/main/cpp/CMakeLists.txt")
            version = "3.22.1"
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }

    buildFeatures {
        compose = true
    }
}

dependencies {
    //project
    implementation(project(":domain"))

    implementation(libs.bundles.android)
    implementation(libs.monitor)
    androidTestImplementation(libs.bundles.androidTest)
    testImplementation(libs.junit)
    implementation(platform(libs.compose.bom))
    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)
    implementation(libs.bundles.compose)

}