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
  sourceSet.java.srcDir("gen")
  sourceSet.resources.srcDirs.clear()
  sourceSet.resources.srcDir("resources")
}

tasks {
  "compileJava"(JavaCompile::class) {
    options.compilerArgs.addAll(listOf("--add-modules=java.corba"))
  }

  "compileKotlin"(org.jetbrains.kotlin.gradle.tasks.KotlinCompile::class) {
    kotlinOptions.jvmTarget = "1.8"
  }
}

dependencies {
  api(project(":intellij.platform.lang"))
  api(project(":intellij.platform.usageView"))
  api(project(":intellij.platform.indexing.impl"))
  api(project(":intellij.platform.projectModel.impl"))
  api(project(":intellij.platform.analysis.impl"))
  api(project(":intellij.platform.structureView.impl"))
  api(project(":intellij.platform.ide.impl"))

  implementation(project(":intellij.platform.vcs"))
  implementation(project(":intellij.platform.indexing"))
  implementation(project(":intellij.platform.jps.model.impl"))
  implementation(project(":intellij.platform.diff.impl"))
  implementation(project(":intellij.platform.builtInServer"))
  implementation(project(":intellij.platform.boot"))
  implementation("oro", "oro", "2.0.8")
  implementation("org.apache.velocity", "velocity", "1.7")
  implementation("com.github.spullara.cli-parser", "cli-parser", "1.1.2")
  implementation("org.swinglabs", "swingx-core", "1.6.2-2")
  implementation("com.google.guava", "guava", "25.1-jre")
  implementation("com.google.code.gson", "gson", "2.8.5")
  implementation("commons-logging", "commons-logging", "1.2")
  implementation("org.codehaus.groovy", "groovy-all", "2.4.15")
  implementation("com.thoughtworks.xstream", "xstream", "1.4.10")
  implementation("com.miglayout", "miglayout-swing", "5.1")
  implementation("net.java.dev.jna", "jna-platform", "4.5.0")
  implementation("net.jpountz.lz4", "lz4", "1.3.0")
}