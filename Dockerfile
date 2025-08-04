FROM openjdk:17-jdk-slim-buster
WORKDIR /app
COPY /out/artifacts/homeWorkItAcademy_jar/homeWorkItAcademy.jar /app/taggame.jar
ENTRYPOINT ["java", "-jar", "taggame.jar"]