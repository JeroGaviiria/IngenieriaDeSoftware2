/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Adapter;

/**
 *
 * @author jeron
 */
public interface SistemaPago {
    void crearSesion(NuevoSistemaPago nuevoSistemaPago);
    void validarCorreo(NuevoSistemaPago nuevoSistemaPago);
    void validarAutorizacion();
    void realizarPago( );
}
