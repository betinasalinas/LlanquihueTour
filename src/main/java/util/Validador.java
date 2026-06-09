/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 * Clase utilitaria con metodos de validacion reutilizables.
 * Centraliza todas las reglas de negocio de Llanquihue Tour.
 * 
 * @author betin
 */
public class Validador {
        
    /**
     * Valida que un texto no sea nulo ni este vacio.
     *
     * @param texto Texto a validar.
     * @return true si el texto tiene contenido.
     */
    public static boolean textoValido(String texto) {
        return texto != null && !texto.trim().isEmpty();
    }
 
    /**
     * Valida que un numero de telefono tenga al menos 8 caracteres.
     *
     * @param telefono Telefono a validar.
     * @return true si el formato es valido.
     */
    public static boolean telefonoValido(String telefono) {
        return telefono != null && telefono.trim().length() >= 8;
    }
 
    /**
     * Valida que un valor entero sea mayor o igual a cero.
     * Usado para edades, cantidades y otros valores positivos.
     *
     * @param valor Valor a validar.
     * @return true si el valor es >= 0.
     */
    public static boolean edadValida(int valor) {
        return valor >= 0;
    }
 
    /**
     * Valida que un sueldo sea un valor positivo.
     *
     * @param sueldo Sueldo a validar.
     * @return true si el sueldo es >= 0.
     */
    public static boolean sueldoValido(double sueldo) {
        return sueldo >= 0.0;
    }
}
