/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstractfactory;

/**
 *
 * @author jeron
 */
public class AbstractFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fabrica fabrica = new FabricaClasica();
        Silla sillaClasica = fabrica.crearSilla();
        
        Mueble muebleClasico = fabrica.crearMueble();
        
        sillaClasica.crear();
        muebleClasico.crear();
        
        Fabrica fabrica2 = new FabricaModerna();
        Silla sillaModerna = fabrica2.crearSilla();
        
        Mueble muebleModerno = fabrica.crearMueble();
        
        sillaModerna.crear();
        muebleModerno.crear();
    }
    
}
