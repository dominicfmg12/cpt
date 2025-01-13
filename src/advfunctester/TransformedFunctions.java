package advfunctester;

/**
 * @author Dom
 * @date 01/09/2025 Transformations
 */
class Log extends TransformedFunctions {

    private int base;

    public Log(double a, double k, double d, double c, int base) {
        super(a, k, d, c);
        this.base = base;
    }

    public String getLog() {
        return toString() + " (base " + this.base + " log)";
    }

     /**
     * Solve for AROC
     * @param a A double representing the a value of a function
     * @param k A double representing the k value of a function
     * @param d A double representing the d value of a function
     * @param c A double representing the c value of a function
     * @param x A double representing the x value that is substituted in a function
     * @return A double of the y intercept of a log
     */

    public double yIntercept(double a, double k, double d, double c, double x) {
        double xCalculations = k * (x + d);
        return (a * (Math.log10(xCalculations))) + c;
    }

}

public class TransformedFunctions {

    private double a, k, d, c;

    // default
    public TransformedFunctions() {
        this.a = 1;
        this.k = 1;
        this.d = 0;
        this.c = 0;
    }

    // main constructor
    public TransformedFunctions(double a, double k, double d, double c) {
        // Invariants for a and k
        if (a == 0) {
            this.a = 1;
        } else {
            this.a = a;
        }

        if (k == 0) {
            this.k = 1;
        } else {
            this.k = k;
        }

        this.d = d;
        this.c = c;
    }

    public double transformedX(double x) {
        return x / getK() - getD();
    }

    public double transformedY(double y) {
        return getA() * y + getC();
    }

    //setters
    public void setA(double a) {
        if (a == 0) {
            this.a = 1;
        } else {
            this.a = a;
        }
    }

    public void setK(double k) {
        if (k == 0) {
            this.k = 1;
        } else {
            this.k = k;
        }
    }

    public void setD(double d) {
        this.d = d;
    }

    public void setC(double c) {
        this.c = c;
    }

    //getters
    public double getA() {
        return this.a;
    }

    public double getK() {
        return this.k;
    }

    public double getD() {
        return this.d;
    }

    public double getC() {
        return this.c;
    }

    // Override
    public String toString() {
        return this.a + "f[" + this.k + "(x+" + this.d + ")]+" + this.c;
    }

}
