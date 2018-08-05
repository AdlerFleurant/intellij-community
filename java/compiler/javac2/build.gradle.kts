plugins {
  `java-library`
}

configure<JavaPluginConvention> {
  sourceCompatibility = JavaVersion.VERSION_1_10
  targetCompatibility = JavaVersion.VERSION_1_10
}

dependencies {
  implementation(project(":intellij.java.guiForms.compiler"))
  implementation(project(":intellij.java.guiForms.rt"))
  implementation(project(":intellij.java.compiler.instrumentationUtil"))
  implementation(Dependencies.asm)

  compileOnly("org.apache.ant:ant:1.10.5")

  runtimeOnly(project(":intellij.java.compiler.instrumentationUtil.java8"))
}