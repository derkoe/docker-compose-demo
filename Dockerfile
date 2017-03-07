FROM openjdk:8-jre-alpine
LABEL vendor="Porsche Informatik" \
      app="docker-compose-demo" \
      version="1.0.0"

RUN adduser -D app
COPY target/docker-compose-demo.jar /home/app/docker-compose-demo.jar
ENV JAVA_OPTS=
EXPOSE 8080
VOLUME /tmp

USER app
WORKDIR /home/app
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar docker-compose-demo.jar
