plugins {
    kotlin("jvm") version "1.8.20" // Asegúrate de usar la versión adecuada
}

group = "com.example.calculadora"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.3")
}

tasks.test {
    useJUnitPlatform()
}
