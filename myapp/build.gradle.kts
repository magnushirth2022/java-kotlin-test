plugins {
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
