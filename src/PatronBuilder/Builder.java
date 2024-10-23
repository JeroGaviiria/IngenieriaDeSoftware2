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
public class Builder {
    public String nombre;
    public int edad;
    public String correo;
    public Set<String> intereses;

    public Builder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public Builder setEdad(int edad) {
        this.edad = edad;
        return this;
    }

    public Builder setCorreo(String correo) {
        this.correo = correo;
        return this;
    }

    public Builder setIntereses(Set<String> intereses) {
        this.intereses = intereses;
        return this;
    }
 
    public Usuario build(){
        return new Usuario(this);
        
    }
     
}