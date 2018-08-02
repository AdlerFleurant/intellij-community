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
  sourceSet.resources.srcDir("resources")
}

dependencies {
  api(project(":intellij.xml.analysis"))

  implementation(project(":intellij.xml.psi.impl"))
  implementation(project(":intellij.platform.analysis.impl"))
  implementation(project(":intellij.platform.core.impl"))
  implementation(project(":intellij.platform.projectModel"))
}
