package org.example;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
   private final Calculator
   calculator = new Calculator();
   Logger logger = LogManager.getLogger(CalculatorTest.class);

   @Test
    public void testAdd(){
       Assertions.assertEquals(4, calculator.add(2, 2));
   }
    @Test
    public void testSubstract(){
        Assertions.assertEquals(5, calculator.subtract(10, 5));
    }
    @Test
    public void testMultiply(){
        Assertions.assertEquals(25, calculator.multiply(5, 5));
    }
    @Test
    public void testDivision(){
        Assertions.assertEquals(2.0, calculator.division(6, 3));
        Assertions.assertEquals(-3.0, calculator.division(-15, 5));
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.division(-15, 0));
    }
}
