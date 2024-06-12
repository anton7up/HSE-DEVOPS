FROM openjdk:21

WORKDIR HSE-DEVOPS

COPY . HSE-DEVOPS

RUN javac src/main/java/org/example/Main.java

CMD ["java","Main"]
