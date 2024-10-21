/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory;

/**
 *
 * @author jeron
 */
public class FabricaModerna implements Fabrica{

    @Override
    public Silla crearSilla() {
        return new SillaModerna();
       }

    @Override
    public Mueble crearMueble() {
        return new MuebleModerno();
        }
    
}