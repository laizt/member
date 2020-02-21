FROM openjdk:8
ADD ["target/member-1.0.jar", "web.jar"]
EXPOSE 8090
ENTRYPOINT ["java","-jar","/web.jar"]
