subprojects {
  if (this.plugins.hasPlugin("java")) {
    dependencies {
      "compile"("org.jetbrains", "annotations-java5", "16.0.2")
      "runtimeOnly"("com.jgoodies", "jgoodies.common", "1.4.0")
      "runtimeOnly"("commons-net", "commons-net", "3.6")
    }
  }
}

tasks{
  "wrapper"(Wrapper::class){
    gradleVersion = "4.8.1"
  }
}
