/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp6paquetes;

/**
 *
 * @author jeron
 */
public class PaquetePequeño extends Paquete implements PaquetePq{
    
    private double valor_declarado;

    public PaquetePequeño(double peso, double alto, double ancho, double largo, double valor_declarado) {
        super(peso, alto, ancho, largo);
        this.valor_declarado = valor_declarado;
    }

    @Override
    public void calcularCostoEnvioPequeño() {
        double costo = valor_declarado * 1.5;
        System.out.println("El costo de envío para el paquete pequeño es: $" + costo);
         }
    
    public double getValorDeclarado() {
        return valor_declarado;
    }

    // Setter para el valor declarado
    public void setValorDeclarado(double valorDeclarado) {
        this.valor_declarado = valorDeclarado;
    }
}
