
package lsp;

public class ProductoMixto extends Producto implements Enviar{
    private double peso;
    private double tamañoArchivo;

    public ProductoMixto(String nombre, int cantidad, double precio) {
        super(nombre, cantidad, precio);
    }

    @Override
    public double calcularCosto() {
        return peso*tamañoArchivo;
    }

    @Override
    public void enviarPorCorreo() {
        System.out.println("Se ha enviado tu producto.");  
    }
    
}
