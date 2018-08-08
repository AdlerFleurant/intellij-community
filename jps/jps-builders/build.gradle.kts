plugins {
  `java-library`
  kotlin("jvm")
}

dependencies {
  api(project(":intellij.platform.jps.build.javac.rt"))
  api(project(":intellij.platform.util"))
  api(Dependencies.asm)

  implementation(project(":intellij.java.guiForms.rt"))
  implementation(project(":intellij.java.guiForms.compiler"))
  implementation(project(":intellij.java.compiler.instrumentationUtil"))
  implementation(project(":intellij.java.aetherDependencyResolver"))
  implementation(project(":intellij.platform.jps.model"))
  implementation(project(":intellij.platform.jps.model.serialization"))
  implementation(project(":intellij.platform.jps.model.impl"))
  implementation(Dependencies.jdom)
  implementation(Dependencies.NanoXML)
  implementation(Dependencies.`jgoodies-forms`)
  implementation(Dependencies.protobuf)
  implementation(Dependencies.Log4J)
  implementation(Dependencies.Xerces)
  implementation(Dependencies.Guava)
  implementation(Dependencies.`netty-codec-http`)

  runtimeOnly(project(":intellij.java.rt"))
  runtimeOnly(project(":intellij.java.compiler.instrumentationUtil.java8"))

  testImplementation(project(":intellij.java.testFramework"))
  testImplementation(project(":intellij.platform.jps.model.serialization.tests"))
  testImplementation(kotlin("reflect"))
  testImplementation(kotlin("stdlib-jdk8"))
  testImplementation(kotlin("test"))
  testImplementation(Dependencies.JUnit4)
  testImplementation(Dependencies.Eclipse)
}