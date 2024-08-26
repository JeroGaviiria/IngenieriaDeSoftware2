package tienda;

public class CalculoImpuestoSaludable extends Calculo {
    
    private static double saludable = 0.05;
    
    public CalculoImpuestoSaludable(String producto, int cantidad, double precio) {
        super(producto, cantidad, precio);
    }
     @Override
    public double calcularImpuesto() {
        return (precio * cantidad) * saludable;
    }
}

