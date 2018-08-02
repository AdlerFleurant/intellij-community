plugins {
  `java-library`
}

configure<JavaPluginConvention> {
  sourceCompatibility = JavaVersion.VERSION_1_10
  targetCompatibility = JavaVersion.VERSION_1_10

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
  implementation("org.jetbrains.intellij.deps", "jdom", "2.0.6")
  implementation("org.jetbrains.intellij.deps", "trove4j", "1.0.20160824")
  implementation("org.codehaus.groovy", "groovy-all", "2.4.15")
}