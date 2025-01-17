package advfunctester;

/**
 * @author Dom
 * @date 01/09/2025 Log
 * 
 */
public class Log extends TransformedFunctions {

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