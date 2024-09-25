package taller10pexperto;

import java.util.*;

public class Taller10PExperto {

    public class Libro {
        private String titulo;
        private String autor;
        private double isbn;
        private double precio;
        private int cantidad;

        public Libro(String titulo, String autor, double isbn, double precio, int cantidad) {
            this.titulo = titulo;
            this.autor = autor;
            this.isbn = isbn;
            this.precio = precio;
            this.cantidad = cantidad;
        }

        public double getPrecio() {
            return precio;
        }

        public int getCantidad() {
            return cantidad;
        }
    }

    public class Carrito {
        private List<Libro> libros = new ArrayList<>();

        public void agregarLibro(Libro libro) {
            libros.add(libro);
        }

        public double calcularPrecioTotal() {
            double total = 0;
            for (Libro libro : libros) {
                total += libro.getPrecio() * libro.getCantidad();
            }
            return total;
        }
    }
    
    public static void main(String[] args) {
        
        Taller10PExperto producto = new Taller10PExperto();
        
        Libro libro1 = producto.new Libro("Libro A", "Autor A", 1234567890, 50.0, 2);
        Libro libro2 = producto.new Libro("Libro B", "Autor B", 987654321, 30.0, 3);

        Carrito carrito = producto.new Carrito();
        carrito.agregarLibro(libro1);
        carrito.agregarLibro(libro2);

        // Calcular el precio total del carrito
        double total = carrito.calcularPrecioTotal();

        // Mostrar el precio total
        System.out.println("El precio total del carrito es: " + total);
    }
}
