plugins {
  `java-library`
}

configure<JavaPluginConvention> {
  sourceCompatibility = JavaVersion.VERSION_1_10
  targetCompatibility = JavaVersion.VERSION_1_10

  val mainSourceSet = sourceSets["main"]
  mainSourceSet.java.srcDirs.clear()
  mainSourceSet.java.srcDir("src")
  mainSourceSet.resources.srcDirs.clear()

  val testSourceSet = sourceSets["test"]
  testSourceSet.java.srcDirs.clear()
  testSourceSet.java.srcDir("testSrc")
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
  implementation("com.thoughtworks.xstream", "xstream", "1.4.10")
  implementation("xmlpull", "xmlpull", "1.1.3.1")
  implementation("xpp3", "xpp3_min", "1.1.4c")
  implementation("org.jetbrains.intellij.deps", "jdom", "2.0.6")
  implementation("org.picocontainer", "picocontainer", "1.2")
  implementation(project(":intellij.platform.util"))

  testImplementation("junit", "junit", "4.12")
  testImplementation("org.hamcrest", "hamcrest-core", "1.3")
  testImplementation("xerces", "xercesImpl", "2.11.0")
  testImplementation("org.assertj", "assertj-core", "3.9.1")
}