FROM openjdk:8-jre-alpine
MAINTAINER Developers <developers@yieldbroker.com>

#If we need docker specific profile
#ENTRYPOINT ["/usr/bin/java", "-jar", "-Dspring.profiles.active=docker", "/usr/share/myservice/myservice.jar"]
ENTRYPOINT ["/usr/bin/java", "-jar", "/usr/share/myservice/gs-rest-service-0.1.0.jar"]

# Add Maven dependencies (not shaded into the artifact; Docker-cached)
# ADD target/lib           /usr/share/myservice/lib

# Add the service itself
ARG JAR_FILE
ADD target/${JAR_FILE} /usr/share/myservice/gs-rest-service-0.1.0.jar

# TODO - change timezone to Sydney