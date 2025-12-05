# Stage 1: Construir la app
FROM gradle:9.6-jdk23-alpine AS build

WORKDIR /app

# Copiar archivos de Gradle y código fuente
COPY build.gradle.kts settings.gradle.kts gradlew ./
COPY gradle gradle
COPY src src

# Construir el JAR
RUN ./gradlew clean build --no-daemon

# Stage 2: Imagen ligera para ejecutar
FROM eclipse-temurin:23-jdk-alpine

WORKDIR /app

# Copiar el JAR desde el stage de build
COPY --from=build /app/build/libs/miaplicacion.jar app.jar

# puerto que usa Spring Boot
EXPOSE 8082

# Ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]
