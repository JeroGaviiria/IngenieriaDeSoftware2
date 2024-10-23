/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronPrototype;

/**
 *
 * @author jeron
 */
public class Producto implements Prototype{
    private String nombre;
    private double precio;
    private String categoria;
    
    public Producto(String nombre, double precio, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    @Override
    public Prototype clone(){
        return new Producto(nombre, precio, categoria);
    }
    @Override
    public String toString(){
        return nombre + " - " + categoria + " - " + precio;
    }

    
    
    
    
}
