/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Adapter;

/**
 *
 * @author jeron
 */
public class Adapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NuevoSistemaPago nuevoSistemaPago = new NuevoSistemaPago("Jero", null, null);
        SistemaPago sistemaPago = new AdapterNuevoSistemaPago(nuevoSistemaPago);
        sistemaPago.crearSesion(nuevoSistemaPago);
        sistemaPago.validarCorreo(nuevoSistemaPago);
        sistemaPago.validarAutorizacion();
        sistemaPago.realizarPago();
    }
    
}
