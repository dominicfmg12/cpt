package advfunctester;

import java.util.Scanner;
import javax.naming.OperationNotSupportedException;

/**
 * @author Dom
 * @date 01/09/2025 Advanced Functions Tester
 */
public class AdvFuncTesterMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose a topic:");
        System.out.println("1 - Polynomials ");
        System.out.println("2 - Functions");
        System.out.print("> ");
        double topicChoice = input.nextDouble();
        //stops weird printing when the next input is a String
        input.nextLine();

        // the questions
        StringQueue polyQuestions = new StringQueue();
        polyQuestions.enqueue("1. Express this in bracket notation: x is greater or equal to -1 and less than 5 (no spaces)");
        polyQuestions.enqueue("2. What is a zero of 4x^3-2x^2+6x-3");
        Quadratic quadraticEquation = new Quadratic(-5, 20, 5);
        polyQuestions.enqueue("3. When thrown, a balls height is modelled with " + quadraticEquation.toString() + ". What is its velocity from 2 to 5 seconds");

        StringQueue funcQuestions = new StringQueue();
        TransformedFunctions vertexQuadratic = new TransformedFunctions(0.25, -3, -7, 9);
        funcQuestions.enqueue("1. (-18,24) is a point on f(x) transformed to " + vertexQuadratic.toString() + ", what are its transformed coordinates");
        funcQuestions.enqueue("2. What is a, k, d, c when f(x) is horizontally stretched by .5 and reflected in the x-axis?");
        Log log = new Log(-5, -1, -2, 0, 10);
        funcQuestions.enqueue("3. a) What is the x-intercept for " + log.getLog());

        //Polynomials
        if (topicChoice == 1) {
            String answer1 = new String();
            while (!"[-1,5)".equals(answer1)) {
                //prints out the question infront of a queue
                try {
                    System.out.println(polyQuestions.peek());
                } catch (OperationNotSupportedException e) {
                    System.out.println(e);
                }

                System.out.print("> ");
                answer1 = input.nextLine();

            }

            //removes the question above from the queue and puts the second one infront
            try {
                polyQuestions.dequeue();
            } catch (OperationNotSupportedException e) {
                System.out.println(e);
            }

            double answer2 = 0;
            while (4 * Math.pow(answer2, 3) - 2 * Math.pow(answer2, 2) + 6 * answer2 - 3 != 0) {
                try {
                    System.out.println(polyQuestions.peek());
                } catch (OperationNotSupportedException e) {
                    System.out.println(e);
                }

                System.out.print("> ");
                answer2 = input.nextDouble();
            }

            try {
                polyQuestions.dequeue();
            } catch (OperationNotSupportedException e) {
                System.out.println(e);
            }

            double answer3 = 0;
            while (quadraticEquation.AROC(5, 2) != answer3) {
                try {
                    System.out.println(polyQuestions.peek());
                } catch (OperationNotSupportedException e) {
                    System.out.println(e);
                }

                System.out.print("> ");
                answer3 = input.nextDouble();
            }

            System.out.println("Good job! Run the code again to try the other topics.");

        //Functions
        } else if (topicChoice == 2) {
            double answer1x = 0;
            double answer1y = 0;
            while (vertexQuadratic.transformedX(-18) != answer1x && vertexQuadratic.transformedY(24) != answer1y) {
                //prints out the question first in the queue
                try {
                    System.out.println(funcQuestions.peek());
                } catch (OperationNotSupportedException e) {
                    System.out.println(e);
                }

                System.out.print("x> ");
                answer1x = input.nextDouble();
                System.out.print("y> ");
                answer1y = input.nextDouble();
            }

            //removes the question above from the queue and puts the second one infront
            try {
                funcQuestions.dequeue();
            } catch (OperationNotSupportedException e) {
                System.out.println(e);
            }

            TransformedFunctions vertexQuadratic2 = new TransformedFunctions();
            while (vertexQuadratic2.getA() != -1 && vertexQuadratic2.getK() != -2) {
                try {
                    System.out.println(funcQuestions.peek());
                } catch (OperationNotSupportedException e) {
                    System.out.println(e);
                }

                System.out.print("a> ");
                vertexQuadratic2.setA(input.nextDouble());
                System.out.print("k> ");
                vertexQuadratic2.setK(input.nextDouble());
                System.out.print("d> ");
                vertexQuadratic2.setD(input.nextDouble());
                System.out.print("c> ");
                vertexQuadratic2.setC(input.nextDouble());

            }

            try {
                funcQuestions.dequeue();
            } catch (OperationNotSupportedException e) {
                System.out.println(e);
            }

            double answer3 = 0;
            while (log.yIntercept(-5, -1, -2, 0, answer3) != 0) {
                try {
                    System.out.println(funcQuestions.peek());
                } catch (OperationNotSupportedException e) {
                    System.out.println(e);
                }

                System.out.print("> ");
                answer3 = input.nextDouble();
            }

            System.out.println("Good job! Run the code again to try the other topics.");

        }
    }
}
