# Koristite Dockerov zvanični Java obrazac kao osnovu
FROM openjdk:20-jdk-slim

# Postavite radni direktorijum unutar kontejnera
WORKDIR /app

# Kopirajte jar fajl vaše aplikacije iz target direktorijuma vašeg projekta u kontejner
COPY target/MembershipSystem-0.0.1-SNAPSHOT.war /app/MembershipSystem-0.0.1-SNAPSHOT.war

CMD ["java", "-jar", "MembershipSystem-0.0.1-SNAPSHOT.war"]

# Opciono: Postavite port na koji će aplikacija osluškivati (zamenite 8080 sa portom vaše aplikacije)
EXPOSE 9001