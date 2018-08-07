plugins {
  `java-library`
}

configure<JavaPluginConvention> {
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
  implementation(Dependencies.jdom)
  implementation(Dependencies.Trove4j)
  implementation(Dependencies.NanoXML)
  implementation(Dependencies.`jgoodies-forms`)
  implementation(Dependencies.XmlRPC)

  testImplementation(Dependencies.JUnit4)
}