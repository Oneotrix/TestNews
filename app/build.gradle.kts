plugins {
    alias(core.plugins.androidApplication)
    alias(core.plugins.jetbrainsKotlinAndroid)
    alias(core.plugins.kotlin.serialization)
    alias(core.plugins.kotlin.kapt)
}

android {
    namespace = "com.oneotrix.testnews"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.oneotrix.testnews"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    kapt(storage.room.compiler)
    kapt(ioc.dagger.compiler)

    implementation(core.androidx.core.ktx)
    implementation(core.androidx.appcompat)
    implementation(core.material)
    implementation(core.androidx.activity)
    implementation(core.androidx.constraintlayout)

    implementation(core.navigation.ui)
    implementation(core.navigation.fragment)

    // Network
    implementation(network.okhttp)
    implementation(network.okhttp.loggingInterceptor)
    implementation(network.retrofit)
    implementation(network.retrofit.kotlinx.serialization)

    //Database
    implementation(storage.room.runtime)
    implementation(storage.room.ktx)

    //DI
    implementation(ioc.dagger.dagger)

    //Coroutine
    implementation(asynchronously.coroutines)

    // Serialization
    implementation(core.kotlinx.serializarion)

    testImplementation(test.junit)
    androidTestImplementation(test.androidx.junit)
    androidTestImplementation(test.androidx.espresso.core)
}