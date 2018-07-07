plugins {
  `java-library`
}

configure<JavaPluginConvention> {
  sourceCompatibility = JavaVersion.VERSION_1_9
  targetCompatibility = JavaVersion.VERSION_1_9

  val sourceSet = sourceSets["main"]
  sourceSet.java.srcDirs.clear()
  sourceSet.java.srcDir("src")
  sourceSet.resources.srcDirs.clear()
}

repositories {
  jcenter()
  maven("http://dl.bintray.com/jetbrains/intellij-third-party-dependencies")
}

tasks {
  "compileJava"(JavaCompile::class) {
    options.encoding = "UTF-8"
  }
}

dependencies {
  api(project(":intellij.platform.util.rt"))
  api("org.jetbrains", "annotations-java5", "16.0.2")
  api("org.jetbrains.intellij.deps", "trove4j", "1.0.20160824")

  implementation(project(":intellij.platform.resources.en"))
  implementation("org.jetbrains.intellij.deps", "jdom", "2.0.6")
  implementation("log4j", "log4j", "1.2.17")
  implementation("net.java.dev.jna", "jna-platform", "4.5.0")
  implementation("oro", "oro", "2.0.8")
  implementation("org.imgscalr", "imgscalr-lib", "4.2")
  implementation("org.apache.xmlgraphics", "xmlgraphics-commons", "2.3")
  implementation("org.apache.xmlgraphics", "batik-all", "1.10")
  implementation("net.jpountz.lz4", "lz4", "1.3.0")
  implementation("xml-apis", "xml-apis-ext", "1.3.04")
  implementation("org.apache.commons", "commons-compress", "1.16.1")

  compileOnly(rootProject.files("lib/eawtstub.jar"))
}