FROM java:8-jdk-alpine

COPY /src /src
COPY /target/docker_project-0.0.1-SNAPSHOT.war docker_project-0.0.1-SNAPSHOT.war

RUN mvn clean install

ENTRYPOINT ["java","-jar","docker_project-0.0.1-SNAPSHOT.war"]
