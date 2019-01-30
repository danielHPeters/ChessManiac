group = "ch.peters.daniel"
version = "1.0"

plugins {
  java
  application
  groovy
}

application {
  applicationName = "chess"
  mainClassName = "${project.group}.$applicationName.App"
}

var currentOS = org.gradle.internal.os.OperatingSystem.current()!!
var platform = when {
  currentOS.isLinux -> "linux"
  currentOS.isWindows -> "win"
  currentOS.isMacOsX -> "mac"
  else -> ""
}

dependencies {
  implementation("org.openjfx:javafx-base:11:$platform")
  implementation("org.openjfx:javafx-graphics:11:$platform")
  implementation("org.openjfx:javafx-controls:11:$platform")
  implementation("com.google.guava:guava:23.0")
  testImplementation("org.codehaus.groovy:groovy-all:2.4.15")
  testImplementation("org.spockframework:spock-core:1.0-groovy-2.4")
  testImplementation("junit:junit:4.12")
}

repositories {
  jcenter()
}

java {
  sourceCompatibility = JavaVersion.VERSION_1_10
  targetCompatibility = JavaVersion.VERSION_1_10
}

tasks.withType<JavaCompile> {
  doFirst {
    options.compilerArgs = listOf(
      "--module-path", classpath.asPath,
      "--add-modules", "javafx.controls"
    )
  }
}
