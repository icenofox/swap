#To build docker image
mvn package dockerfile:build

#To run off docker
docker run -d -p 8080:8080 swap:0.1.0