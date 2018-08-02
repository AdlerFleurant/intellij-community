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
  api(project(":intellij.platform.indexing"))
  api(project(":intellij.platform.util"))
  api(project(":intellij.platform.extensions"))
  api(project(":intellij.platform.analysis.impl"))
  api(project(":intellij.platform.projectModel"))
  api(project(":intellij.platform.projectModel.impl"))
  api("org.jetbrains", "annotations-java5", "16.0.2")
  implementation("com.thoughtworks.xstream", "xstream", "1.4.10")
}