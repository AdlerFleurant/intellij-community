plugins {
  `java-library`
  kotlin("jvm")
}

configure<JavaPluginConvention> {
  val sourceSet = sourceSets["main"]
  sourceSet.java.srcDirs.clear()
  sourceSet.java.srcDir("src")
  sourceSet.resources.srcDirs.clear()
  sourceSet.resources.srcDir("resources")
}

dependencies {
  api(project(":intellij.xml"))
  api(project(":intellij.xml.psi.impl"))
  api(project(":intellij.xml.analysis.impl"))
  api(project(":intellij.xml.structureView.impl"))

  implementation(project(":intellij.platform.debugger"))
  implementation(project(":intellij.platform.ide.impl"))
  implementation(project(":intellij.platform.lang.impl"))
  implementation(project(":intellij.platform.icons"))
  implementation(project(":intellij.platform.resources"))
  implementation(project(":intellij.platform.vcs"))
  implementation(project(":intellij.platform.vcs.impl"))
  implementation(project(":intellij.platform.builtInServer"))
  implementation(Dependencies.Xerces)
  implementation(Dependencies.XmlBeans)
  implementation(Dependencies.Guava)
  implementation(Dependencies.swingx)
}
