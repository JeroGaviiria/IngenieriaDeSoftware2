/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Command;

/**
 *
 * @author jeron
 */
public class CelularSuspenderComando implements Comando{

    private Celular celular;
    
    public CelularSuspenderComando(Celular celular){
        this.celular = celular;
    }
    @Override
    public void ejecutar() {
        celular.suspender();
      }
    
}