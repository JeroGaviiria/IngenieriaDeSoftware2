package lsp;

public class ProductoFisico extends Producto implements Enviar{
    private double peso;

    public ProductoFisico(String nombre, int cantidad, double precio, double peso) {
        super(nombre, cantidad, precio);
        this.peso = peso;
    }

    @Override
    public double calcularCosto() {
         return this.getCantidad() * this.getPrecio()*this.peso;
    }

    @Override
    public void enviarPorCorreo() {
        System.out.println("Se ha enviado tu Prodcuto");    
    }
}
