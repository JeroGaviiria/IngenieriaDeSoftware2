package lsp;

public class LSP {

    public static void main(String[] args) {
        Producto productoFisico1 = new ProductoFisico("nombre", 10, 30, 40);
        Inventario inventario = new Inventario();
        inventario.calcular(productoFisico1);
    }
}
