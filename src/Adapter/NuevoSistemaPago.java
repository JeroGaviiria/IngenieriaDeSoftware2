/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter;

/**
 *
 * @author jeron
 */
public class NuevoSistemaPago {
    private String nombre;
    private String identificacion;
    private String correo;

    public NuevoSistemaPago(String nombre, String identificacion, String correo){
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.correo = correo;
    }
    
    public String getNombre() {
        return nombre;
    } 
    
    public void iniciar(NuevoSistemaPago nuevoSistemaPago){
        System.out.println("CREANDO LA SESION A: " + nuevoSistemaPago.getNombre() );
    }
    
    public void validar(NuevoSistemaPago nuevoSistemaPago){
        System.out.println("VALIDANDO EL CORREO A: " + nuevoSistemaPago.getNombre() );
    }
    public void autorizar(){
        System.out.println("VALIDANDO AUTORIZACION");
    }
    public void pagar(){
        System.out.println("REALIZANDO EL PAGO");
    }
}
