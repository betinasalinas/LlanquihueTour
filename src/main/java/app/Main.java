/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package app;

import model.Cliente;
import model.Direccion;
import model.Empleado;

/**
 * Clase principal del sistema de Llanquihue Tour.
 * Crea y muestra instancias de las clases del dominio.
 *
 * @author betin
 */
public class Main {      

    public static void main(String[] args) {
        
         // Instancia 1: Empleado con constructor completo
        Direccion dir1 = new Direccion("Los Canelos 210", "Llanquihue", "Los Lagos");
        Empleado  emp1 = new Empleado(
            "Ana Perez", "+56912345678", "ana@llanquihuetour.cl",
            dir1, "Guia Turistica", 750000.0, true
        );
 
        // Instancia 2: Empleado con constructor vacio + setters
        Direccion dir2 = new Direccion();
        dir2.setCalle("Av. Frutillar 800");
        dir2.setCiudad("Puerto Montt");
        dir2.setRegion("Los Lagos");
 
        Empleado emp2 = new Empleado();
        emp2.setNombre("Carlos Salinas");
        emp2.setTelefono("+56987654321");
        emp2.setEmail("carlos@llanquihuetour.cl");
        emp2.setDireccion(dir2);
        emp2.setCargo("Operador Logistico");
        emp2.setSueldo(820000.0);
        emp2.setActivo(true);
 
        // Instancia 3: Cliente con constructor completo
        Direccion dir3   = new Direccion("Calle Nueva 22", "Puerto Varas", "Los Lagos");
        Cliente   client = new Cliente(
            "Maria Tapia", "+56911223344", "maria@gmail.com",
            dir3, "Paseo Lacosta", 3
        );
 
        // Mostrar por consola
        System.out.println(emp1);
        System.out.println();
        System.out.println(emp2);
        System.out.println();
        System.out.println(client);
    }
}
