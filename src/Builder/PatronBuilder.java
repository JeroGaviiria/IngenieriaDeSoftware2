/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Builder;

/**
 *
 * @author jeron
 */
public class PatronBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Builder builder = new Builder()
                .setTipoTomate("Rojo")
                .setTipoCarne("3/4")     
                .setTipoQueso("Mozarella")
                .setTipoPan("integral");
        Hamburguesa hamburguesa = builder.build();        
        hamburguesa.pedido();
    }
    
}
