package advfunctester;

/**
 * @author Dom
 * @date 01/09/2025
 * Transformations
 */

public class Transformed {
    private double a, k, d, c;

    // default
    public Transformed (){
        this.a= 1;
        this.k = 1;
        this.d = 0;
        this.c = 0;
    }

    // main constructor
    public Transformed(double a, double k, double d, double c) {
        // Invariants for a and k
        if (a == 0){
            this.a= 1;
        } else {
            this.a= a;
        }

        if (k == 0){
            this.k= 1;
        } else {
            this.k= a;
        }

        this.d = d;
        this.c = c;
    }

    //setters
    public void setA(double a) {
        if (a == 0){
            this.a= 1;
        } else {
            this.a= a;
        }
    }

    public void setK(double k) {
        if (k == 0){
            this.k= 1;
        } else {
            this.k= k;
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
    
    // method that returns the y intercept of the quadratic
    public double yIntercept() {
        return this.c;
    }

    // Override
    public String toString() {
        return this.a + "f[" + this.k + "(x+" + this.d + ")^2]+" + this.c;
    }

    // public static void main(String[] args) {
    //     Quadratic q = new Quadratic(8, 2, -8);
    //     System.out.println(q); // 1.0x^2 + 2.0x + -8.0
    //     q.setA(8);
    //     q.setB(2);
    //     q.setC(-10);
    //     System.out.println(q); // 10.0x^2 + 2.0x + 7.0
    //     System.out.println(q.yIntercept()); // 7.0
    //     Quadratic q2 = new Quadratic(1, 2, -8);
    //     System.out.println(q.equals(q2)); // false
    //     double[] roots = q2.solve();
    //     System.out.println(Arrays.toString(roots)); // [2.0, -4.0]
    // }

}