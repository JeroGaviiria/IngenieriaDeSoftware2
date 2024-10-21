package com.example.taller14;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class EstudianteTest {

    private static Estudiante estudiante;

    @BeforeAll
    static void setup() {
        estudiante = new Estudiante("Juan", 20, new ArrayList<>());
    }

    @AfterAll
    static void tearDown() {
        estudiante = null;
    }

    @Test
    void agregarCalificacionTest() {
        estudiante.agregarCalificacion(8.0);
        assertEquals(1, estudiante.getNumeroCalificaciones(), "El número de calificaciones debería ser 1");
    }

    @Test
    void obtenerPromedioTest() {
        estudiante.agregarCalificacion(9.0); // Segunda calificación
        assertEquals(8.5, estudiante.obtenerPromedio(), 0.01, "El promedio debería ser 8.5");
    }

    @Test
    public void getNumeroCalificacionesTest() {


        // Agregar dos calificaciones
        estudiante.agregarCalificacion(9);
        estudiante.agregarCalificacion(8);

        // Comprobación
        assertEquals(2, estudiante.getNumeroCalificaciones(), "El número de calificaciones debería ser 2");
    }


    @Test
    void agregarCalificacionInvalidaTest() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            estudiante.agregarCalificacion(11.0);
        });
        assertEquals("La calificacion debe estar entre 0 y 10", exception.getMessage());
    }
}
