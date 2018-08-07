plugins {
  `java-library`
  kotlin("jvm")
}

dependencies {
  api(project(":intellij.platform.lang"))
  api(project(":intellij.platform.lang.impl"))
  api(project(":intellij.platform.ide.impl"))
  api(project(":intellij.platform.boot"))
  api(project(":intellij.platform.testFramework.core"))
  api(project(":intellij.java.rt"))
  api(Dependencies.JUnit4)
  api(Dependencies.Log4J)
  api(Dependencies.Groovy)
  api(Dependencies.jetCheck)

  implementation(project(":intellij.tools.testsBootstrap"))

  runtimeOnly(project(":intellij.platform.lvcs.impl"))
  runtimeOnly(project(":intellij.java.resources.en"))
  runtimeOnly(project(":intellij.platform.resources"))
  runtimeOnly(project(":intellij.xml.dom.impl"))
  runtimeOnly(project(":intellij.relaxng"))
  runtimeOnly(project(":intellij.platform.images"))
  runtimeOnly(project(":intellij.regexp"))
}