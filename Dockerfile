FROM openjdk:11
ADD target/ScientificCalculator-1.0-SNAPSHOT.jar ScientificCalculator-1.0-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "ScientificCalculator-1.0-SNAPSHOT.jar","Calculator"]
