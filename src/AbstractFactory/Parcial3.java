/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AbstractFactory;

/**
 *
 * @author jeron
 */
public class Parcial3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fabrica fe = new FabricaExpress();
        Envio envioExpress = fe.crearEnvio();
        envioExpress.enviar("Paquete 1");
        
        Fabrica fr = new FabricaRegular();
        Envio envioRegular = fr.crearEnvio();
        envioRegular.enviar("Paquete 2");
       
        
        
    }
    
}
