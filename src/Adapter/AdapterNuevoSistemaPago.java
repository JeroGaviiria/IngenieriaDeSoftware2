/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter;

/**
 *
 * @author jeron
 */
public class AdapterNuevoSistemaPago implements SistemaPago{
    
    private NuevoSistemaPago nuevoSistemaPago;
    
    public AdapterNuevoSistemaPago(NuevoSistemaPago nuevoSistemaPago ){
        this.nuevoSistemaPago = nuevoSistemaPago;
    }

    @Override
    public void crearSesion(NuevoSistemaPago nuevoSistemaPago) {
        nuevoSistemaPago.iniciar(nuevoSistemaPago);
    }

    @Override
    public void validarCorreo(NuevoSistemaPago nuevoSistemaPago) {
        nuevoSistemaPago.validar(nuevoSistemaPago);
    }

    @Override
    public void validarAutorizacion() {
            nuevoSistemaPago.autorizar();
    }

    @Override
    public void realizarPago() {
        nuevoSistemaPago.pagar();
    }
    
}
