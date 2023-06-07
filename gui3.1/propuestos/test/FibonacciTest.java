package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.BeforeClass;
import org.junit.Test;

import src.fibonacci;

public class FibonacciTest {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Iniciamos [FibonacciTest]");
    }
    // @ParameterizedTest
    // @ValueSource(ints = { -5, -7, -3 })
    // void testFibonacciWithNegativeNumber(int negativeNumber) {
    // Assertions.assertThrows(IllegalArgumentException.class, () -> {
    // fibonacci.nfibonancci(negativeNumber);
    // }, "Posicion: El argumento debe ser un n�mero no negativo.");
    // }

    // @Test
    // void testFibonacciWithNullValue() {
    // int nullparameter = (Integer) null;
    // Assertions.assertThrows(IllegalArgumentException.class, () -> {
    // fibonacci.nfibonancci(nullparameter);
    // }, "Posicion: El argumento debe ser un n�mero valido.");
    // System.out.println( fibonacci.nfibonancci(nullparameter));
    // }

    @Test
    public void testFibonacciWithNegativeNumber() {
        int negativeNumber = -5;
        assertThrows("Posicion: El argumento debe ser un n�mero no negativo.", IllegalArgumentException.class, () -> {
            fibonacci.nfibonancci(negativeNumber);
        });
    }

    @Test
    public void testFibonacciWithPossitiveNumber() {
        int possitiveNumber = 2; // 0 1 1 2 3 5
        assertEquals(1, fibonacci.nfibonancci(possitiveNumber));
    }

    @Test
    public void testFibonacciWithZero() {
        int possitiveNumber = 0;
        assertEquals(0, fibonacci.nfibonancci(possitiveNumber));
    }

    @Test
    public void testFibonacciWithOne() {
        int possitiveNumber = 1;
        assertEquals(1, fibonacci.nfibonancci(possitiveNumber));
    }

    @Test
    public void testFibonacciWithAnother() {
        int possitiveNumber = 3;
        assertEquals(2, fibonacci.nfibonancci(possitiveNumber));
    }

    @Test
    public void testFibonacciWithBigPossition() {
        int possitiveNumber = 30;
        assertEquals(832040, fibonacci.nfibonancci(possitiveNumber));
    }

    // cuando es vacio X no lo permite el tipado
    // cuando es string X no lo permite el tipado
    // cuando es un float X no lo permite el tipado
    // cuando es 0
    // cuando es 1
    // cuando es un numero positivo varios
    // cuando es un numero negativo varios mismo r

}
