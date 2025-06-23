FROM openjdk:17
LABEL authors="VKV"
COPY target/PaymentService-0.0.1-SNAPSHOT.jar paymentservice.jar
ENTRYPOINT ["java","-jar","paymentservice.jar"]

