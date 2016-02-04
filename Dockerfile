FROM java:8
MAINTAINER Haremza Olivier <olh@oharemza.com>
ADD target/timeteller-0.0.1-SNAPSHOT.jar /timeteller.jar
ENTRYPOINT java -Djava.security.egd=file:/dev/urandom -jar /timeteller.jar
CMD []
EXPOSE 8080
