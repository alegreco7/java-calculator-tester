package org.exercise;

public class Calculator {

    // Metodo per l'addizione
    public float add(float num1, float num2) {
        return num1 + num2;
    }

    // Metodo per la sottrazione
    public float subtract(float num1, float num2) {
        return num1 - num2;
    }

    // Metodo per la divisione
    public float divide(float num1, float num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return num1 / num2;
    }

    // Metodo per la moltiplicazione
    public float multiply(float num1, float num2) {
        return num1 * num2;
    }
}

