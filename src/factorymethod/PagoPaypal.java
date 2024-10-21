/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethod;

/**
 *
 * @author jeron
 */
public class PagoPaypal implements MetodoPago{

    @Override
    public void procesarPago(int cantidad) {
        System.out.println("SE ESTA PAGANDO CON PAYPAL");
        }
    
}
