# Используем образ JDK 21 для сборки проекта
FROM openjdk:21-ea-11-jdk-slim as build

# Устанавливаем рабочую директорию в контейнере
WORKDIR /workspace/app

# Копируем Maven настройки
COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .
COPY src src

# Собираем приложение с помощью Maven
RUN ./mvnw install -DskipTests

FROM openjdk:21-ea-11-jre-slim

# Скопируем собранный jar-файл из предыдущего шага
COPY --from=build /workspace/app/target/*.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]
