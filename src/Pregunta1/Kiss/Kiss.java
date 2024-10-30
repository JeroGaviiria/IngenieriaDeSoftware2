/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pregunta1.Kiss;

/**
 *
 * @author jeron
 */
public class Kiss {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OrdenEstado orden = new OrdenEstado();
        System.out.println("Estado de orden -1: " + orden.obtenerEstado(-1));
        System.out.println("Estado de orden 0: " + orden.obtenerEstado(0));
        System.out.println("Estado de orden 30: " + orden.obtenerEstado(30));
        System.out.println("Estado de orden 60: " + orden.obtenerEstado(60));
        System.out.println("Estado de orden 150: " + orden.obtenerEstado(150));
    }
    
}
