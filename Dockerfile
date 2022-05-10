# Build stage
FROM maven:3.8-openjdk-11 AS build
EXPOSE 8080
COPY src /home/app/src
COPY pom.xml /home/app
COPY entrypoint.sh /scripts/entrypoint.sh
RUN ["chmod", "+x", "/scripts/entrypoint.sh"]
ENTRYPOINT ["scripts/entrypoint.sh"]