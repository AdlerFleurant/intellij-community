plugins {
  java
}

configure<JavaPluginConvention> {
  sourceCompatibility = JavaVersion.VERSION_1_6
  targetCompatibility = JavaVersion.VERSION_1_6

  val sourceSet = sourceSets["main"]
  sourceSet.java.srcDirs.clear()
  sourceSet.java.srcDir("src")
  sourceSet.resources.srcDirs.clear()
}

repositories {
  jcenter()
}

dependencies {
  implementation("org.jetbrains", "annotations-java5", "16.0.2")
  runtimeOnly("com.jgoodies", "jgoodies.common", "1.4.0")
  runtimeOnly("commons-net", "commons-net", "3.6")
}