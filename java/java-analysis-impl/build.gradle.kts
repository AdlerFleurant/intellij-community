plugins {
  `java-library`
  kotlin("jvm") version Versions.`kotlin-jvm`
}

configure<JavaPluginConvention> {
  sourceCompatibility = JavaVersion.VERSION_1_10
  targetCompatibility = JavaVersion.VERSION_1_10

  val sourceSet = sourceSets["main"]
  sourceSet.java.srcDir("${rootProject.rootDir}/plugins/InspectionGadgets/InspectionGadgetsAnalysis/src/main/java")
  sourceSet.resources.srcDir("${rootProject.rootDir}/plugins/InspectionGadgets/InspectionGadgetsAnalysis/src/main/resources")
}

tasks {
  "compileKotlin"(org.jetbrains.kotlin.gradle.tasks.KotlinCompile::class) {
    kotlinOptions.jvmTarget = "1.8"
  }
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