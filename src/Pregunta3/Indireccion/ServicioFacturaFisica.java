/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta3.Indireccion;

/**
 *
 * @author jeron
 */
public class ServicioFacturaFisica implements IServicioFacturaFisica{

    @Override
    public Factura crear(Cliente cliente) {
        FacturaFisica fs = new FacturaFisica();
        fs.setCliente(cliente);
        System.out.println("CREANDO FACTURA FISICA");
        return fs;
        
         }
}