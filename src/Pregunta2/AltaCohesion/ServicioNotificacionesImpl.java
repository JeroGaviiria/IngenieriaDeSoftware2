/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta2.AltaCohesion;

/**
 *
 * @author jeron
 */
public class ServicioNotificacionesImpl implements IServicioNotificaciones{

    @Override
    public void enviarNotificacionPorSMS(Notificacion notificacion) {
      System.out.println("ENVIANDO NOTIFICACION POR SMS");
    }

    @Override
    public void enviarNotificacionPorWhatsapp(Notificacion notificacion) {
    System.out.println("ENVIANDO NOTIFICACION POR WHATSAPP");
     }
    
}
