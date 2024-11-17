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
        Settings settings = Settings.getInstancia();
        System.out.println("Configuraciones: " + settings.getConfiguraciones());
        
        
        Settings settings2 = Settings.getInstancia();
        System.out.println("¿Son la misma instancia? " + (settings == settings2));
    }
    
}
