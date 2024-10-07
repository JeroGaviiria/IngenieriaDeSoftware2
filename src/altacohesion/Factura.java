package altacohesion;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Factura implements IFactura {
    private List<Integer> idProducto;
    private List<String> nombreProducto;
    private List<Double> precioProducto;
    private int idCliente;
    private String nombreCliente;
    private String direccionCliente;
    private List<Integer> listaProductosIdComprados;
    private double descuento;
    private double total;
    private Date fechaFactura;

    @Override
    public double calcularPrecioConDescuento(double descuento) {
        return total - (total * (descuento / 100));
    }

    @Override
    public double calcularTotal() {
        return precioProducto.stream().mapToDouble(Double::doubleValue).sum();
    }

    @Override
    public String generarNumeroFactura() {
        return UUID.randomUUID().toString(); // Ejemplo simple
    }

    @Override
    public void procesarFactura(Cliente cliente, List<Producto> productos) {
        // Lógica para procesar el pedido
        // Lógica para guardar el pedido y la factura en la base de datos
    }
}
