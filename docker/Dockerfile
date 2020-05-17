FROM openjdk:8-alpine

COPY plugins /opt/plugins
COPY app.jar /opt/app.jar

CMD ["java", "-cp", "/opt/app.jar:/opt/plugins/*", "com.github.mgrzeszczak.plugins.CoreApplicationKt"]