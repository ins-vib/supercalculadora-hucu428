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
    @Test
    public void test3() {
        assertEquals(120, Calculadora.calcularFactorial(5));
        assertEquals(1, Calculadora.calcularFactorial(0));
        assertEquals(1, Calculadora.calcularFactorial(1));
        assertEquals(3628800, Calculadora.calcularFactorial(10));
    }
    @Test
    public void test4() {
        assertEquals(385, Calculadora.sumaQuadrats(10));
        assertEquals(1, Calculadora.sumaQuadrats(1));
        assertEquals(0, Calculadora.sumaQuadrats(0));       
    }
    @Test
    public void test5() {
        assertEquals(32, Calculadora.calcularPotencia(2, 5));
        assertEquals(1, Calculadora.calcularPotencia(2, 0));
        assertEquals(27, Calculadora.calcularPotencia(3, 3));   
    }
    }

