/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;


/**
 *
 * @author jeron
 */
public class Hamburguesa {
    private String tipoTomate;
    private String tipoCarne;
    private String tipoQueso;
    private String tipoPan;
    
    public Hamburguesa(Builder builder){
        this.tipoTomate = builder.tipoTomate;
        this.tipoCarne = builder.tipoCarne;
        this.tipoQueso = builder.tipoQueso;
        this.tipoPan = builder.tipoPan;     
    }
    
    public void pedido(){
        System.out.println(tipoTomate);
        System.out.println(tipoCarne);
        System.out.println(tipoQueso);
        System.out.println(tipoPan);
    }
}

