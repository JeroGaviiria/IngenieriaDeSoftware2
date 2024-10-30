/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pregunta1.Controlador;

/**
 *
 * @author jeron
 */
public class Controlador {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        Libreria libreria = new Libreria();
        LibreriaControlador controller = new LibreriaControlador(libreria);

        libreria.añadirLibro(new Libro("Libro1", "Autor1", 15.0, 2023));
        libreria.añadirLibro(new Libro("Libro2", "Autor2", 20.0, 2024));
        
        System.out.println("Buscar por título: " + controller.buscarPorTitulo("Libro1").getTitulo());
        System.out.println("Buscar por autor: " + controller.buscarPorAutor("Autor2").size());
        System.out.println("Libros entre precios 10 y 25: " + controller.obtenerLibrosEntrePrecios(10, 25).size());
        System.out.println("Libros por año 1943: " + controller.obtenerLibrosPorAño(2023).size());
    }
    
}
