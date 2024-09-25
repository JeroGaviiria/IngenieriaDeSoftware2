package taller10controlador;

import java.util.*;

public class Taller10PControlador {

    public class Entrada {
        private String tipo;
        private double precio;
        private boolean disponible;
       
        public Entrada(String tipo, double precio, boolean disponible) {
            this.tipo = tipo;
            this.precio = precio;
            this.disponible = disponible;
        }
        
        public String getTipo() {
            return tipo;
        }

        public double getPrecio() {
            return precio;
        }

        public boolean isDisponible() {
            return disponible;
        }

        public void setDisponible(boolean disponible) {
            this.disponible = disponible;
        }
    }

    public class ControladorVenta {
        private List<Entrada> entradas = new ArrayList<>();

        public ControladorVenta() {          
            entradas.add(new Entrada("General", 10.0, true));
            entradas.add(new Entrada("VIP", 20.0, true));
        }

        public void comprarEntrada(String tipoEntrada) {
            Entrada entrada = encontrarEntrada(tipoEntrada);
            if (entrada != null) {
                if (entrada.isDisponible()) {
                   
                    System.out.println("Procesando compra de entrada: " + tipoEntrada + " por $" + entrada.getPrecio());
                    entrada.setDisponible(false);
                    System.out.println("Entrada comprada: " + tipoEntrada);
                } else {
                    System.out.println("Entrada no disponible: " + tipoEntrada);
                }
            } else {
                System.out.println("Entrada no encontrada: " + tipoEntrada);
            }
        }

        private Entrada encontrarEntrada(String tipoEntrada) {
            for (Entrada entrada : entradas) {
                if (entrada.getTipo().equalsIgnoreCase(tipoEntrada)) {
                    return entrada;
                }
            }
            return null; 
        }
    }

    public class Usuario {
        private ControladorVenta controlador = new ControladorVenta();

        public void comprar(String tipoEntrada) {
            controlador.comprarEntrada(tipoEntrada);
        }
    }

    public static void main(String[] args) {
        Taller10PControlador taller = new Taller10PControlador();
        Usuario usuario = taller.new Usuario();

        usuario.comprar("General"); 
        usuario.comprar("VIP");     
        usuario.comprar("General"); 
    }
}
