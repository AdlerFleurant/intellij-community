plugins {
  `java-library`
  kotlin("jvm")
}

configure<JavaPluginConvention> {
  val sourceSet = sourceSets["main"]
  sourceSet.java.srcDir("${rootProject.rootDir}/plugins/InspectionGadgets/InspectionGadgetsAnalysis/src/main/java")
  sourceSet.resources.srcDir("${rootProject.rootDir}/plugins/InspectionGadgets/InspectionGadgetsAnalysis/src/main/resources")
}

dependencies {
  api(project(":intellij.platform.analysis.impl"))
  api(project(":intellij.java.indexing.impl"))
  api(project(":intellij.java.psi.impl"))
  api(project(":intellij.platform.projectModel.impl"))
  api(project(":intellij.java.analysis"))
  api(Dependencies.asm)

  implementation(project(":intellij.java"))
  implementation(project(":intellij.java.resources.en"))
  implementation(project(":intellij.xml.psi.impl"))
  implementation(project(":intellij.platform.ide"))
  implementation(kotlin("reflect"))
  implementation(kotlin("stdlib-jdk8"))
  implementation(Dependencies.StreamEx)

  runtimeOnly(project(":intellij.jvm.analysis.impl"))
}