/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import util.Validador;

/**
 * Representa a un empleado de la agencia Llanquihue Tour.
 * Extiende la clase Persona agregando atributos propios del rol laboral.
 *
 * @author betin
 */
public class Empleado extends Persona {
    
     // Cargo o puesto del empleado (ej: Guia, Operador, Administrador)
    private String cargo;
 
    // Sueldo mensual bruto en pesos chilenos
    private double sueldo;
 
    // Indica si el empleado esta activo en la agencia
    private boolean activo;
 
    // Constructores
 
    // Constructor por defecto
    public Empleado() {
        super();
        this.cargo  = "Sin cargo";
        this.sueldo = 0.0;
        this.activo = false;
    }
 
    /**
     * Constructor con todos los atributos.
     *
     * @param nombre    Nombre completo.
     * @param telefono  Telefono de contacto.
     * @param email     Correo electronico.
     * @param direccion Direccion del domicilio.
     * @param cargo     Cargo en la agencia.
     * @param sueldo    Sueldo mensual bruto.
     * @param activo    Estado de actividad.
     */
    public Empleado(String nombre, String telefono, String email, Direccion direccion,
                    String cargo, double sueldo, boolean activo) {
        super(nombre, telefono, email, direccion);
        this.cargo  = Validador.textoValido(cargo)  ? cargo  : "Sin cargo";
        this.sueldo = Validador.sueldoValido(sueldo) ? sueldo : 0.0;
        this.activo = activo;
    }
 
    // Getters
 
    // @return Cargo del empleado
    public String  getCargo()  { return cargo; }
 
    // @return Sueldo mensual bruto
    public double  getSueldo() { return sueldo; }
 
    // @return true si el empleado esta activo
    public boolean isActivo()  { return activo; }
 
    // Setters
 
    // @param cargo Nuevo cargo (no puede ser vacio)
    public void setCargo(String cargo) { if (Validador.textoValido(cargo)) this.cargo  = cargo; }
 
    // @param sueldo Nuevo sueldo (debe ser >= 0)
    public void setSueldo(double sueldo) { if (Validador.sueldoValido(sueldo)) this.sueldo = sueldo; }
 
    // @param activo Nuevo estado de actividad
    public void setActivo(boolean activo) { this.activo = activo; }
 
    // toString
 
    /**
     * Retorna una descripcion legible del empleado, incluyendo datos heredados.
     * @return String con todos los datos del empleado.
     */
    @Override
    public String toString() {
        return "=== Empleado ===" +
               "\n" + super.toString() +
               "\n  Cargo      : " + cargo +
               "\n  Sueldo     : $" + sueldo +
               "\n  Activo     : " + (activo ? "Si" : "No") +
               "\n================";
    } 
}
