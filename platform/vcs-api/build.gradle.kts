// Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
plugins {
  `java-library`
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
  maven("https://maven.atlassian.com/content/repositories/atlassian-public")
}

tasks {
  "compileJava"(JavaCompile::class) {
    options.encoding = "UTF-8"
  }
}

dependencies {
  api(project(":intellij.platform.ide"))
  api(project(":intellij.platform.vcs.core"))
  api(project(":intellij.platform.diff"))
  implementation(project(":intellij.platform.lang"))
  implementation("com.michaelbaranov", "microba", "0.4.4.3")
  implementation("one.util", "streamex", "0.6.7")
  implementation("org.jetbrains.intellij.deps", "jdom", "2.0.6")
}