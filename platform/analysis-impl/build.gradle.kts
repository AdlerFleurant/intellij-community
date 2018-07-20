plugins {
  `java-library`
  kotlin("jvm") version "1.2.51"
}

configure<JavaPluginConvention> {
  sourceCompatibility = JavaVersion.VERSION_1_10
  targetCompatibility = JavaVersion.VERSION_1_10

  val sourceSet = sourceSets["main"]
  sourceSet.java.srcDirs.clear()
  sourceSet.java.srcDir("src")
  sourceSet.resources.srcDirs.clear()
}

tasks {
  "compileKotlin"(org.jetbrains.kotlin.gradle.tasks.KotlinCompile::class) {
    kotlinOptions.jvmTarget = "1.8"
  }
}

dependencies {
  api(project(":intellij.platform.analysis"))
  api(project(":intellij.platform.projectModel.impl"))
  api(project(":intellij.platform.core.impl"))

  implementation(project(":intellij.platform.util"))
  implementation(project(":intellij.platform.extensions"))
  implementation(project(":intellij.platform.core"))
  implementation(project(":intellij.platform.indexing.impl"))
  implementation(project(":intellij.java.resources.en"))
  implementation(project(":intellij.platform.editor.ex"))
  implementation(project(":intellij.platform.externalSystem"))
  implementation(kotlin("reflect"))
  implementation(kotlin("stdlib-jdk8"))
  implementation("org.jetbrains.intellij.deps", "jdom", "2.0.6")

}