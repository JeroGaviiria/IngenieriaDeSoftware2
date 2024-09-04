/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller7dip;

/**
 *
 * @author jeron
 */
public class Taller7DIP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IProcesarOrdenFedex procesarOrdenFedex = new ProcesarOrdenFedexImpl();
        IProcesarOrdenDHL procesarOrdenDHL = new ProcesarOrdenDHLImpl();
        IProcesarOrdenUPS procesarOrdenUPS = new ProcesarOrdenUPSImpl();
        SistemaEnvios sistemaEnvios = new SistemaEnvios(procesarOrdenFedex, procesarOrdenDHL, procesarOrdenUPS);
        Orden orden = new Orden(null, "MANIZALES", "BOGOTA");
        sistemaEnvios.enviarOrdenFedex(orden);
        sistemaEnvios.enviarOrdenDHL(orden);
        sistemaEnvios.enviarOrdenUPS(orden);
    }
    
}
