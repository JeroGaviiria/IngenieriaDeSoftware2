package tienda;

public class CalculoImpuestoReteIva extends Calculo {
    
    private static double reteiva = 0.15;
    
    public CalculoImpuestoReteIva(String producto, int cantidad, double precio) {
        super(producto, cantidad, precio);
    }
     @Override
    public double calcularImpuesto() {
        return (precio * cantidad) * reteiva;
    }
}

