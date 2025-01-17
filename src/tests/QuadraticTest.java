package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import advfunctester.Quadratic;

public class QuadraticTest {
    @Test
    public void testAROC_sampleInput1() {
        // Arrange
        double x2= 5;
        double x1= 2;

        Quadratic quadraticEquation = new Quadratic(-5, 20, 5);
        
        // Actual value
        double actual = quadraticEquation.AROC(x2, x1);
        // Assert - something must be true about are code (an expected value)
        double expected = -15;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testAROC() {
        
    }

    @Test
    void testGetA() {
        
    }

    @Test
    void testGetB() {
        
    }

    @Test
    void testGetC() {
        
    }

    @Test
    void testToString() {
        
    }

}
