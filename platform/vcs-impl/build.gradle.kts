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
  sourceSet.resources.srcDir("resources")
}

repositories {
  jcenter()
  maven("http://dl.bintray.com/jetbrains/intellij-third-party-dependencies")
}

tasks{
  "compileKotlin"(org.jetbrains.kotlin.gradle.tasks.KotlinCompile::class) {
    kotlinOptions.jvmTarget = "1.8"
  }
}

dependencies {
  api(project(":intellij.platform.vcs"))
  api(project(":intellij.platform.diff.impl"))
  api(project(":intellij.platform.ide.impl"))

  implementation(project(":intellij.platform.lang"))
  implementation(project(":intellij.platform.lang.impl"))
  implementation(project(":intellij.platform.ide"))
  implementation(project(":intellij.platform.jps.model.serialization"))
  implementation(project(":intellij.platform.vcs.log"))
  implementation("commons-codec", "commons-codec", "1.10")
  implementation("com.google.guava", "guava", "25.1-jre")
  implementation("com.google.code.gson", "gson", "2.8.5")
  implementation("org.swinglabs", "swingx-core", "1.6.2-2")
  implementation("com.miglayout", "miglayout-swing", "5.1")

  testImplementation("junit", "junit", "4.12")
  //  testImplementation(project(":intellij.platform.testFramework"))
}