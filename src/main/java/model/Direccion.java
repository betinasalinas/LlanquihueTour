/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import util.Validador;

/**
 * Representa la direccion de una persona vinculada a Llanquihue Tour.
 * Se usa como relacion de composicion dentro de la clase Persona.
 * 
 * @author betin
 */
public class Direccion {
    
    // Calle y numero del domicilio
    private String calle;
 
    // Ciudad o localidad
    private String ciudad;
 
    // Region del domicilio
    private String region;
 
    // Constructores
 
    // Constructor por defecto
    public Direccion() {
        this.calle  = "Sin calle";
        this.ciudad = "Sin ciudad";
        this.region = "Sin region";
    }
 
    /**
     * Constructor con todos los atributos.
     *
     * @param calle  Calle y numero.
     * @param ciudad Ciudad o localidad.
     * @param region Region.
     */
    public Direccion(String calle, String ciudad, String region) {
        this.calle  = Validador.textoValido(calle)  ? calle  : "Sin calle";
        this.ciudad = Validador.textoValido(ciudad) ? ciudad : "Sin ciudad";
        this.region = Validador.textoValido(region) ? region : "Sin region";
    }
 
    // Getters
 
    // @return Calle y numero
    public String getCalle()  { return calle; }
 
    // @return Ciudad o localidad
    public String getCiudad() { return ciudad; }
 
    // @return Region
    public String getRegion() { return region; }
 
    // Setters
 
    // @param calle Nueva calle (no puede ser vacia)
    public void setCalle(String calle)   { if (Validador.textoValido(calle))  this.calle  = calle; }
 
    // @param ciudad Nueva ciudad (no puede ser vacia)
    public void setCiudad(String ciudad) { if (Validador.textoValido(ciudad)) this.ciudad = ciudad; }
 
    // @param region Nueva region (no puede ser vacia)
    public void setRegion(String region) { if (Validador.textoValido(region)) this.region = region; }
 
    // toString
 
    /**
     * Retorna una descripcion legible de la direccion.
     * @return String con los datos de la direccion.
     */
    @Override
    public String toString() {
        return calle + ", " + ciudad + ", " + region;
    }  
}
