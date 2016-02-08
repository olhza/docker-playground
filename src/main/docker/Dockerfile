FROM java:8
MAINTAINER Haremza Olivier <olh@oharemza.com>
CMD ["java", "-Djava.security.egb=file:/dev/urandom", "-jar", "/timeteller.jar"]
EXPOSE 8080
ADD timeteller-0.0.1-SNAPSHOT.jar /timeteller.jar
