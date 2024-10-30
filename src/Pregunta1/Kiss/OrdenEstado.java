/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta1.Kiss;

/**
 *
 * @author jeron
 */
public class OrdenEstado {
    public String obtenerEstado(int ordenId) {
        if (ordenId < 0) return "Orden invalida";
        if (ordenId == 0 || ordenId <= 50) return "Pendiente";
        return ordenId > 100 ? "Completada" : "En Progreso";
    }   
}
