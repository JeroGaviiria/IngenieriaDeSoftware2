/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronBuilder;

import java.util.Set;

/**
 *
 * @author jeron
 */
public class Usuario {
    private String nombre;
    private int edad;
    private String correo;
    private Set<String> intereses;
    
    public Usuario(Builder builder){
        this.nombre = builder.nombre;
        this.edad = builder.edad;
        this.correo = builder.correo;
        this.intereses = builder.intereses;        
       
    }
    
    @Override
    public String toString() {
        return nombre + " - " + edad + " - " + correo + " - " + intereses;
        
            
    }   

}
