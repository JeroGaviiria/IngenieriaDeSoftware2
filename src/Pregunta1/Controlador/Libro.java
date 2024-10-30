/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta1.Controlador;

/**
 *
 * @author jeron
 */
class Libro {
    private String titulo;
    private String autor;
    private double precio;
    private int año;
    
    public Libro(String titulo, String autor, double precio, int año) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.año = año;
    }

    public String getTitulo(){ 
        return titulo; 
    }
    public String getAutor(){ 
        return autor; 
    }
    public double getPrecio(){ 
        return precio; 
    }
    public int getAño(){ 
        return año; 
    }
}
    

