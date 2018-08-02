plugins {
  `java-library`
  kotlin("jvm") version "1.2.51"
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

tasks{
  "compileKotlin"(org.jetbrains.kotlin.gradle.tasks.KotlinCompile::class) {
    kotlinOptions.jvmTarget = "1.8"
  }
}

dependencies {
  api(project(":intellij.xml"))
  api(project(":intellij.xml.psi.impl"))
  api(project(":intellij.xml.analysis.impl"))
  api(project(":intellij.xml.structureView.impl"))

  implementation(project(":intellij.platform.debugger"))
  implementation(project(":intellij.platform.ide.impl"))
  implementation(project(":intellij.platform.lang.impl"))
  implementation(project(":intellij.platform.icons"))
  implementation(project(":intellij.platform.resources"))
  implementation(project(":intellij.platform.vcs"))
  implementation(project(":intellij.platform.vcs.impl"))
  implementation(project(":intellij.platform.builtInServer"))
  implementation("xerces", "xercesImpl", "2.11.0")
  implementation("org.apache.xmlbeans", "xmlbeans", "2.6.0")
  implementation("com.google.guava", "guava", "25.1-jre")
  implementation("org.swinglabs", "swingx-core", "1.6.2-2")
}
