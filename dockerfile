FROM eclipse-temurin:17-jdk-focal
ADD target/301257019_ike_lab2_part2-0.0.1-SNAPSHOT.jar 301257019_ike_lab2_part2-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "301257019_ike_lab2_part2-0.0.1-SNAPSHOT.jar"]