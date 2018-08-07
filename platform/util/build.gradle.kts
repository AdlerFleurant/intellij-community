plugins {
  `java-library`
}

configure<JavaPluginConvention> {
  val sourceSet = sourceSets["main"]
  sourceSet.java.srcDirs.clear()
  sourceSet.java.srcDir("src")
  sourceSet.resources.srcDirs.clear()
}

dependencies {
  api(project(":intellij.platform.util.rt"))
  api(Dependencies.`jetbrains-annotations-java5`)
  api(Dependencies.Trove4j)

  implementation(project(":intellij.platform.resources.en"))
  implementation(Dependencies.jdom)
  implementation(Dependencies.Log4J)
  implementation(Dependencies.jna)
  implementation(Dependencies.OroMatcher)
  implementation(Dependencies.imgscalr)
  implementation(Dependencies.`xmlgraphics-commons`)
  implementation(Dependencies.batik)
  implementation(Dependencies.`lz4-java`)
  implementation(Dependencies.`xml-apis-ext`)
  implementation(Dependencies.`commons-compress`)

  compileOnly(Dependencies.Mac)
}