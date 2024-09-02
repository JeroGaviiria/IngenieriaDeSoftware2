package isp6paquetes;

public abstract class Paquete {
    private double peso;
    private double alto;
    private double ancho;
    private double largo;

    public Paquete(double peso, double alto, double ancho, double largo) {
        this.peso = peso;
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
    }
    
     public double getPeso() {
        return peso;
    }

    public double getAlto() {
        return alto;
    }

    public double getAncho() {
        return ancho;
    }

    public double getLargo() {
        return largo;
    }

    public double calcularVolumen() {
        return alto * ancho * largo;
    }
}

