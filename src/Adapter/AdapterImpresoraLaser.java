/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter;

/**
 *
 * @author jeron
 */
public class AdapterImpresoraLaser implements Impresora{
    private ImpresoraLaser impresoraLaser;
    
    public AdapterImpresoraLaser(ImpresoraLaser impresoraLaser){
        this.impresoraLaser = impresoraLaser;
    }

    @Override
    public void imprimir() {
        impresoraLaser.imprimirConLaser();
          }}

    