# Use a base Java image
FROM openjdk:17-jdk-slim

# Create a working directory
WORKDIR /app

# Copy the jar file into the image
COPY target/*.jar app.jar

# Expose port
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]
