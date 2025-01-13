package advfunctester;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LogTest {
    @Test
    public void testyIntercept_sampleInput1() {
        // Arrange
        double a= 10;
        double k= 1;
        double d= -5;
        double c= 0;
        double x= 15;

        Log log = new Log(10, 1, -5, 0, 10);        
        // Actcual value

        double actual = log.yIntercept(a, k, d, c, x);
        // Assert - something must be true about are code (an expected value)
        double expected = 10;
        Assertions.assertEquals(expected, actual);
    }
}
