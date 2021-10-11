FROM maven:3.8.2-openjdk-11-slim as BUILDER
ARG VERSION=0.0.1-SNAPSHOT
WORKDIR /build/
COPY pom.xml /build/
COPY src /build/src
RUN mvn clean package
COPY target/learningspring-${VERSION}.jar target/application.jar

FROM openjdk:11.0.8-jre-slim
WORKDIR /app/
COPY --from=BUILDER /build/target/application.jar /app/
CMD jar -jar /app/application.jar