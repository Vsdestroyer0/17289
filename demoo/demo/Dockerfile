FROM eclipse-temurin:22-jdk-alpine

WORKDIR /app

COPY . .

RUN chmod +x mvnw

EXPOSE 8080

CMD ["./mvnw", "spring-boot:run"]
