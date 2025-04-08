FROM openjdk:20-jdk-slim

WORKDIR /app

COPY target/MembershipSystem-0.0.1-SNAPSHOT.war /app/MembershipSystem-0.0.1-SNAPSHOT.war

CMD ["java", "-jar", "MembershipSystem-0.0.1-SNAPSHOT.war"]

EXPOSE 9001