/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller7dip;

/**
 *
 * @author jeron
 */
public class SistemaEnvios {
    
    private IProcesarOrdenFedex procesarOrdenFedex;
    private IProcesarOrdenUPS procesarOrdenUPS;
    private IProcesarOrdenDHL procesarOrdenDHL;
     
    
    public SistemaEnvios(IProcesarOrdenFedex procesarOrdenFedex,IProcesarOrdenDHL procesarOrdenDHL,IProcesarOrdenUPS procesarOrdenUPS){
        this.procesarOrdenFedex = procesarOrdenFedex;
        this.procesarOrdenDHL = procesarOrdenDHL;
        this.procesarOrdenUPS = procesarOrdenUPS;
        
    }
    
    public void enviarOrdenFedex(Orden orden){
        procesarOrdenFedex.enviarOrdenFedex(orden);
    }
    public void enviarOrdenDHL(Orden orden){
        procesarOrdenDHL.enviarOrdenDHL(orden);
    }
    public void enviarOrdenUPS(Orden orden){
        procesarOrdenUPS.enviarOrdenUPS(orden);
    }
}
