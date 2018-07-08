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

repositories {
  jcenter()
  maven("http://dl.bintray.com/jetbrains/intellij-third-party-dependencies")
}

tasks {
  "compileJava"(JavaCompile::class) {
    options.encoding = "UTF-8"
  }

  "compileKotlin"(org.jetbrains.kotlin.gradle.tasks.KotlinCompile::class) {
    kotlinOptions.jvmTarget = "1.8"
  }
}

dependencies {
  implementation(project(":intellij.platform.core"))
  implementation(project(":intellij.platform.util"))
  implementation(project(":intellij.platform.projectModel"))
  implementation(project(":intellij.platform.indexing"))
  implementation("org.jetbrains", "annotations-java5", "16.0.2")
  implementation("org.jetbrains.intellij.deps", "jdom", "2.0.6")
  implementation(kotlin("reflect"))
  implementation(kotlin("stdlib-jdk8"))
}