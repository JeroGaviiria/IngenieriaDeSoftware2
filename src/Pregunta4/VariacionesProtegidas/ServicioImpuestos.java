/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta4.VariacionesProtegidas;

/**
 *
 * @author jeron
 */
public class ServicioImpuestos {
    private ICalcularImpuestos calcularImpuestos;
   
    
    
    
    public ServicioImpuestos(ICalcularImpuestos calcularImpuestos){
        this.calcularImpuestos= calcularImpuestos;
    }
    
    public void calcular(double valor){
        this.calcularImpuestos.calcular(valor);
    }
    
}
