/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

import java.util.*;

/**
 *
 * @author jeron
 */
public class Configuracion {
    private static Configuracion instancia;
    private String url;
    private String usuario;
    private String password;
    
    private Configuracion() {
        this.url = "api.com";
        this.usuario = "Jero";
        this.password = "password";
    }
           
    public static Configuracion getInstancia(){
        if (instancia == null){
            instancia = new Configuracion();
        }
        return instancia;
    }

    public String getUrl() {
        return url;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getPassword() {
        return password;
    }
    
     
    
}
