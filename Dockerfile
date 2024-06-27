FROM openjdk:8
ADD target/deleteCrew-0.0.1-SNAPSHOT.jar  app1.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app1.jar"]
