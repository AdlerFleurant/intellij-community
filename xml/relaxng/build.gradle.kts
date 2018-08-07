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
  implementation(project(":intellij.xml.impl"))
  implementation(project(":intellij.platform.lang"))
  implementation(project(":intellij.platform.lang.impl"))
  implementation(project(":intellij.xml.dom"))
  implementation("thaiopensource", "jing", "20030619")
  implementation("isorelax", "isorelax", "20030108")
  implementation(":rngom:20051226:patched")
  implementation(":trang-core:")
}