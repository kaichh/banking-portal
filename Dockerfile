FROM openjdk:8-jre-alpine
ADD target/banking-portal-0.0.1-SNAPSHOT.jar banking-portal-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "banking-portal-0.0.1-SNAPSHOT.jar"]