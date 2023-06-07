package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyFirstClassTest {
    @Test
    public void myFirstMethod() {
        String str = "JUnit is working fine";
        assertEquals("JUnit is working fine", str);
    }
}