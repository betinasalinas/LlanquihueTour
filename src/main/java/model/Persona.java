/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import util.Validador;

/**
 * Clase base que representa a cualquier persona vinculada a Llanquihue Tour.
 * Contiene una relacion de composicion con la clase Direccion.
 * Puede ser extendida por clases especializadas como Empleado o Cliente.
 *
 * @author betin
 */
public class Persona {
   
    // Nombre completo de la persona
    private String nombre;
 
    // Numero de telefono de contacto
    private String telefono;
 
    // Correo electronico
    private String email;
 
    // Direccion del domicilio (composicion)
    private Direccion direccion;
 
    // Constructores
 
    // Constructor por defecto
    public Persona() {
        this.nombre    = "Sin nombre";
        this.telefono  = "Sin telefono";
        this.email     = "Sin email";
        this.direccion = new Direccion();
    }
 
    /**
     * Constructor con todos los atributos.
     *
     * @param nombre    Nombre completo.
     * @param telefono  Telefono de contacto.
     * @param email     Correo electronico.
     * @param direccion Direccion del domicilio.
     */
    public Persona(String nombre, String telefono, String email, Direccion direccion) {
        this.nombre    = Validador.textoValido(nombre)      ? nombre   : "Sin nombre";
        this.telefono  = Validador.telefonoValido(telefono) ? telefono : "Sin telefono";
        this.email     = Validador.textoValido(email)       ? email    : "Sin email";
        this.direccion = direccion;
    }
 
    // Getters
 
    // @return Nombre completo
    public String getNombre()    { return nombre; }
 
    // @return Telefono de contacto
    public String getTelefono()  { return telefono; }
 
    // @return Correo electronico
    public String getEmail()     { return email; }
 
    // @return Direccion del domicilio
    public Direccion getDireccion() { return direccion; }
 
    // Setters
 
    // @param nombre Nuevo nombre (no puede ser vacio)
    public void setNombre(String nombre) { if (Validador.textoValido(nombre)) this.nombre = nombre; }
 
    // @param telefono Nuevo telefono (minimo 8 caracteres)
    public void setTelefono(String telefono) { if (Validador.telefonoValido(telefono)) this.telefono = telefono; }
 
    // @param email Nuevo email (no puede ser vacio)
    public void setEmail(String email) { if (Validador.textoValido(email)) this.email = email; }
 
    // @param direccion Nueva direccion
    public void setDireccion(Direccion direccion) { this.direccion = direccion; }
 
    // toString
 
    /**
     * Retorna una descripcion legible de la persona.
     * @return String con los datos basicos de la persona.
     */
    @Override
    public String toString() {
        return "  Nombre     : " + nombre +
               "\n  Telefono   : " + telefono +
               "\n  Email      : " + email +
               "\n  Direccion  : " + direccion;
    }
    
}
