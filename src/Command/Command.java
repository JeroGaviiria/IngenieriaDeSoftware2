/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Command;


/**
 *
 * @author jeron
 */
public class Command {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Celular celular = new Celular();
        Computador computador = new Computador();
        
        Comando celularEncendido = new CelularEncenderComando(celular);
        ControlRemoto control = new ControlRemoto(celularEncendido);
        control.ejecutar();
        
        Comando computadorSuspender = new ComputadorSuspenderComando(computador);
        control = new ControlRemoto(computadorSuspender);
        control.ejecutar();
    }
    
}
