/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PrincipioIndireccion;

/**
 *
 * @author jeron
 */
public class PrincipioIndireccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IServicioNotificacionesGmail facturaGmail = new ServicioNotificacionesGmail();
        Usuario usuario = new Usuario();
        CorreoGmail cg = (CorreoGmail) facturaGmail.crear(usuario);
        
        
        
        
    }
    
}
