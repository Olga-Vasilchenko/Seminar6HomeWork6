## Урок 11. Spring Actuator. ## 

### Настройка мониторинга с Prometheus и Grafana. ###

### Задание: ### 
Используйте Spring Actuator для отслеживания метрик вашего приложения. 
Настройте визуализацию этих метрик с использованием Prometheus и Grafana.

Устанавливаем "Prometheus" через ""nssm". Работает на порту 9090:

![install prometheus](https://github.com/Olga-Vasilchenko/java_spring_hw6/assets/116726308/9be0f78a-e001-4a70-9a39-6cda4cb0f6db)

Запуск "Prometheus" через "Службы":

![prometheus](https://github.com/Olga-Vasilchenko/java_spring_hw6/assets/116726308/05de2392-8bce-4d7b-a76b-58eec4cbde2a)

Проверяем запуск "Prometheus":

![prometheus1](https://github.com/Olga-Vasilchenko/java_spring_hw6/assets/116726308/eb12c939-4249-4805-9fb3-9efec5d43b36)

Добавляем зависимости в проект:

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>

<dependency>
    <groupId>io.micrometer</groupId>
    <artifactId>micrometer-core</artifactId>
    <version>1.12.2</version>
</dependency>

<dependency>
    <groupId>io.micrometer</groupId>
    <artifactId>micrometer-registry-prometheus</artifactId>
    <version>1.12.2</version>
</dependency>

Добавлякм в YAML-файл наш микросервис:
- job_name: "notes-microservice"
 metrics_path: "actuator/prometheus"
 static_configs:
 - targets: ["localhost:8080"]
