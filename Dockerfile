FROM maven:3-openjdk-11 AS build
COPY . .
RUN mvn clear package -DskipTests

FROM openjdk:11
COPY --from=build /target/Math-trix_student_system-0.0.1-SNAPSHOT.jar Math-trix_student_system.jar
EXPOSE 20000
ENTRYPOINT ["java","-jar","Math-trix_student_system.jar"]
