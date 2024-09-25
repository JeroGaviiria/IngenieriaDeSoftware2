package taller10creador;

import java.util.*;

public class Taller10PCreador {

    public class Computadora {
        private String procesador;
        private String tarjetaGrafica;
        private int ram;

        // Constructor
        public Computadora(String procesador, String tarjetaGrafica, int ram) {
            this.procesador = procesador;
            this.tarjetaGrafica = tarjetaGrafica;
            this.ram = ram;
        }   
         public String getProcesador() {
            return procesador;
        }

        public String getTarjetaGrafica() {
            return tarjetaGrafica;
        }

        public int getRam() {
            return ram;
        }
    }

    public class FabricaComputadoras {
        public Computadora crearComputadora(String procesador, String tarjetaGrafica, int ram) {
            return new Computadora(procesador, tarjetaGrafica, ram);
        }
    }

    public class Orden {
        private List<Computadora> computadoras = new ArrayList<>();
        private FabricaComputadoras fabrica = new FabricaComputadoras();

        public void agregarComputadora(String procesador, String tarjetaGrafica, int ram) {
            Computadora computadora = fabrica.crearComputadora(procesador, tarjetaGrafica, ram);
            computadoras.add(computadora);
        }      
         public List<Computadora> getComputadoras() {
            return computadoras;
        }
    
    }

    public static void main(String[] args) {
        Taller10PCreador taller = new Taller10PCreador();
        Orden orden = taller.new Orden();

        orden.agregarComputadora("Intel i7", "NVIDIA RTX 3060", 16);
        orden.agregarComputadora("AMD Ryzen 5", "AMD Radeon RX 5700", 8);
        
        for (Computadora computadora : orden.getComputadoras()) {
            System.out.println("Detalles de la Computadora:");
            System.out.println("Procesador: " + computadora.getProcesador());
            System.out.println("Tarjeta Grafica: " + computadora.getTarjetaGrafica());
            System.out.println("RAM: " + computadora.getRam() + " GB");
            System.out.println("-------------------------------");
        }
    }
}
