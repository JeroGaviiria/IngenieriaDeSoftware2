package lsp;

public class ProductoDigital extends Producto {
    private int tamañoArchivo;

    public ProductoDigital(String nombre, int cantidad, double precio, int tamañoArchivo) {
        super(nombre, cantidad, precio);
        this.tamañoArchivo = tamañoArchivo;
    }

    @Override
    public double calcularCosto() {
        return this.getCantidad() * this.getPrecio() * this.tamañoArchivo;
    }
}
