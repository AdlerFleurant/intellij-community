plugins {
  `java-library`
}

configure<JavaPluginConvention> {
  sourceCompatibility = JavaVersion.VERSION_1_10
  targetCompatibility = JavaVersion.VERSION_1_10

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
  implementation("jaxen", "jaxen", "1.1.6")

  runtimeOnly(project(":intellij.xml.dom.impl"))
  runtimeOnly(project(":intellij.relaxng"))
  runtimeOnly(project(":intellij.spellchecker"))
  runtimeOnly(project(":intellij.platform.debugger.impl"))
}