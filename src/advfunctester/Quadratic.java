package advfunctester;

/**
 * author: Dom date: 10/30/2024 Lab
 */
public class Quadratic {

    private double a, b, c;

    public Quadratic() {
        this.a = 1;
        this.b = 0;
        this.c = 0;
    }

    public Quadratic(double a, double b, double c) {
        if (a == 0) {
            this.a = 1;
        } else {
            this.a = a;
        }

        this.b = b;
        this.c = c;
    }

    //getters
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    // Override
    public String toString() {
        return this.a + "x^2 + " + this.b + "x + " + this.c;
    }

    /**
     * Solve for AROC
     * @param x1 A double representing an initial x value of a function
     * @param x2 A list representing the final x value of a function
     * @return A double of the AROC
     */

    public double AROC(double x2, double x1) {
        double xFinal= (getA() * Math.pow(x2, 2)) + (getB() * x2) + getC();
        double xInitial= (getA() * Math.pow(x1, 2)) + (getB() * x1) + getC();
        return (xFinal- xInitial) / (x2 - x1);
    }

}
