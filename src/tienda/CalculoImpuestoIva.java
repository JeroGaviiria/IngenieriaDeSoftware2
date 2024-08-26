package tienda;

public class CalculoImpuestoIva extends Calculo {
    
    private static double iva = 0.19;
    
    public CalculoImpuestoIva(String producto, int cantidad, double precio) {
        super(producto, cantidad, precio);
    }
     @Override
    public double calcularImpuesto() {
        return (precio * cantidad) * iva;
    }
}

