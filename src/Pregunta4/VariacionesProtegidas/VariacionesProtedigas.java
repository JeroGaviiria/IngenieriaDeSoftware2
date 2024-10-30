/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pregunta4.VariacionesProtegidas;

/**
 *
 * @author jeron
 */
public class VariacionesProtedigas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ICalcularImpuestos calcular = new CalcularImpuestoColombia();
        ICalcularImpuestos calcular2 = new CalcularImpuestoEEUU();
        ICalcularImpuestos calcular3= new CalcularImpuestoFrancia();
        ServicioImpuestos si = new ServicioImpuestos(calcular);
        ServicioImpuestos si2 = new ServicioImpuestos(calcular2);
        ServicioImpuestos si3 = new ServicioImpuestos(calcular3);
        si.calcular(0);
        si2.calcular(0);
        si3.calcular(0);
    }
    
}
