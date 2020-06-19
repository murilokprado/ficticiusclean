FROM openjdk:11-jre-slim

ENV TZ America/Sao_Paulo

COPY ./target/ficticiusclean.jar /app/

ENTRYPOINT exec java $JAVA_OPTIONS -jar /app/ficticiusclean.jar

EXPOSE 9000
