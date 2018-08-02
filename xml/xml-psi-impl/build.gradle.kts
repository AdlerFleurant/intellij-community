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
  api(project(":intellij.xml.psi"))
  api(project(":intellij.regexp"))

  implementation(project(":intellij.platform.core"))
  implementation(project(":intellij.platform.core.impl"))
  implementation(project(":intellij.platform.analysis.impl"))
  implementation(project(":intellij.platform.projectModel.impl"))
  implementation(project(":intellij.platform.indexing.impl"))
  implementation(project(":intellij.platform.lang"))
  implementation("xerces", "xercesImpl", "2.11.0")
  implementation("org.apache.xmlbeans", "xmlbeans", "2.6.0")
  implementation("xml-resolver", "xml-resolver", "1.2")
}