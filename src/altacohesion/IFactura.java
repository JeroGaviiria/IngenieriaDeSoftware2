/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package altacohesion;

import java.util.*;

/**
 *
 * @author jeron
 */
public interface IFactura {
    double calcularPrecioConDescuento(double descuento);
    double calcularTotal();
    String generarNumeroFactura();
    void procesarFactura(Cliente cliente, List<Producto> productos);
}
