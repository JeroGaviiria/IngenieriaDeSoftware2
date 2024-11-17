/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter;

/**
 *
 * @author jeron
 */
public class AdapterImpresoraInkJet implements Impresora{
    private ImpresoraInkJet impresoraInk;
    
    public AdapterImpresoraInkJet(ImpresoraInkJet impresoraInk){
        this.impresoraInk = impresoraInk;
    }

    @Override
    public void imprimir() {
        impresoraInk.imprimirConTinta();
          }

    
}
