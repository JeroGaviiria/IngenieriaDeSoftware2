/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactory;

/**
 *
 * @author jeron
 */
public class EnvioRegular implements Envio{

    @Override
    public void enviar(String paquete) {
        System.out.println("SE ESTA ENVIANDO UN ENVIO REGULAR");   
    }

}
    