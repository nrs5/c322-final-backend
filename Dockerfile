FROM eclipse-temurin:17
WORKDIR /home
COPY ./flowers ./flowers
COPY ./target/database-demo-0.0.1-SNAPSHOT.jar final.jar
ENTRYPOINT ["java", "-jar", "final.jar"]
