plugins {
  `java-library`
  kotlin("jvm") version "1.2.51"
}

configure<JavaPluginConvention> {
  sourceCompatibility = JavaVersion.VERSION_1_10
  targetCompatibility = JavaVersion.VERSION_1_10

  val sourceSet = sourceSets["main"]
  sourceSet.java.srcDir("gen")
  sourceSet.java.srcDir("${rootProject.rootDir}/plugins/InspectionGadgets/src/main/java")
  sourceSet.resources.srcDir("${rootProject.rootDir}/plugins/InspectionGadgets/src/main/resources")
  sourceSet.java.srcDir("${rootProject.rootDir}/plugins/IntentionPowerPak/src/main/java")
  sourceSet.resources.srcDir("${rootProject.rootDir}/plugins/IntentionPowerPak/src/main/resources")
  sourceSet.java.srcDir("${rootProject.rootDir}/plugins/generate-tostring/src/main/java")
  sourceSet.resources.srcDir("${rootProject.rootDir}/plugins/generate-tostring/src/main/resources")
}

tasks {
  "compileJava"(JavaCompile::class) {
    options.compilerArgs.addAll(listOf("--add-exports", "jdk.compiler/com.sun.tools.doclint=ALL-UNNAMED"))
  }

  "compileKotlin"(org.jetbrains.kotlin.gradle.tasks.KotlinCompile::class) {
    kotlinOptions.jvmTarget = "1.8"
  }
}

dependencies {
  api(project(":intellij.java.structureView"))
  api(project(":intellij.java.analysis.impl"))
  api(project(":intellij.java.indexing.impl"))
  api(project(":intellij.java.psi.impl"))
  api(project(":intellij.platform.lang.impl"))

  implementation(project(":intellij.platform.util"))
  implementation(project(":intellij.java"))
  implementation(project(":intellij.xml.impl"))
  implementation(project(":intellij.java.rt"))
  implementation(project(":intellij.jsp"))
  implementation(project(":intellij.jsp.spi"))
  implementation(project(":intellij.java.execution"))
  implementation(project(":intellij.xml.dom"))
  implementation(project(":intellij.xml.dom.impl"))
  implementation(project(":intellij.platform.vcs.impl"))
  implementation(project(":intellij.platform.icons"))
  implementation(project(":intellij.regexp"))
  implementation(project(":intellij.java.indexing"))
  implementation(project(":intellij.platform.jps.model.impl"))
  implementation(project(":intellij.platform.externalSystem"))
  implementation(project(":intellij.spellchecker"))
  implementation(project(":intellij.platform.builtInServer.impl"))
  implementation(project(":uast:uast-java"))
  implementation(project(":intellij.java.compiler"))
  implementation(Dependencies.nekohtml)
  implementation(Dependencies.Trove4j)
  implementation(Dependencies.OroMatcher)
  implementation(Dependencies.jcip)
  implementation(Dependencies.Guava)
  implementation(Dependencies.Xerces)
  implementation(Dependencies.Velocity)
  implementation(Dependencies.gson)
  implementation(Dependencies.`netty-codec-http`)
  implementation("javax.xml.bind:jaxb-api:2.3.0")
  implementation(Dependencies.activation)
  implementation(":wadl-core:")
}