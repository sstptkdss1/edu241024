# Step 1: Build Stage
FROM maven:3.8.6 AS build

# Working directory
WORKDIR /app

# Copy pom.xml and source code
COPY pom.xml .
COPY src ./src

# Package the application
RUN mvn clean package -DskipTests

# Step 2: Production Stage
FROM eclipse-temurin:17-jdk AS runtime

# Set the working directory
WORKDIR /app

# Create the log directory and set permissions
RUN mkdir -p /var/log/edu && \
    chmod 777 /var/log/edu

# Copy the jar file from the build stage
COPY --from=build /app/target/*.jar app.jar

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]

