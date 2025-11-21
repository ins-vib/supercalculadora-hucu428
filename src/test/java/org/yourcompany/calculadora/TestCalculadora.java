package org.yourcompany.calculadora;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestCalculadora {
    @Test
    public void test1() {
        assertEquals(3, Calculadora.nombreDigits(123));
        assertEquals(1, Calculadora.nombreDigits(3));
        assertEquals(2, Calculadora.nombreDigits(13));
        assertEquals(3, Calculadora.nombreDigits(-123));
        assertEquals(1, Calculadora.nombreDigits(0));   
    }
    @Test
    public void test2() {
        assertEquals(55, Calculadora.sumaPrimersNumeros(10));
        assertEquals(1, Calculadora.sumaPrimersNumeros(1));
        assertEquals(0, Calculadora.sumaPrimersNumeros(0));
        assertEquals(6, Calculadora.sumaPrimersNumeros(3));
    }
    }

