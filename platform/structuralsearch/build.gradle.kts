plugins {
  `java-library`
}

configure<JavaPluginConvention> {
  val sourceSet = sourceSets["main"]
  sourceSet.java.srcDirs.clear()
  sourceSet.java.srcDir("source")
  sourceSet.resources.srcDirs.clear()
  sourceSet.resources.srcDir("resources")
}

dependencies {
  implementation(project(":intellij.platform.util"))
  implementation(project(":intellij.xml.impl"))
  implementation(project(":intellij.platform.ide"))
  implementation(project(":intellij.platform.lang"))
  implementation(project(":intellij.java"))
  implementation(project(":intellij.platform.duplicates.analysis"))
  implementation(project(":intellij.platform.lang.impl"))
  implementation(Dependencies.jdom)
  implementation(Dependencies.Trove4j)
  implementation(Dependencies.Groovy)
}