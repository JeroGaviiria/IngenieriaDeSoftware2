/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller13;

/**
 *
 * @author jeron
 */
public class Taller13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ICanalNotificacion enviar = new CanalCorreoSMS();
        Notificador notificador = new Notificador(enviar);
        notificador.enviar();
        
        ICanalNotificacion enviar2 = new CanalCorreoElectronico();
        Notificador notificador2 = new Notificador(enviar2);
        notificador2.enviar();
        
        ICanalNotificacion enviar3 = new CanalCorreoWhatsapp();
        Notificador notificador3 = new Notificador(enviar3);
        notificador3.enviar();
        
        
        
        
    }
    
}
