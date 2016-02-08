# Docker Playground
Very basic spring-boot project to play with Docker.

## Build
Create application jar and docker image
```bash
mvn package docker:build
```

## Run
```bash
# Show which ip to query, for example 192.168.99.100
docker-machine ip default
# Run the container
docker run -d -p 8080:8080 olh/timeteller
# Query the container
curl 192.168.99.100:8080
```

If everything works, it should display current UTC time.

