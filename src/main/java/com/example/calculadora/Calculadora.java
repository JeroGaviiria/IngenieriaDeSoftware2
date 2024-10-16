package com.example.calculadora;

public class Calculadora {
    public int suma(int a, int b) {
        return a + b;
    }

    public int resta(int a, int b) {
        return a - b;
    }

    public int multiplicacion(int a, int b) {
        return a * b;
    }

    public double division(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("No se puede dividir entre cero");
        return (double) a / b;
    }
}
