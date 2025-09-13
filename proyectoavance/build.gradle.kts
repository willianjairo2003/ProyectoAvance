plugins {
    java
    id("org.springframework.boot") version "3.5.5"
    id("io.spring.dependency-management") version "1.1.7"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
description = "Demo project for Spring Boot"

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(23))
    }
}

repositories {
    mavenCentral()
}

dependencies {
    // Jetty en lugar de Tomcat
    implementation("org.springframework.boot:spring-boot-starter-jetty")

    // Thymeleaf para vistas
    implementation("org.springframework.boot:spring-boot-starter-thymeleaf")

    // Web (REST + MVC)
    implementation("org.springframework.boot:spring-boot-starter-web")

    // Dependencias para test
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

// Configurar nombre del JAR
tasks.withType<org.springframework.boot.gradle.tasks.bundling.BootJar> {
    archiveFileName.set("miaplicacion.jar")
}

// Configuración para tests
tasks.withType<Test> {
    useJUnitPlatform()
}
