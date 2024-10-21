/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorymethod;

/**
 *
 * @author jeronf
 */
public class FactoryMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Creadora creadora = new CreadoraPagoTarjeta();
        MetodoPago pagoTarjeta = creadora.crearMetodoPago();
        pagoTarjeta.procesarPago(0);
        
        Creadora creadora2 = new CreadoraPagoPaypal();
        MetodoPago pagoPaypal = creadora2.crearMetodoPago();
        pagoPaypal.procesarPago(0);
    }
    
}
