package modelos;

public class Cliente {
    private int id;
    private String nombre;
    private String correo;
    private String direccion;

    public Cliente(int id, String nombre, String correo, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getDireccion() {
        return direccion;
    }
}
