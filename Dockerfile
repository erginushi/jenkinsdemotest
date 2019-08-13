FROM java:8-jdk-alpine

ADD /target/docker_project-0.0.1-SNAPSHOT.war docker_project-0.0.1-SNAPSHOT.war

ENTRYPOINT ["java","-jar","docker_project-0.0.1-SNAPSHOT.war"]
