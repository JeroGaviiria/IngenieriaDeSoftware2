package tienda;


public class FacturacionOCP {

  
    public static void main(String[] args) {
        
        Calculo iva = new CalculoImpuestoIva("Manzana", 2, 5000);
        double impuestoIVA = iva.calcularImpuesto();
        System.out.println("El impuesto IVA para el producto es "+iva.getProducto()+" es: " + impuestoIVA);
        
        //ReteIVA
        Calculo reteiva = new CalculoImpuestoReteIva("Arroz", 2, 18000);
        double impuestoReteIVA = reteiva.calcularImpuesto();
        System.out.println("El impuesto ReteIVA para el producto es "+reteiva.getProducto()+" es: " + impuestoReteIVA);
        
        //Saludable
        Calculo saludable = new CalculoImpuestoSaludable("Pollo", 2, 5000);
        double impuestoSaludable = saludable.calcularImpuesto();
        System.out.println("El impuesto Saludable para el producto  es "+saludable.getProducto()+" es: " + impuestoSaludable);
    }
    
}
