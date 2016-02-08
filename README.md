# Docker Playground
Very basic spring-boot project to play with Docker.

## Build
```bash
mvn package docker:build
```

## Run
To show which port is mapped to the container's 8080 port
```bash
# Show which ip to query, for example 192.168.99.100
docker-machine ip default
# Run the container
docker run -d -p 8080:8080 olh/timeteller
# Query the container
curl 192.168.99.100:8080
```

If everything works, it should display current UTC time.

