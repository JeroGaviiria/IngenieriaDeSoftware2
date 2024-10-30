/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pregunta3.Indireccion;

/**
 *
 * @author jeron
 */
public class Indireccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente = new Cliente("A1", "Jero", "Gaviria");
        IServicioFacturaFisica servicioFactura1 = new ServicioFacturaFisica();
        FacturaFisica fs = (FacturaFisica) servicioFactura1.crear(cliente);
        
        IServicioFacturaElectronica servicioFactura2 = new ServicioFacturaElectronica();
        FacturaElectronica fe = (FacturaElectronica) servicioFactura2.crear(cliente);
        
    }
    
}
