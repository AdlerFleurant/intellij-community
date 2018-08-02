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
  api(project(":intellij.xml.dom"))

  implementation(project(":intellij.xml.impl"))
  implementation(project(":intellij.platform.util"))
  implementation(project(":intellij.platform.ide"))
  implementation(project(":intellij.platform.ide.impl"))
  implementation(project(":intellij.platform.lang.impl"))
  implementation(project(":intellij.platform.lang"))
  implementation(project(":intellij.xml"))
  implementation(project(":intellij.platform.resources"))
  implementation(rootProject.files("lib/cglib-nodep-3.2.4.jar"))

}