package principal; 

interface Envio {
    double calcularCosto(double peso, double distancia);
}

class EnvioEstandar implements Envio {
    @Override
    public double calcularCosto(double peso, double distancia) {
        return peso * 0.5 + distancia * 0.1;
    }
}

class EnvioExpress implements Envio {
    @Override
    public double calcularCosto(double peso, double distancia) {
        return peso * 1.0 + distancia * 0.2;
    }
}

public class OCP1 {
    public static void main(String[] args) {
        Envio envioEstandar = new EnvioEstandar();
        Envio envioExpress = new EnvioExpress();

        double peso = 10.0;
        double distancia = 50.0;

        System.out.println("Costo Envio Estandar: " + envioEstandar.calcularCosto(peso, distancia));
        System.out.println("Costo Envio Express: " + envioExpress.calcularCosto(peso, distancia));
    }
}

