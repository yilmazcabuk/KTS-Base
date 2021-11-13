buildscript {
	repositories {
		google()
		mavenCentral()
	}
	dependencies {
		classpath(Libs.androidGradlePlugin)
		classpath(Libs.Kotlin.gradlePlugin)
	}
}

tasks.register("clean", Delete::class) {
	delete(rootProject.buildDir)
}