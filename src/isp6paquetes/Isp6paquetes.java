/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package isp6paquetes;

/**
 *
 * @author jeron
 */
public class Isp6paquetes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PaqueteGrande paqueteGrande = new PaqueteGrande(10.5, 30.0, 20.0, 15.0);
        System.out.println("Información del Paquete Grande:");
        System.out.println("Peso: " + paqueteGrande.getPeso() + " kg");
        System.out.println("Alto: " + paqueteGrande.getAlto() + " cm");
        System.out.println("Ancho: " + paqueteGrande.getAncho() + " cm");
        System.out.println("Largo: " + paqueteGrande.getLargo() + " cm");             
        paqueteGrande.calcularCostoEnvioGrande();
        
        PaquetePequeño paquetePequeño = new PaquetePequeño(2.0, 10.0, 5.0, 7.0, 100.0);
        System.out.println("Información del Paquete Pequeño:");
        System.out.println("Peso: " + paquetePequeño.getPeso() + " kg");
        System.out.println("Alto: " + paquetePequeño.getAlto() + " cm");
        System.out.println("Ancho: " + paquetePequeño.getAncho() + " cm");
        System.out.println("Largo: " + paquetePequeño.getLargo() + " cm");             
        System.out.println("Valor Declarado: $" + paquetePequeño.getValorDeclarado());
        paquetePequeño.calcularCostoEnvioPequeño();
        
        PaquetePeligroso paquetePeligroso = new PaquetePeligroso(5.0, 25.0, 10.0, 15.0, "Explosivo, Inflamable", true);
        System.out.println("\nInformación del Paquete Peligroso:");
        System.out.println("Peso: " + paquetePeligroso.getPeso() + " kg");
        System.out.println("Alto: " + paquetePeligroso.getAlto() + " cm");
        System.out.println("Ancho: " + paquetePeligroso.getAncho() + " cm");
        System.out.println("Largo: " + paquetePeligroso.getLargo() + " cm");
        System.out.println("Etiquetas de Peligro: " + paquetePeligroso.getEtiquetasDePeligro());
        System.out.println("Embalaje Especial: " + (paquetePeligroso.isEmbalajeEspecial() ? "Si" : "No"));
        double costoEnvioPeligroso = paquetePeligroso.calcularCostoEnvioPeligroso();
        System.out.println("Costo de Envío para el Paquete Peligroso: $" + costoEnvioPeligroso);
    }
    
}
