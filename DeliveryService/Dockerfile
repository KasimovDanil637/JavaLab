FROM openjdk:22-ea-19-jdk-slim

COPY /target/DeliveryService-3.2.4.jar warehouse.jar
EXPOSE 0

ENTRYPOINT ["java","-jar","warehouse.jar"]