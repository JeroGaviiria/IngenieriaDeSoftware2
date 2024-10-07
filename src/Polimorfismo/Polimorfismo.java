/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Polimorfismo;

/**
 *
 * @author jeron
 */
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Garage garage = new Garage();

        Transporte coche = new Coche();
        Transporte avion = new Avion();
        Transporte bicicleta = new Bicicleta();
        garage.estacionar(coche);
        garage.estacionar(avion);
        garage.estacionar(bicicleta);
    }
    
}
