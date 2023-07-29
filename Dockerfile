FROM maven:3.8.7-openjdk-18 as builder

WORKDIR /build
ADD ./src src
ADD pom.xml pom.xml

RUN mvn clean -Dmaven.test.skip=true package

FROM openjdk:17-jdk-alpine

COPY --from=builder /build/target/*.jar /app/app.jar
COPY config/. /opt/config/

ENV JAVA_OPTS=-Dfile.encoding=utf-8

ENTRYPOINT ["java","-jar","/app/app.jar", "--spring.config.location=/opt/config/"]