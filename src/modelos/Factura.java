package modelos;

import java.util.Date;

public class Factura {
    private int id;
    private int clienteId;
    private Date fecha;
    private double total;

    public Factura(int id, int clienteId, Date fecha, double total) {
        this.id = id;
        this.clienteId = clienteId;
        this.fecha = fecha;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public int getClienteId() {
        return clienteId;
    }
    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public Date getFecha() {
        return fecha;
    }

    public double getTotal() {
        return total;
    }
}
