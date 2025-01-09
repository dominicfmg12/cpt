package advfunctester;
import java.util.Arrays;

public class Polynomial {

    private double a, b, c;

    public Polynomial (){
        this.a= 1;
        this.b = 0;
        this.c = 0;
    }

    public Polynomial(double a, double b, double c) {
        if (a == 0){
            this.a= 1;
        } else {
            this.a= a;
        }
        
        this.b = b;
        this.c = c;
    }

    // setters
    public void setA(double a) {
        if (a == 0){
            this.a= 1;
        } else {
            this.a= a;
        }
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    // method that returns the y intercept of the quadratic
    public double yIntercept() {
        return this.c;
    }

    // Override
    public String toString() {
        return this.a + "x^2 + " + this.b + "x + " + this.c;
    }

    //sees if two quadratics are equal
    public boolean equals(Quadratic other){
        if(other==null) return false;
        return this.a==other.a && this.b==other.b && this.c==other.c;
    }

    //returns an array of two doubles that are the roots to the quadratic
    public double[] solve(){
        double x1, x2;
        x1= (-this.b + Math.sqrt(Math.pow(this.b, 2) -(4*this.a*this.c))) / (2* this.a);
        x2= (-this.b - Math.sqrt(Math.pow(this.b, 2) -(4*this.a*this.c))) / (2* this.a);
        double[] roots = { x1, x2 };
        return roots;
    }

    public static void main(String[] args) {
        Quadratic q = new Quadratic(8, 2, -8);
        System.out.println(q); // 1.0x^2 + 2.0x + -8.0
        q.setA(8);
        q.setB(2);
        q.setC(-10);
        System.out.println(q); // 10.0x^2 + 2.0x + 7.0
        System.out.println(q.yIntercept()); // 7.0
        Quadratic q2 = new Quadratic(1, 2, -8);
        System.out.println(q.equals(q2)); // false
        double[] roots = q2.solve();
        System.out.println(Arrays.toString(roots)); // [2.0, -4.0]
    }


    /**
     * Return a string representation of the quadratic
     *
     * For example: double[] coeffs = {1, 2, -8};
     * System.out.println(quadToString(coeffs)) // 1x^2 + 2x + -8
     *
     * @param coeffs The coefficients
     * @return A string representing the quadratic
     */
    public static String quadToString(double[] coeffs) {
        return coeffs[0] + "x^2 + " + coeffs[1] + "x + " + coeffs[2];
    }

    /**
     * Calculate the value at f(x) given the coefficients for the quadratic. For
     * example, say the coefficients are [1, 2, -8], that corresponds to the
     * quadratic f(x) = x^2 + 2x - 8. If we call the function like this:
     *
     * double[] coeffs = {1, 2, -8}; System.out.println(f(coeffs, 3)) // 7
     *
     * @param coeffs The coefficients of f(x)
     * @param x The value at which to evaluate f(x)
     * @return The function f evaluated at x
     */
    public static double f(double[] coeffs, double x) {
        // TODO: Implement
        return coeffs[0] * Math.pow(x, 2) + coeffs[1] * x + coeffs[2];
    }

    /**
     * Calculate the roots of a quadratic given the coefficients.
     *
     * Remember, roots are calculated using the quadratic formula. You may find
     * Math.sqrt() helpful. (Also, you'll need to use parenthases for sure)
     *
     * @param coeffs The coefficients of a quadratic in standard form
     * @return The roots in the form [x1, x2]
     */
    public static double[] calculateRoots(double[] coeffs) {
        // TODO: Implement
        double[] roots = new double[2];
        roots[0] = (-coeffs[1] + Math.sqrt(Math.pow(coeffs[1], 2) - (4 * coeffs[0] * coeffs[2]))) / (2 * coeffs[0]);
        roots[1] = (-coeffs[1] - Math.sqrt(Math.pow(coeffs[1], 2) - (4 * coeffs[0] * coeffs[2]))) / (2 * coeffs[0]);
        return roots;
    }

    /**
     * Calculate the X coordinate of the vertex given coefficients.
     *
     * Remember that the X coordinate of the vertex is in the middle of the two
     * roots
     *
     * @param coeffs The coefficients of a quadratic in standard form
     * @return Vertex [x1, x2]
     */
    public static double calculateVertexX(double[] roots) {
        return (roots[0] + roots[1]) / 2;
    }
}

