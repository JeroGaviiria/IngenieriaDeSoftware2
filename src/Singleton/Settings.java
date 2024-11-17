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
public class Settings {
    private static Settings instancia;
    private Map<String, String> configuraciones;
    
    private Settings() {
        this.configuraciones = new HashMap<>();
        this.configuraciones.put("theme", "light");
        this.configuraciones.put("language", "en");
    }
            
    
    public static Settings getInstancia(){
        if (instancia == null){
            instancia = new Settings();
        }
        return instancia;
    }
    // Getters

    public Map<String, String> getConfiguraciones() {
        return configuraciones;
    }

    
    
}
