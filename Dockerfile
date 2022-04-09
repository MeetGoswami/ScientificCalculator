FROM openjdk:11
ADD target/ScientificCalculator-1.0-SNAPSHOT-jar-with-dependencies.jar ScientificCalculator-1.0-SNAPSHOT-jar-with-dependencies.jar
ENTRYPOINT ["java", "-jar", "ScientificCalculator-1.0-SNAPSHOT-jar-with-dependencies.jar","Calculator"]
