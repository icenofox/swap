#To build docker image
mvn package dockerfile:build

#To run off docker
docker run -d -p 8080:8080 swap:0.1.0

#To login to aws
ssh -i swap.pem ec2-user@ec2-34-238-82-129.compute-1.amazonaws.com