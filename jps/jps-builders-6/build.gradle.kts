plugins {
  `java-library`
}

dependencies {
  implementation(project(":intellij.platform.util.rt"))
  implementation(Dependencies.Trove4j)
  implementation(Dependencies.`jetbrains-annotations-java5`)
  implementation(Dependencies.Log4J)
  implementation(Dependencies.protobuf)
  implementation(Dependencies.`netty-codec-http`)

  runtimeOnly(":optimizedFileManager:")
}