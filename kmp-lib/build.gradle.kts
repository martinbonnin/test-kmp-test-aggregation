plugins {
  id("org.jetbrains.kotlin.multiplatform")
}

kotlin {
  jvm()
  macosArm64()

  sourceSets {
    getByName("commonTest") {
      dependencies {
        implementation("org.jetbrains.kotlin:kotlin-test")
      }
    }
  }
}