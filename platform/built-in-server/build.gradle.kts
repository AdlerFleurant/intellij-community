plugins {
  `java-library`
  kotlin("jvm") version Versions.`kotlin-jvm`
}

tasks {
  "compileKotlin"(org.jetbrains.kotlin.gradle.tasks.KotlinCompile::class) {
    kotlinOptions.jvmTarget = "1.8"
  }
}

dependencies {
  api(project(":intellij.platform.builtInServer"))

  implementation(project(":intellij.platform.projectModel"))
  implementation(project(":intellij.platform.projectModel.impl"))
  implementation(project(":intellij.platform.ide.impl"))
  implementation(project(":intellij.xml"))
  implementation(project(":intellij.platform.debugger"))
  implementation(project(":intellij.platform.vcs"))
  implementation(kotlin("reflect"))
  implementation(kotlin("stdlib-jdk8"))
  implementation(Dependencies.Guava)
  implementation(Dependencies.gson)
  implementation(Dependencies.XmlRPC)
  implementation(Dependencies.`commons-imaging`)
  implementation(Dependencies.`netty-codec-http`)
  implementation(Dependencies.`netty-handler`)

  testImplementation(project(":intellij.platform.testFramework"))
}