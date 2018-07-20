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

tasks {
  "compileKotlin"(org.jetbrains.kotlin.gradle.tasks.KotlinCompile::class) {
    kotlinOptions.jvmTarget = "1.8"
  }
}

dependencies {
  api(project(":intellij.platform.externalSystem.rt"))

  implementation(project(":intellij.platform.util"))
  implementation(project(":intellij.platform.projectModel"))
  implementation(project(":intellij.java.compiler"))
  implementation(project(":intellij.platform.lang"))
  implementation(project(":intellij.platform.ide"))
  implementation(kotlin("reflect"))
  implementation(kotlin("stdlib-jdk8"))
  implementation("org.jetbrains.intellij.deps", "jdom", "2.0.6")
  implementation("de.ruedigermoeller", "fst", "2.57")

  runtimeOnly("com.fasterxml.jackson.core", "jackson-core", "2.9.6")
  runtimeOnly("com.fasterxml.jackson.core", "jackson-databind", "2.9.6")
  runtimeOnly("com.fasterxml.jackson.core", "jackson-annotations", "2.9.6")
  runtimeOnly("org.objenesis", "objenesis", "2.6")
  runtimeOnly("org.javassist", "javassist", "3.23.1-GA")
}