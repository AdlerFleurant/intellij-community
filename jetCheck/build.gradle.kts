// Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
plugins {
  `java-library`
  kotlin("jvm") version "1.2.51"
}

configure<JavaPluginConvention> {
  sourceCompatibility = JavaVersion.VERSION_1_10
  targetCompatibility = JavaVersion.VERSION_1_10

  val mainSourceSet = sourceSets["main"]
  mainSourceSet.java.srcDirs.clear()
  mainSourceSet.java.srcDir("src")
  mainSourceSet.resources.srcDirs.clear()

  val testSourceSet = sourceSets["test"]
  testSourceSet.java.srcDirs.clear()
  testSourceSet.resources.srcDirs.clear()
  testSourceSet.resources.srcDir("test")
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
  implementation(project(":intellij.platform.util"))
  implementation("org.jetbrains", "annotations-java5", "16.0.2")

  testImplementation("junit", "junit", "4.12")
  testImplementation("org.hamcrest", "hamcrest-core", "1.3")
}