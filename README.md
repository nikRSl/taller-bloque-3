# Sistema de Gestión de Cursos

Un proyecto en Java que implementa un sistema de gestión de cursos con autenticación de usuarios, inscripciones y calificaciones.

##  Características

-  **Autenticación de Usuarios**: Sistema de login con credenciales
-  **Gestión de Cursos**: Crear y administrar cursos
-  **Estudiantes y Profesores**: Modelos para diferentes tipos de usuarios
-  **Inscripciones**: Registro de estudiantes en cursos
-  **Calificaciones**: Sistema de calificación de estudiantes
-  **Pagos**: Gestión de pagos de estudiantes
-  **Interfaz Gráfica**: Ventana de login con Swing

##  Estructura del Proyecto

```
src/
├── Main.java                          # Punto de entrada de la aplicación
├── sistema/
│   ├── modelo/                        # Clases del modelo de datos
│   │   ├── Usuario.java              # Clase base de usuarios
│   │   ├── Estudiante.java           # Clase para estudiantes
│   │   ├── Profesor.java             # Clase para profesores
│   │   ├── Administrador.java        # Clase para administradores
│   │   ├── Curso.java                # Modelo de cursos
│   │   ├── Inscripcion.java          # Registro de inscripciones
│   │   ├── Calificacion.java         # Sistema de calificaciones
│   │   └── Pago.java                 # Gestión de pagos
│   ├── servicio/
│   │   └── SistemaAutenticacion.java # Servicio de autenticación
│   └── vista/
│       └── VentanaLogin.java         # Interfaz gráfica de login
```

##  Cómo Usar

### Compilar el proyecto:
```bash
cd "ruta/al/proyecto"
javac -cp src src/Main.java
```

### Ejecutar la aplicación:
```bash
java -cp src Main
```

### Credenciales de Prueba:
- **Correo:** admin@gmail.com
- **Contraseña:** 1234

## 🛠 Requisitos

- Java JDK 8 o superior
- Git (para clonar/actualizar el repositorio)

##  Clases Principales

### Usuario (Clase Base)
```java
public class Usuario {
    protected String nombre;
    protected String correo;
    protected String password;
}
```

### Estudiante
Extiende de Usuario e incluye código de estudiante

### Profesor
Extiende de Usuario e incluye especialidad

### Curso
Contiene nombre del curso y profesor asignado

## ‍ Autor

nik - 2026



