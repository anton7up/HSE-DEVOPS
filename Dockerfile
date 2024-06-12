FROM openjdk:21

WORKDIR HSE-DEVOPS

COPY . HSE-DEVOPS

RUN javac Main.java

CMD ["java","Main"]
