/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Adapter;

/**
 *
 * @author jeron
 */
public class Adapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ImpresoraInkJet inkJet = new ImpresoraInkJet();
        Impresora impresora1 = new AdapterImpresoraInkJet(inkJet);
        impresora1.imprimir();
        
        ImpresoraLaser laser = new ImpresoraLaser();
        Impresora impresora2 = new AdapterImpresoraLaser(laser);
        impresora2.imprimir();
    }}
    