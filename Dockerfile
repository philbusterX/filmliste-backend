FROM gradle:jdk21-jammy AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
# Das "-x test" wird hier entfernt, damit die Tests ausgeführt werden
RUN gradle build --no-daemon

FROM eclipse-temurin:21-jdk-jammy
COPY --from=build /home/gradle/src/build/libs/filmliste-backend-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]