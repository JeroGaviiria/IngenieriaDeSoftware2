/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller7dip;

/**
 *
 * @author jeron
 */
public class ProcesarOrdenFedexImpl implements IProcesarOrdenFedex{

   

    
    @Override
    public void enviarOrdenFedex(Orden orden) {
        System.out.println(orden.getLugarOrigen());
        System.out.println("Hacia");
        System.out.println(orden.getLugarDestino()); 
        System.out.println("Con la operadora Fedex");
    }

    
    
}