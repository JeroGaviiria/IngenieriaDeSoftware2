/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta1.Dry;

/**
 *
 * @author jeron
 *//*
    public class Orden {
        public double calcularTotalConImpuesto(double precio){
            double impuesto = precio *0.1;
            return precio + impuesto;
        }
        
        public double calcularDescuentoTotal(double precio, double descuento){
            double descuentoPrecio = precio - descuento;
            double impuesto = descuentoPrecio * 0.1;{
            return descuentoPrecio + impuesto;
        }
        }
    }
*/

public class Orden {
    
    // Se hace este metodo usando el Principio DRY para usarlo en los siguintes
    public double calcularImpuesto(double monto) {
        return monto * 0.1;
    }

    public double calcularTotalConImpuesto(double precio) {
        return precio + calcularImpuesto(precio); //DRy
    }

    public double calcularDescuentoTotal(double precio, double descuento) {
        double descuentoPrecio = precio - descuento;
        return descuentoPrecio + calcularImpuesto(descuentoPrecio); //DRY
    }

    
}

    

