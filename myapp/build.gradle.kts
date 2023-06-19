import org.jetbrains.dokka.gradle.DokkaTaskPartial

plugins {
    kotlin("jvm") // Required for dokka to work
    id("java")
    id("application")
}

group = "xyz.sweet.myapp"

application {
    mainClass.set("xyz.sweet.myapp.Main")
}

dependencies {
    implementation(project(":mylib"))
}
