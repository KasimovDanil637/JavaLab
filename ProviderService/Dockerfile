FROM openjdk:22-ea-19-jdk-slim

COPY /target/Service_One-1.0-SNAPSHOT.jar warehouse.jar
EXPOSE 0

ENTRYPOINT ["java","-jar","warehouse.jar"]
