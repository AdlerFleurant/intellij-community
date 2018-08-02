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

dependencies {
  implementation(project(":intellij.xml.structureView"))
  implementation(project(":intellij.xml.psi.impl"))
  implementation(project(":intellij.platform.structureView.impl"))
  implementation(project(":intellij.platform.core.impl"))
}

