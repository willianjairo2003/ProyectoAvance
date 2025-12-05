# Stage 1: build
# Usamos Gradle 8.10 con JDK 21 
FROM gradle:8.10-jdk21 AS build

WORKDIR /app

# Copiar archivos de Gradle y código fuente
COPY build.gradle.kts settings.gradle.kts gradlew ./
COPY gradle gradle
COPY src src

# Dar permisos de ejecución al wrapper
RUN chmod +x gradlew

# Construir el JAR
RUN ./gradlew clean build --no-daemon

# Stage 2: runtime
# Usamos Temurin JDK 21 Alpine para un contenedor liviano
FROM eclipse-temurin:21-jdk-alpine

WORKDIR /app

# Copiar el JAR desde el stage de build
COPY --from=build /app/build/libs/miaplicacion.jar app.jar

# Puerto que usa Spring Boot
EXPOSE 8082

# Ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]
