/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FabricacionPura;

/**
 *
 * @author jeron
 */
public class Fabricante {
    public Cliente crearCliente(String nombre, String direccion){
        return new Cliente();
    }
    public Pedido crearPedido(){
        return new Pedido();
    }
     public Producto crearProducto(){
        return new Producto();
    }
}
