FROM openjdk:11-jre-slim
MAINTAINER DazeCake

ENV TZ=Asia/Shanghai

RUN echo "${TZ}" > /etc/timezone \
    && ln -sf /usr/share/zoneinfo/${TZ} /etc/localtime \
    && apt update \
    && apt install -y tzdata \
    && rm -rf /var/lib/apt/lists/*

COPY build/libs/*.jar /Inquisition.jar
COPY src/main/resources/application.yml /config/application.yml

EXPOSE 2000

ENTRYPOINT ["java", "-jar", "-Duser.timezone=Asia/Shanghai", "/Inquisition.jar"]