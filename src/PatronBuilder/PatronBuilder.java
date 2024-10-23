/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PatronBuilder;

import java.util.*;


/**
 *
 * @author jeron
 */
public class PatronBuilder {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
         Usuario builder = new Builder()
                .setNombre("Jero")
                .setEdad(18)     
                .setCorreo("jero@example.com")
                .setIntereses(new HashSet<>(Arrays.asList("Deportes", "Musica", 
                        "Lectura")))         
                .build();
         
        System.out.println(builder);
    }
    
}