/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactory;

/**
 *
 * @author jeron
 */
public class FabricaExpress implements Fabrica{

    @Override
    public Envio crearEnvio() {
        return new EnvioExpress();
    }

   
    
}