/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp6paquetes;

/**
 *
 * @author jeron
 */
public class PaqueteGrande extends Paquete implements PaqueteG {
    
    private double volumen;

    public PaqueteGrande(double peso, double alto, double ancho, double largo) {
        super(peso, alto, ancho, largo);
        this.volumen = calcularVolumen(); 
    }
    public double getVolumen() {
        return volumen;
    }
    @Override
    public void calcularCostoEnvioGrande() {
        double costo = volumen * 0.5; 
        System.out.println("El costo de envío para el paquete grande es: $" + costo);
    }

}
