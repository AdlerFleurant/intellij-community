plugins {
  `java-library`
  kotlin("jvm") version "1.2.51"
}

configure<JavaPluginConvention> {
  sourceCompatibility = JavaVersion.VERSION_1_10
  targetCompatibility = JavaVersion.VERSION_1_10
}

tasks {
  "compileJava"(JavaCompile::class) {
    options.compilerArgs.addAll(listOf("--add-modules=java.corba"))
  }

  "compileKotlin"(org.jetbrains.kotlin.gradle.tasks.KotlinCompile::class) {
    kotlinOptions.jvmTarget = "1.8"
  }
}

dependencies {
  api(project(":intellij.platform.lang"))
  api(project(":intellij.platform.lang.impl"))
  api(project(":intellij.platform.ide.impl"))
  api(project(":intellij.platform.boot"))
  api(project(":intellij.platform.testFramework.core"))
  api(project(":intellij.java.rt"))
  api("junit", "junit", "4.12")
  api("log4j", "log4j", "1.2.17")
  api("org.codehaus.groovy", "groovy-all", "2.4.15")
  api("com.github.jetbrains", "jetCheck", "0.1")

  implementation(project(":intellij.tools.testsBootstrap"))

  runtimeOnly(project(":intellij.platform.lvcs.impl"))
  runtimeOnly(project(":intellij.java.resources.en"))
  runtimeOnly(project(":intellij.platform.resources"))
  runtimeOnly(project(":intellij.xml.dom.impl"))
  runtimeOnly(project(":intellij.relaxng"))
  runtimeOnly(project(":intellij.platform.images"))
  runtimeOnly(project(":intellij.regexp"))
}