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
  api(project(":intellij.java.indexing"))
  api(project(":intellij.java.analysis"))
  api(project(":intellij.java.psi"))
  api(project(":intellij.java.resources.en"))
  api(project(":intellij.platform.vcs"))
  api(project(":intellij.platform.lang"))
  api(project(":intellij.platform.ide"))
  api(project(":intellij.xml"))
  api(project(":intellij.platform.extensions"))
  api(project(":intellij.platform.util"))

  implementation(project(":intellij.xml.dom"))
  implementation(project(":intellij.java.guiForms.rt"))
  implementation(project(":intellij.platform.icons"))
  implementation("org.jetbrains.intellij.deps", "jdom", "2.0.6")
  implementation("org.jetbrains.intellij.deps", "trove4j", "1.0.20160824")
  implementation("be.cyberelf.nanoxml", "nanoxml", "2.2.3")
  implementation("com.jgoodies", "forms", "1.1-preview")
  implementation("org.apache.xmlrpc", "xmlrpc", "3.1.3")

  testImplementation("junit", "junit", "4.12")
  testImplementation("org.hamcrest", "hamcrest-core", "1.3")
}