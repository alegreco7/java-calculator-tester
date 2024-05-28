package org.exercise;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import org.junit.Test;

public class CalculatorTest {

    // Crea un'istanza della classe Calculator da testare
    private final Calculator calculator = new Calculator();

    // Test per il metodo add
    @Test
    public void testAdd() {
        // Verifica che l'addizione di 2.0 e 3.0 dia come risultato 5.0
        assertEquals(5.0, calculator.add(2.0f, 3.0f), 0.0001);
    }

    // Test per il metodo subtract
    @Test
    public void testSubtract() {
        // Verifica che la sottrazione di 5.0 meno 4.0 dia come risultato 1.0
        assertEquals(1.0, calculator.subtract(5.0f, 4.0f), 0.0001);
    }

    // Test per il metodo divide
    @Test
    public void testDivide() {
        // Verifica che la divisione di 6.0 per 3.0 dia come risultato 2.0
        assertEquals(2.0, calculator.divide(6.0f, 3.0f), 0.0001);
    }

    // Test per verificare che la divisione per zero lanci un'eccezione
    @Test
    public void testDivideByZero() {
        // Verifica che venga lanciata un'eccezione IllegalArgumentException quando si divide per zero
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(1.0f, 0.0f);
        });
    }

    // Test per il metodo multiply
    @Test
    public void testMultiply() {
        // Verifica che la moltiplicazione di 3.0 per 5.0 dia come risultato 15.0
        assertEquals(15.0, calculator.multiply(3.0f, 5.0f), 0.0001);
    }
}

