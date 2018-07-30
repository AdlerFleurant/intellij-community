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
}

tasks {
  "compileJava"(JavaCompile::class){
    options.compilerArgs.addAll(listOf("--add-exports", "java.desktop/sun.awt=ALL-UNNAMED",
                                       "--add-exports", "java.desktop/sun.font=ALL-UNNAMED"))
  }

  "compileKotlin"(org.jetbrains.kotlin.gradle.tasks.KotlinCompile::class) {
    kotlinOptions.jvmTarget = "1.8"
  }
}

dependencies {
  api(project(":intellij.platform.diff"))

  implementation(project(":intellij.platform.core"))
  implementation(project(":intellij.platform.ide"))
  implementation(project(":intellij.platform.ide.impl"))
  implementation(project(":intellij.platform.vcs.core"))
  implementation(project(":intellij.platform.vcs"))
  implementation(project(":intellij.platform.lang"))
  implementation("com.google.guava", "guava", "25.1-jre")
}