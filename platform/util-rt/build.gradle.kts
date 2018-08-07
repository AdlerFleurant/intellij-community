plugins {
  java
}

configure<JavaPluginConvention> {
  val sourceSet = sourceSets["main"]
  sourceSet.java.srcDirs.clear()
  sourceSet.java.srcDir("src")
  sourceSet.resources.srcDirs.clear()
}

repositories {
  jcenter()
}

dependencies {
  implementation(Dependencies.`jetbrains-annotations-java5`)
  runtimeOnly(Dependencies.`jgoodies-common`)
  runtimeOnly(Dependencies.`commons-net`)
}