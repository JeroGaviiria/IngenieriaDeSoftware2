/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrincipioIndireccion;

/**
 *
 * @author jeron
 */
public class ServicioNotificacionesOutlook implements IServicioNotificacionesOutlook{

    @Override
    public Correo crear(Usuario usuario) {
        CorreoOutlook co = new CorreoOutlook();
        co.setUsuario(usuario);
        return co;
    }
    
}