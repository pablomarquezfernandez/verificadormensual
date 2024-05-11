# Use an official Maven image as the base image
FROM maven:3.8.4-openjdk-17 AS build

# Set the working directory in the container
WORKDIR /app

# Copy the pom.xml file to the working directory
COPY pom.xml .

# Copy the rest of the project
COPY src ./src

# Build the project with Maven
RUN mvn clean compile assembly:single

# Use AdoptOpenJDK 17 as the base image for the final image
FROM openjdk:17

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file from the build stage to the container
COPY --from=build /app/target/pagosmensuales-1.0-SNAPSHOT-jar-with-dependencies.jar ./pagosmensuales-1.0-SNAPSHOT-jar-with-dependencies.jar

# Expose the port the application runs on
# EXPOSE 8080

# Run the specific JAR file
# CMD ["java", "-jar", "co.inphotech.marshando.sincronizador.reportes-0.0.1-SNAPSHOT.jar"]

