/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta3.Indireccion;

/**
 *
 * @author jeron
 */
public class Cliente {
    private String identificacion;
    private String nombre;
    private String correo;
    
     public Cliente(String identificacion, String nombre, String correo){
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.correo = correo;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getCorreo() {
        return correo;
    }

    public String getNombre() {
        return nombre;
    }
}


