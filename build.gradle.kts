import org.jetbrains.dokka.gradle.DokkaTaskPartial

plugins {
    kotlin("jvm") version "1.8.20"
    id("org.jetbrains.dokka") version "1.8.20"
}

allprojects {
    repositories {
        mavenCentral()
    }
}

subprojects {
    apply(plugin = "org.jetbrains.dokka")

    tasks.withType<DokkaTaskPartial>().configureEach {
        dokkaSourceSets {
            configureEach {
                includes.from("README.md")
            }
        }
    }
}

tasks.dokkaHtmlMultiModule {
    moduleName.set("My Project")
    outputDirectory.set(file("$rootDir/docs"))
}
