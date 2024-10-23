package PatronPrototype;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author jeron
 */
public class PatronPrototype {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto producto1 = new Producto("Frijoles", 11.26, "Granos");
        System.out.println(producto1.toString());
        
        Producto producto2 = (Producto) producto1.clone();
        producto2.setNombre("Lentejas");
        System.out.println(producto2.toString());
        
        Producto producto3 = (Producto) producto2.clone();
        producto3.setPrecio(8.99);
        System.out.println(producto3.toString());
    }
    
}
