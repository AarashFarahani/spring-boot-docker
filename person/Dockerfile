FROM openjdk:8-jdk-alpine

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 8080 available to the world outside this container
EXPOSE 8280

# The application's jar file
ARG JAR_FILE=/target/person.jar

# Add the application's jar to the container
ADD ${JAR_FILE} person.jar

# Run the jar file
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/person.jar"]