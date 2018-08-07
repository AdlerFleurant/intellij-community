dependencies {
  "api"(project(":uast:uast-common"))
  
  "implementation"(project(":intellij.java.psi"))
  "implementation"(project(":intellij.java.psi.impl"))
  "implementation"(kotlin("reflect"))
  "implementation"(kotlin("stdlib-jdk8"))
}