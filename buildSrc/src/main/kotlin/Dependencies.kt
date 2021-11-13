object Libs {
	const val androidGradlePlugin = "com.android.tools.build:gradle:7.0.3"
	const val material = "com.google.android.material:material:1.4.0"

	object Kotlin {
		private const val version = "1.5.31"
		const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"

	}

	object AndroidX {
		const val coreKtx = "androidx.core:core-ktx:1.7.0"
		const val appcompat = "androidx.appcompat:appcompat:1.3.1"

		object Compose {
			const val version = "1.0.5"
			const val material = "androidx.compose.material:material:$version"

			object UI {
				const val test = "androidx.compose.ui:ui-test:$version"
				const val testJunit4 = "androidx.compose.ui:ui-test-junit4:$version"
				const val testManifest = "androidx.compose.ui:ui-test-manifest:$version"
				const val tooling = "androidx.compose.ui:ui-tooling:$version"
				const val toolingPreview = "androidx.compose.ui:ui-tooling-preview:$version"
				const val ui = "androidx.compose.ui:ui:$version"
			}

		}

		object Lifecycle {
			private const val version = "2.4.0"
			const val runtimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:$version"
		}

		object Activity {
			private const val version = "1.4.0"
			const val compose = "androidx.activity:activity-compose:$version"
		}
	}
}