# PlatziPlay - Java Spring Boot & AI Project

Este repositorio contiene el proyecto desarrollado para el curso de **Java Spring Boot** de Platzi. La aplicación ha evolucionado para integrar capacidades de **Inteligencia Artificial**, transformándose en una plataforma moderna que utiliza arquitectura de microservicios y containerización.

## Tecnologías Utilizadas

* **Java 21**: Utilizando las últimas características del lenguaje.
* **Spring Boot 3.x**: Framework base para la creación de la API.
* **Spring AI**: Integración con modelos de Inteligencia Artificial para procesamiento inteligente de datos.
* **Gradle**: Gestor de dependencias y automatización de builds.
* **Docker & Docker Compose**: Containerización completa del ecosistema.
* **PostgreSQL**: Base de datos relacional para la persistencia de información.

## Capacidades de IA

El proyecto integra funciones de **IA Generativa** para mejorar la interacción y el procesamiento de la información, destacando:
* **Generación de Contenido**: Creación dinámica de metadatos o descripciones.
* **Procesamiento Inteligente**: Uso de prompts optimizados para el análisis de la información dentro del flujo de la aplicación.
* **Extensibilidad**: Configurado para conectar con diferentes proveedores de LLM a través de Spring AI.

## Requisitos Previos

* [Docker Desktop](https://www.docker.com/products/docker-desktop/)
* [Java 21 JDK](https://adoptium.net/es/temurin/releases/?version=21) (si deseas ejecución local)

## Instalación y Ejecución con Docker

Para levantar todo el entorno (App + Base de Datos) de forma automática:

1.  **Clonar el repositorio:**
    ```bash
    git clone [https://github.com/spideriron299/Java-SpringBoot-PlatziPlay.git](https://github.com/spideriron299/Java-SpringBoot-PlatziPlay.git)
    cd Java-SpringBoot-PlatziPlay
    ```

2.  **Levantar servicios:**
    ```bash
    docker-compose up --build
    ```

3.  **Acceso:**
    La API estará escuchando en `http://localhost:8080`.

## Notas de Compilación (Solución de errores)

Si el build de Docker falla por temas de **Java Toolchains**, este proyecto incluye flags para ignorar la descarga automática y usar el JDK 21 preinstalado en el contenedor:

```bash
# Comando ejecutado internamente por el Dockerfile
./gradlew bootJar -x test -Porg.gradle.java.installations.auto-download=false
