# Docker Playground
Very basic spring-boot project to play with Docker.

## Build
```bash
mvn package docker:build
docker run -d -P olh/timeteller
```

## Run
To show which port is mapped to the container's 8080 port
```bash
# Show which local port is mapped to the container 8080 port
docker ps
# Show which ip to query
docker-machine ip default
```

