/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethod;

/**
 *
 * @author jeron
 */
public class CreadoraPagoTarjeta extends Creadora{

    @Override
    public MetodoPago crearMetodoPago() {
        return new PagoTarjeta();
           }
    
}
