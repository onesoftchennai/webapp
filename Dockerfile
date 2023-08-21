FROM eclipse-temurin:17

COPY target/devapp-0.0.1-SNAPSHOT.jar devapp.jar

CMD ["java", "jar", "devapp.jar"]