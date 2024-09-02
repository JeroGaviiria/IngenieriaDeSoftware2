/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp6paquetes;

/**
 *
 * @author jeron
 */
public class PaquetePeligroso extends Paquete implements PaquetePg{
    
    private String etiquetas_de_peligro;
    private boolean embalaje_especial;

    public PaquetePeligroso(double peso, double alto, double ancho, double largo, String etiquetas_de_peligro, boolean embalaje_especial) {
        super(peso, alto, ancho, largo);
        this.etiquetas_de_peligro = etiquetas_de_peligro;
        this.embalaje_especial = embalaje_especial;
    }

    @Override
    public void verificarContenidoPeligroso() {
        System.out.println("Verificando contenido peligroso...");
    }

    @Override
    public void asegurarPaquetePeligroso() {
        System.out.println("Asegurando paquete peligroso...");
    }

    public double calcularCostoEnvioPeligroso() {
        double costo = 0;
        if (embalaje_especial) {
            costo += 500.0;
        }
        return costo;
    }

    // Getters y Setters
    public String getEtiquetasDePeligro() {
        return etiquetas_de_peligro;
    }

    public void setEtiquetasDePeligro(String etiquetasDePeligro) {
        this.etiquetas_de_peligro = etiquetasDePeligro;
    }

    public boolean isEmbalajeEspecial() {
        return embalaje_especial;
    }

    public void setEmbalajeEspecial(boolean embalajeEspecial) {
        this.embalaje_especial = embalajeEspecial;
    }
}
