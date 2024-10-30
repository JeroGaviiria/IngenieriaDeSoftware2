/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pregunta1.Dry;

/**
 *
 * @author jeron
 */
public class Dry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Orden orden = new Orden();
        System.out.println("Total con impuesto: " + orden.calcularTotalConImpuesto(100));
        System.out.println("Total con descuento e impuesto: " + orden.calcularDescuentoTotal(100, 10));
    }
    
}
