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
  api(project(":intellij.java.guiForms.rt"))
  api(project(":intellij.platform.util"))
  api(project(":intellij.platform.extensions"))
  api(project(":intellij.platform.core"))
  api(project(":intellij.platform.resources.en"))
  api(project(":intellij.platform.projectModel"))
  api(project(":intellij.platform.editor"))
  api(project(":intellij.platform.analysis"))
  api("com.jgoodies", "forms", "1.1-preview")

  implementation(project(":intellij.platform.bootstrap"))
  implementation(project(":intellij.platform.icons"))
  implementation(kotlin("reflect"))
  implementation(kotlin("stdlib-jdk8"))
  implementation("commons-codec", "commons-codec", "1.10")
  implementation("dk.brics", "automaton", "1.12-1")
  implementation("oro", "oro", "2.0.8")
  implementation("com.github.markusbernhardt", "proxy-vole", "1.0.4")
  implementation("com.google.guava", "guava", "25.1-jre")
  implementation("org.apache.httpcomponents", "httpclient", "4.5.5")
  implementation("net.java.dev.jna", "jna-platform", "4.5.0")
  implementation("org.jetbrains.intellij.deps", "ini4j", "0.5.5-2")
  implementation("org.jetbrains.intellij.deps", "jdom", "2.0.6")
  implementation("com.fasterxml.jackson.core", "jackson-core", "2.9.6")
  implementation("com.fasterxml.jackson.core", "jackson-databind", "2.9.6")
  implementation("com.fasterxml.jackson.core", "jackson-annotations", "2.9.6")
  implementation("io.netty", "netty-codec", "4.1.25.Final")
  implementation("io.netty", "netty-codec-http", "4.1.25.Final")
  implementation("org.javadelight", "delight-nashorn-sandbox", "0.1.15")
  implementation(rootProject.files("lib/pty4j-0.7.5.jar"))
}