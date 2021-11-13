plugins {
	id("com.android.application")
	kotlin("android")
}

android {
	compileSdk = 31

	defaultConfig {
		applicationId = "com.valyriapps.ktsbase"
		minSdk = 21
		targetSdk = 31
		versionCode = 1
		versionName = "1.0"

		testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
		vectorDrawables {
			useSupportLibrary = true
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
	compileOptions {
		sourceCompatibility = JavaVersion.VERSION_1_8
		targetCompatibility = JavaVersion.VERSION_1_8
	}
	kotlinOptions {
		jvmTarget = "1.8"
	}
	buildFeatures {
		compose = true
	}
	composeOptions {
		kotlinCompilerExtensionVersion = Libs.AndroidX.Compose.version
	}
	packagingOptions {
		resources {
			excludes += "/META-INF/{AL2.0,LGPL2.1}"
		}
	}
}

dependencies {
	implementation(Libs.AndroidX.appcompat)
	implementation(Libs.AndroidX.coreKtx)
	implementation(Libs.AndroidX.Activity.compose)
	implementation(Libs.AndroidX.Compose.material)
	implementation(Libs.AndroidX.Compose.UI.test)
	implementation(Libs.AndroidX.Compose.UI.toolingPreview)
	implementation(Libs.AndroidX.Compose.UI.ui)
	implementation(Libs.AndroidX.Lifecycle.runtimeKtx)
	androidTestImplementation(Libs.AndroidX.Compose.UI.testJunit4)
	debugImplementation(Libs.AndroidX.Compose.UI.testManifest)
	debugImplementation(Libs.AndroidX.Compose.UI.tooling)
	debugImplementation(Libs.AndroidX.Compose.UI.toolingPreview)
}