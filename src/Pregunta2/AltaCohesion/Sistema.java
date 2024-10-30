/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta2.AltaCohesion;

/**
 *
 * @author jeron
 */
public class Sistema {
    private IServicioNotificaciones servicioNotificaciones;
    private ITareaDAO tareaDAO;
    
    public Sistema(IServicioNotificaciones servicioNotificaciones, ITareaDAO tareaDAO){
        this.servicioNotificaciones = servicioNotificaciones;
        this.tareaDAO = tareaDAO;
                
    }

    public IServicioNotificaciones getServicioNotificaciones() {
        return servicioNotificaciones;
    }

    public ITareaDAO getTareaDAO() {
        return tareaDAO;
    }
    
    
}
