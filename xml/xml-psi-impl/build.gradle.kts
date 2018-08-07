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
  api(project(":intellij.xml.psi"))
  api(project(":intellij.regexp"))

  implementation(project(":intellij.platform.core"))
  implementation(project(":intellij.platform.core.impl"))
  implementation(project(":intellij.platform.analysis.impl"))
  implementation(project(":intellij.platform.projectModel.impl"))
  implementation(project(":intellij.platform.indexing.impl"))
  implementation(project(":intellij.platform.lang"))
  implementation(Dependencies.Xerces)
  implementation(Dependencies.XmlBeans)
  implementation(Dependencies.`xml-resolver`)
}