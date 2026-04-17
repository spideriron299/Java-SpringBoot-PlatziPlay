FROM gradle:9.4.1-jdk AS build
COPY --chown=gradle:gradle . /app
WORKDIR /app
RUN gradle bootJar --no-daemon

FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY --from=build /app/build/libs/*.jar platzi_play.jar
EXPOSE 8080
ENTRYPOINT ["java", "-Dspring.profiles.active=prod", "-jar", "platzi_play.jar"]