/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Pregunta2.AltaCohesion;

/**
 *
 * @author jeron
 */
public interface IServicioNotificaciones {
    public void enviarNotificacionPorSMS(Notificacion notificacion);
    public void enviarNotificacionPorWhatsapp(Notificacion notificacion);       
    
}
