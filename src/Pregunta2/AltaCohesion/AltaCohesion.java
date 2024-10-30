/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pregunta2.AltaCohesion;

/**
 *
 * @author jeron
 */
public class AltaCohesion {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {          
        Tarea tarea = new Tarea();
        Notificacion notificacion = new Notificacion();
        
        Sistema sistema = new Sistema(new ServicioNotificacionesImpl(), new TareaDAOImpl());
        sistema.getTareaDAO().insertarTarea(tarea);
        sistema.getTareaDAO().obtenerTarea(tarea);
        sistema.getServicioNotificaciones().enviarNotificacionPorSMS(notificacion);
        sistema.getServicioNotificaciones().enviarNotificacionPorWhatsapp(notificacion);
    }
}
