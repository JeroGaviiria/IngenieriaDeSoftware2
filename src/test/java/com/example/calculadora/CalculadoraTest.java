package com.example.calculadora;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    private static Calculadora calculadora;

    @BeforeAll
    static void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    void testSuma() {
        assertEquals(5, calculadora.suma(2, 3));
        assertEquals(0, calculadora.suma(2, -2));
        assertNotEquals(6, calculadora.suma(2, 3));
    }

    @Test
    void testResta() {
        assertEquals(1, calculadora.resta(3, 2));
        assertEquals(-1, calculadora.resta(2, 3));
        assertTrue(calculadora.resta(5, 3) > 0);
        assertFalse(calculadora.resta(2, 2) > 0);
    }

    @Test
    void testMultiplicacion() {
        assertEquals(6, calculadora.multiplicacion(2, 3));
        assertEquals(0, calculadora.multiplicacion(2, 0));
    }

    @Test
    void testDivision() {
        assertEquals(2.0, calculadora.division(4, 2));
        assertThrows(IllegalArgumentException.class, () -> calculadora.division(1, 0));
    }

    @RepeatedTest(5)
    void testSumaRepetida() {
        assertEquals(4, calculadora.suma(2, 2));
    }
}
