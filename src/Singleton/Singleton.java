/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Singleton;

/**
 *
 * @author jeron
 */
public class Singleton {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Configuracion conf = Configuracion.getInstancia();
        System.out.println("Configuraciones: " + conf.getUrl()+ " - " + conf.getUsuario() + " - " + conf.getPassword());
        
        
        Configuracion conf2 = Configuracion.getInstancia();
        System.out.println("¿Son la misma instancia? " + (conf == conf2));
    }
    
}
