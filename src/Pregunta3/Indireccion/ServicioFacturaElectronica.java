/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta3.Indireccion;

/**
 *
 * @author jeron
 */
public class ServicioFacturaElectronica implements IServicioFacturaElectronica{

    @Override
    public Factura crear(Cliente cliente) {
        FacturaElectronica fe = new FacturaElectronica();
        fe.setCliente(cliente);
        System.out.println("CREANDO FACTURA ELECTRONICA");
        return fe;
        
         }
    
}