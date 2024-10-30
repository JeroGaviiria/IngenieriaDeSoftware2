/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta2.AltaCohesion;

/**
 *
 * @author jeron
 */
public class TareaDAOImpl implements ITareaDAO{

    @Override
    public void insertarTarea(Tarea tarea) {
        System.out.println("INSERTANDO  TAREA");
         }

    @Override
    public void obtenerTarea(Tarea tarea) {
    System.out.println("OBTENIENDO  TAREA");
         }
    
}
