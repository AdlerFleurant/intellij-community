plugins {
  `java-library`
}

configure<JavaPluginConvention> {
  val sourceSet = sourceSets["main"]
  sourceSet.java.srcDirs.clear()
  sourceSet.java.srcDir("src")
  sourceSet.java.srcDir("gen")
  sourceSet.resources.srcDirs.clear()
  sourceSet.resources.srcDir("resources")
}

dependencies {
  implementation(project(":intellij.platform.lang"))
  implementation(project(":intellij.platform.lang.impl"))
  implementation(project(":intellij.xml.psi"))
  implementation(Dependencies.Jaxen)

  runtimeOnly(project(":intellij.xml.dom.impl"))
  runtimeOnly(project(":intellij.relaxng"))
  runtimeOnly(project(":intellij.spellchecker"))
  runtimeOnly(project(":intellij.platform.debugger.impl"))
}