/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import util.Validador;

/**
 * Representa a un cliente de la agencia Llanquihue Tour.
 * Extiende la clase Persona agregando atributos propios del perfil del cliente.
 *
 * @author betin
 */
public class Cliente extends Persona {
    
    // Tipo de tour preferido por el cliente (ej: gastronomico, lacustre, cultural)
    private String tourPreferido;
 
    // Numero de tours contratados con la agencia
    private int toursContratados;
 
    // Constructores
 
    // Constructor por defecto
    public Cliente() {
        super();
        this.tourPreferido    = "Sin preferencia";
        this.toursContratados = 0;
    }
 
    /**
     * Constructor con todos los atributos.
     *
     * @param nombre           Nombre completo.
     * @param telefono         Telefono de contacto.
     * @param email            Correo electronico.
     * @param direccion        Direccion del domicilio.
     * @param tourPreferido    Tour de preferencia.
     * @param toursContratados Cantidad de tours contratados.
     */
    public Cliente(String nombre, String telefono, String email, Direccion direccion,
                   String tourPreferido, int toursContratados) {
        super(nombre, telefono, email, direccion);
        this.tourPreferido    = Validador.textoValido(tourPreferido) ? tourPreferido : "Sin preferencia";
        this.toursContratados = Validador.edadValida(toursContratados) ? toursContratados : 0;
    }
 
    // Getters
 
    // @return Tour preferido del cliente
    public String getTourPreferido()    { return tourPreferido; }
 
    // @return Numero de tours contratados
    public int    getToursContratados() { return toursContratados; }
 
    // Setters
 
    // @param tourPreferido Nuevo tour preferido (no puede ser vacio)
    public void setTourPreferido(String tourPreferido) {
        if (Validador.textoValido(tourPreferido)) this.tourPreferido = tourPreferido;
    }
 
    // @param toursContratados Nuevo numero de tours (debe ser >= 0)
    public void setToursContratados(int toursContratados) {
        if (Validador.edadValida(toursContratados)) this.toursContratados = toursContratados;
    }
 
    // toString
 
    /**
     * Retorna una descripcion legible del cliente, incluyendo datos heredados.
     * @return String con todos los datos del cliente.
     */
    @Override
    public String toString() {
        return "=== Cliente ===" +
               "\n" + super.toString() +
               "\n  Tour pref. : " + tourPreferido +
               "\n  Tours cont.: " + toursContratados +
               "\n===============";
    }
}
