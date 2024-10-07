/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FabricacionPura;

/**
 *
 * @author jeron
 */
public class FabricacionPura {

    public static void main(String[] args) {
        Fabricante fabrica = new Fabricante();
        Cliente cliente = fabrica.crearCliente("Jero", "jero@example.com");
        Pedido pedido  = fabrica.crearPedido();
        Producto producto = fabrica.crearProducto();
    }
    
}
