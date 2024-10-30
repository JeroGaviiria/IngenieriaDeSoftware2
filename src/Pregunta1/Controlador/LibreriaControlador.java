/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta1.Controlador;

import java.util.*;

/**
 *
 * @author jeron
 */
class LibreriaControlador {
    private Libreria libreria;

    public LibreriaControlador(Libreria libreria) {
        this.libreria = libreria;
    }

    public Libro buscarPorTitulo(String titulo) {
        for (Libro libro : libreria.getLibros()) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }

    public List<Libro> buscarPorAutor(String autor) {
        List<Libro> resultado = new ArrayList<>();
        for (Libro libro : libreria.getLibros()) {
            if (libro.getAutor().equalsIgnoreCase(autor)) {
                resultado.add(libro);
                
            }
        }
        return resultado;
    }

    public List<Libro> obtenerLibrosEntrePrecios(double min, double max) {
        List<Libro> resultado = new ArrayList<>();
        for (Libro libro : libreria.getLibros()) {
            if (libro.getPrecio() >= min && libro.getPrecio() <= max) {
                resultado.add(libro);
            }
        }
        return resultado;
    }

    public List<Libro> obtenerLibrosPorAño(int año) {
        List<Libro> resultado = new ArrayList<>();
        for (Libro libro : libreria.getLibros()) {
            if (libro.getAño() == año) {
                resultado.add(libro);
            }
        }
        return resultado;
    }
}
