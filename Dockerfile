FROM java:8
MAINTAINER biber
VOLUME /tmp
ADD target/*.jar sugw.jar
EXPOSE 8000
ENTRYPOINT ["java","-jar","sugw.jar"]