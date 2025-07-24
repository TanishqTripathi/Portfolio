# Use Java 17 base image
FROM eclipse-temurin:17-jdk-alpine

# Set working directory inside container
WORKDIR /app

# Copy the built JAR file into the image
COPY target/Portfolio-website-0.0.1-SNAPSHOT.jar app.jar

# Expose Spring Boot's default port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
