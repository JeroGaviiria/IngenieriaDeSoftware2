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
class Libreria {
    private List<Libro> libros = new ArrayList<>();

    public void añadirLibro(Libro libro) {
        libros.add(libro);
    }

    public List<Libro> getLibros() {
        return libros;
    }
}