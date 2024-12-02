/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Command;

/**
 *
 * @author jeron
 */
public class ComputadorEncenderComando implements Comando{

    private Computador computador;
    
    public ComputadorEncenderComando(Computador computador){
        this.computador = computador;
    }
    @Override
    public void ejecutar() {
        computador.encender();
      }
    
}