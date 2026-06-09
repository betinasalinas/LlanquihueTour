Autor del proyecto
Nombre completo: Betina Salinas
Carrera: Desarrollo de aplicaciones
Sede: Online

LlanquihueTour – Sistema de Gestión de Personas
Descripción
Sistema orientado a objetos desarrollado en Java para la agencia de turismo Llanquihue Tour, ubicada en Llanquihue, Región de Los Lagos. El proyecto modela las entidades clave de la organización: empleados y clientes, aplicando principios de encapsulamiento, composición y herencia.

Estructura de paquetes y clases
src/
 ├── model/
 │    ├── Direccion.java     → Composición: domicilio de una persona
 │    ├── Persona.java       → Clase base con atributos comunes
 │    ├── Empleado.java      → Hereda de Persona, agrega cargo y sueldo
 │    └── Cliente.java       → Hereda de Persona, agrega tour preferido
 ├── util/
 │    └── Validador.java     → Métodos estáticos de validación
 └── app/
      └── Main.java          → Clase principal, crea y muestra instancias

Instrucciones para compilar y ejecutar

Abre el proyecto en el IDE.
Haz clic derecho sobre Main.java → Run.
