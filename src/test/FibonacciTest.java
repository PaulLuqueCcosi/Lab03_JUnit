package test;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import pruebasPSejem.fibonacci;

class FibonacciTest {
//	@ParameterizedTest
//    @ValueSource(ints = { -5, -7, -3 })
//    void testFibonacciWithNegativeNumber(int negativeNumber) {
//        Assertions.assertThrows(IllegalArgumentException.class, () -> {
//            fibonacci.nfibonancci(negativeNumber);
//        }, "Posicion: El argumento debe ser un número no negativo.");
//    }
	
//    @Test
//    void testFibonacciWithNullValue() {
//        int nullparameter = (Integer) null;
//        Assertions.assertThrows(IllegalArgumentException.class, () -> {
//            fibonacci.nfibonancci(nullparameter);
//        }, "Posicion: El argumento debe ser un número valido.");
//        System.out.println( fibonacci.nfibonancci(nullparameter));
//    }
    
    @Test
    void testFibonacciWithNegativeNumber() {
        int negativeNumber = -5;
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            fibonacci.nfibonancci(negativeNumber);
        }, "Posicion: El argumento debe ser un número no negativo.");
    }
    
    @Test
    void testFibonacciWithPossitiveNumber() {
        int possitiveNumber = 2; //0 1 1 2 3 5
        assertEquals(1,  fibonacci.nfibonancci(possitiveNumber));
    }
    
    @Test
    void testFibonacciWithZero() {
        int possitiveNumber = 0;
        assertEquals(0,  fibonacci.nfibonancci(possitiveNumber));
    }
    
    @Test
    void testFibonacciWithOne() {
        int possitiveNumber = 1;
        assertEquals(1,  fibonacci.nfibonancci(possitiveNumber));
    }
    @Test
    void testFibonacciWithAnother() {
        int possitiveNumber = 3;
        assertEquals(2,  fibonacci.nfibonancci(possitiveNumber));
    }
    @Test
    void testFibonacciWithBigPossition() {
        int possitiveNumber = 30;
        assertEquals(832040,  fibonacci.nfibonancci(possitiveNumber));
    }

    //cuando es vacio             X  no lo permite el tipado
    //cuando es string            X  no lo permite el tipado
    // cuando es un float         X  no lo permite el tipado
    //cuando es 0
    // cuando es 1
    // cuando es un numero positivo varios 
    //cuando es un numero negativo varios mismo r
    


}
