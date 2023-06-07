package otro;
import org.junit.jupiter.api.Test;
import java.math.BigInteger;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigIntegerTest {

    @Test
    public void testMaxWithGreaterValue() {
        BigInteger num1 = new BigInteger("100");
        BigInteger num2 = new BigInteger("200");
        
        BigInteger expectedMax = new BigInteger("200");
        assertEquals(expectedMax, num1.max(num2));
    }

    @Test
    public void testMaxWithSmallerValue() {
        BigInteger num1 = new BigInteger("300");
        BigInteger num2 = new BigInteger("200");
        
        BigInteger expectedMax = new BigInteger("300");
        assertEquals(expectedMax, num1.max(num2));
    }

    @Test
    public void testMaxWithEqualValues() {
        BigInteger num1 = new BigInteger("500");
        BigInteger num2 = new BigInteger("500");
        
        BigInteger expectedMax = new BigInteger("500");
        assertEquals(expectedMax, num1.max(num2));
    }

    @Test
    public void testMaxWithNegativeValues() {
        BigInteger num1 = new BigInteger("-100");
        BigInteger num2 = new BigInteger("-200");
        
        BigInteger expectedMax = new BigInteger("-100");
        assertEquals(expectedMax, num1.max(num2));
    }

    @Test
    public void testMaxWithVeryLargeValues() {
        BigInteger num1 = new BigInteger("1000000000000000000000000000");
        BigInteger num2 = new BigInteger("2000000000000000000000000000");
        
        BigInteger expectedMax = new BigInteger("2000000000000000000000000000");
        assertEquals(expectedMax, num1.max(num2));
    }

    @Test
    public void testMaxWithMaxRangeValues() {
        BigInteger num1 = new BigInteger(String.valueOf(Long.MAX_VALUE));
        BigInteger num2 = new BigInteger(String.valueOf(Long.MAX_VALUE - 1));
        
        BigInteger expectedMax = num1;
        assertEquals(expectedMax, num1.max(num2));
    }

    @Test
    public void testMaxWithMinRangeValues() {
        BigInteger num1 = new BigInteger(String.valueOf(Long.MIN_VALUE));
        BigInteger num2 = new BigInteger(String.valueOf(Long.MIN_VALUE + 1));
        
        BigInteger expectedMax = num2;
        assertEquals(expectedMax, num1.max(num2));
    }

    @Test
    public void testMaxWithPositiveAndZero() {
        BigInteger num1 = new BigInteger("500");
        BigInteger num2 = BigInteger.ZERO;
        
        BigInteger expectedMax = new BigInteger("500");
        assertEquals(expectedMax, num1.max(num2));
    }

    @Test
    public void testMaxWithNegativeAndZero() {
        BigInteger num1 = new BigInteger("-500");
        BigInteger num2 = BigInteger.ZERO;
        
        BigInteger expectedMax = BigInteger.ZERO;
        assertEquals(expectedMax, num1.max(num2));
    }
}
