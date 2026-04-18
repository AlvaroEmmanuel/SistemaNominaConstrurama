# SistemaNominaConstrurama

## 1. Resumen ejecutivo

### Descripción
Este repositorio contiene el desarrollo de un sistema de gestión de nómina, asistencia y vacaciones para la empresa Construrama Casa Martínez. El sistema permite registrar empleados, controlar incidencias laborales y calcular la nómina mediante una aplicación de consola en Java.

### Problema identificado
Actualmente, la gestión del personal se realiza de manera manual o con herramientas no especializadas, lo que provoca:

- Errores en el cálculo de pagos  
- Falta de control de asistencias, faltas y retardos  
- Retrasos en procesos administrativos  
- Baja trazabilidad de la información  

### Solución
Se desarrolló una aplicación en Java que permite:

- Registrar empleados  
- Controlar asistencias, faltas y retardos  
- Gestionar vacaciones  
- Calcular la nómina automáticamente  

### Arquitectura
El sistema sigue una arquitectura monolítica basada en consola:

Usuario → Aplicación Java → Lógica del sistema → Datos en memoria  

---

## Tabla de contenidos

- Resumen ejecutivo  
- Requerimientos  
- Instalación  
- Configuración  
- Uso  
- Contribución  
- Roadmap  

---

## 2. Requerimientos

### Servidores
- Servidor de aplicación: No aplica para la beta (ejecución local)  
- Servidor web: No aplica para la beta
- Base de datos: No aplica para la beta (datos en memoria)  

### Software
- Java JDK 17 o superior  
- IDE: NetBeans o IntelliJ IDEA  

### Paquetes adicionales
- No se utilizan librerías externas  

---

## 3. Instalación

### a) Instalación del entorno de desarrollo

1. Instalar Java JDK 17 o superior  
2. Instalar NetBeans o IntelliJ IDEA  
3. Clonar el repositorio:

https://github.com/AlvaroEmmanuel/SistemaNominaConstrurama 

---

### b) Ejecución de pruebas manuales

1. Abrir el proyecto en el IDE  
2. Ejecutar la clase principal:

    NominaApp.java

3. Interactuar con el menú del sistema  

---

### c) Implementación en producción

El sistema está diseñado para ejecutarse en un entorno local.

1. Compilar el proyecto  
2. Ejecutar el archivo `.jar`:

    java -jar SistemaNominaConstrurama.jar

No se implementa en la nube.

---

## 4. Configuración

### a) Configuración del producto

El sistema no requiere archivos de configuración externos, ya que opera completamente en memoria.  
Toda la lógica está definida en las clases Java.

---

### b) Configuración de los requerimientos

Para ejecutar el sistema correctamente:

- Tener instalado Java JDK 17 o superior  
- Configurar la variable de entorno JAVA_HOME  
- Contar con un IDE  

Verificación de Java:

    java -version

---

## 5. Uso

### a) Usuario final

El sistema permite:

1. Alta de empleados  
2. Registro de asistencias  
3. Registro de faltas  
4. Registro de retardos  
5. Registro de vacaciones  
6. Cálculo de nómina  
7. Consulta de empleados  

El usuario interactúa mediante un menú en consola.

---

### b) Usuario administrador

El administrador tiene control total del sistema:

- Registro de empleados  
- Gestión de incidencias  
- Cálculo de nómina  

No se implementa control de roles.

---

## 6. Contribución

### a) Guía de contribución

1. Clonar el repositorio  
2. Crear una rama desde develop  
3. Realizar cambios  
4. Hacer commit  
5. Subir cambios  
6. Crear Pull Request  
7. Validar y hacer merge  

---

### b) Flujo de trabajo

Clonar repositorio:

    git clone https://github.com/TU-USUARIO/SistemaNominaConstrurama.git
    cd SistemaNominaConstrurama

Crear rama:

    git checkout -b feature/nueva-funcionalidad

Guardar cambios:

    git add .
    git commit -m "feat: nueva funcionalidad"

Subir cambios:

    git push origin feature/nueva-funcionalidad

Crear Pull Request desde GitHub y hacer merge.

---

## 7. Roadmap

Futuras mejoras:

- Integración con base de datos  
- Interfaz gráfica o web  
- Generación de reportes  
- Control de usuarios  
- Integración con sistemas empresariales  

---

## Gestión del proyecto

El proyecto fue gestionado mediante:

- GitHub Issues  
- GitHub Projects (Kanban)  
- Milestones (Beta y GA)  
- Branches (main y develop)  
- Pull Requests  

---
