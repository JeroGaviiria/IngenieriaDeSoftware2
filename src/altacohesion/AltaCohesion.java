/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package altacohesion;

import java.util.*;


public class AltaCohesion {

    
    public class Main {
    public static void main(String[] args) {
        IClienteDAO clienteDAO = new ClienteDAOImpl();
        IProductoDAO productoDAO = new ProductoDAOImpl();
        IFacturaDAO facturaDAO = new FacturaDAOImpl();
        
        IFactura facturaService = new Factura();
        
       
        Cliente cliente = new Cliente();
        List<Producto> productos = new ArrayList<>();
        facturaService.procesarFactura(cliente, productos);
        
        clienteDAO.guardarCliente(cliente);
        productos.forEach(productoDAO::guardarProducto);
        
        
        Factura factura = new Factura();
        facturaDAO.guardarFactura(factura);
    }
}
    
}
