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
  api(project(":intellij.platform.core"))
  api(project(":intellij.platform.util"))
  api(project(":intellij.platform.extensions"))
  api(project(":intellij.platform.analysis"))
  api(project(":intellij.xml.psi"))
  api("org.jetbrains", "annotations-java5", "16.0.2")
}