package advfunctester;

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

    //returns an array of two doubles that are the roots to the quadratic
    public double[] solve(){
        double x1, x2;
        x1= (-this.b + Math.sqrt(Math.pow(this.b, 2) -(4*this.a*this.c))) / (2* this.a);
        x2= (-this.b - Math.sqrt(Math.pow(this.b, 2) -(4*this.a*this.c))) / (2* this.a);
        double[] roots = { x1, x2 };
        return roots;
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
    public static String vertexQuadToString(double[] coeffs) {
        return coeffs[0] + "x^2 + " + coeffs[1] + "x + " + coeffs[2];
    }
}

