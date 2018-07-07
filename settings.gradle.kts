rootProject.name = "intellij.idea.community.main"

enableFeaturePreview("IMPROVED_POM_SUPPORT")

include(
  "intellij.platform.util.rt",
  "intellij.platform.resources.en",
  "intellij.platform.util"
)

project(":intellij.platform.util.rt").projectDir = file("platform/util-rt")
project(":intellij.platform.resources.en").projectDir = file("platform/platform-resources-en")
project(":intellij.platform.util").projectDir = file("platform/util")