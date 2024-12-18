# Microservicio Cultura

## Descripción

El microservicio de Cultura es una aplicación desarrollada con Spring Boot que proporciona información sobre eventos culturales como talleres, charlas, libros y conciertos. El objetivo principal de este microservicio es ofrecer una API que devuelva una lista de eventos culturales y una interfaz web para visualizar estos eventos de manera interactiva.

## Estructura del Proyecto

### Clases y Archivos Principales

#### `MicroservicioCulturaApplication.java`
Esta es la clase principal que inicia la aplicación Spring Boot.

#### `CulturaController.java`
Este controlador maneja las solicitudes HTTP y proporciona dos endpoints:
- `/cultura`: Devuelve la página principal `casa-cultura.html`.
- `/cultura/eventos`: Devuelve una lista de eventos culturales en formato JSON.

#### `EventoService.java`
Este servicio proporciona los datos de los eventos culturales. Actualmente, devuelve una lista estática de eventos.

#### `EventoCultural.java`
Esta clase representa un evento cultural con dos atributos: `type` (tipo de evento) y `description` (descripción del evento).

### Archivos Estáticos

#### `src/main/resources/static/cultura/script.js`
Este archivo JavaScript maneja la lógica del lado del cliente para obtener los eventos desde el endpoint `/cultura/eventos` y mostrarlos en la interfaz web.

#### `src/main/resources/static/cultura/styles.css`
Este archivo CSS contiene los estilos para la página web, incluyendo el diseño de las tarjetas de eventos y otros elementos visuales.

### Plantillas

#### `src/main/resources/templates/casa-cultura.html`
Esta es la plantilla HTML principal que se muestra cuando se accede al endpoint `/cultura`. Contiene la estructura básica de la página y referencias a los archivos CSS y JavaScript.

### Configuración

#### `src/main/resources/application.properties`
Este archivo contiene la configuración de la aplicación, incluyendo el nombre de la aplicación, el puerto del servidor, y la configuración de Eureka y Prometheus.

## Cómo Ejecutar el Proyecto

1. Clona el repositorio.
2. Navega al directorio del proyecto.
3. Ejecuta el comando `mvn spring-boot:run` para iniciar la aplicación.
4. Accede a `http://localhost:8092/cultura` en tu navegador para ver la interfaz web.

## Dependencias

El proyecto utiliza las siguientes dependencias principales:
- Spring Boot Starter Web
- Spring Boot Starter Thymeleaf
- Spring Cloud Netflix Eureka Client
- Spring Cloud Config
- Micrometer Registry Prometheus
- Spring Boot Starter Actuator
- Spring Boot DevTools (opcional para desarrollo)

## Documentación Adicional

Para más información, consulta la documentación oficial de [Spring Boot](https://spring.io/projects/spring-boot) y [Spring Cloud](https://spring.io/projects/spring-cloud).
