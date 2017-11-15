FROM openjdk:8u131-jre-alpine
MAINTAINER Maksim Kostromin https://github.com/daggerok
RUN apk --no-cache add busybox-suid bash curl \
 && addgroup app-group \
 && adduser -h /home/app -s /bin/bash -D -u 1025 app app-group
USER app
WORKDIR /home/app
VOLUME ["/home/app"]
ENTRYPOINT java -jar ./app.jar
EXPOSE 8080
HEALTHCHECK --timeout=3s --retries=33 CMD curl -f http://127.0.0.1:8080/admin/health || exit 1
COPY ./kotlin-postgres-service/build/libs/*.jar ./app.jar
