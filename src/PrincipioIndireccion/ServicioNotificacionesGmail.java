/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrincipioIndireccion;

/**
 *
 * @author jeron
 */
public class ServicioNotificacionesGmail implements IServicioNotificacionesGmail{

    @Override
    public Correo crear(Usuario usuario) {
        CorreoGmail cg = new CorreoGmail();
        cg.setUsuario(usuario);
        System.out.println("ENVIANDO GMAIL");
        return cg;
    }
    
}
