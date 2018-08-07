plugins {
  `java-library`
}

dependencies {
  implementation(project(":intellij.java.guiForms.compiler"))
  implementation(project(":intellij.java.guiForms.rt"))
  implementation(project(":intellij.java.compiler.instrumentationUtil"))
  implementation(Dependencies.asm)

  compileOnly(Dependencies.ant)

  runtimeOnly(project(":intellij.java.compiler.instrumentationUtil.java8"))
}