# Aplicación Registro de Empleados

## Descripción

Aplicación Android desarrollada para gestionar el registro de empleados de una empresa.

La aplicación permite ingresar datos de empleados, visualizarlos en una lista y eliminarlos individualmente.

## Tecnologías utilizadas

- Lenguaje: Kotlin
- Framework de interfaz: Jetpack Compose
- Diseño: Material Design 3

## Funcionalidades principales

- Registro de empleados con los siguientes datos:
    - Nombre completo
    - Cargo
    - Departamento
    - Salario
    - Fecha de contratación

- Visualización de empleados mediante LazyColumn.
- Presentación de información adicional mediante LazyRow.
- Eliminación individual de empleados.
- Soporte para tema claro y oscuro.

## Estructura del proyecto

### MainActivity.kt

Contiene la actividad principal de la aplicación y la configuración del ciclo de vida:

- onStart()
- onStop()
- onDestroy()

Además, inicializa la interfaz utilizando Jetpack Compose.

### Employee.kt

Contiene el modelo de datos del empleado con sus atributos:

- Nombre
- Cargo
- Departamento
- Salario
- Fecha de contratación

### EmployeeItem.kt

Contiene el componente visual encargado de mostrar cada empleado dentro de la lista.

Incluye:

- Nombre destacado.
- LazyRow con información del empleado.
- Botón para eliminar registros.

### ui.theme

Contiene la configuración visual de la aplicación:

- Colores del tema claro.
- Colores del tema oscuro.
- Configuración Material Design 3.

## Ejecución de la aplicación

1. Abrir el proyecto en Android Studio.
2. Esperar la sincronización de Gradle.
3. Seleccionar un emulador o dispositivo Android.
4. Presionar el botón Run ▶ para ejecutar la aplicación.

## Requisitos

- Android Studio instalado.
- SDK de Android configurado.
- Dispositivo físico o emulador Android.