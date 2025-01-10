package advfunctester;

import java.util.Scanner;
import javax.naming.OperationNotSupportedException;

/**
 * @author Dom
 * @date 01/09/2025
 * Advanced Functions Tester
 */

public class AdvFuncTesterMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose a topic:");
        System.out.println("1 - Polynomials ");
        System.out.println("2 - Functions");
        System.out.println("3 - Trigonometry");
        System.out.print("> ");
        double topicChoice = input.nextDouble();
        //stops weird printing when the next input is a String
        input.nextLine();

        // the questions
        StringQueue polyQuestions = new StringQueue();
        polyQuestions.enqueue("Express this in bracket notation: x is greater or equal to -1 and less than 5 (no spaces)");
        polyQuestions.enqueue("What is a zero of 4x^3-2x^2+6x-3");
        polyQuestions.enqueue("What is the IROC of -5x^2+10x+15 at x=3 (1 s.f)");

        StringQueue funcQuestions = new StringQueue();
        Transformed vertexQuadratic = new Transformed(0.25, -3, -7, 9);
        funcQuestions.enqueue("(-18,24) is a point on f(x) transformed to " + vertexQuadratic.toString() + ", what are its transformed coordinates");
        funcQuestions.enqueue("What is a, k, d, c when f(x) is horizontally stretched by .5 and reflected in the x-axis?");

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
            while (answer2 != 0.5) {
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
            while (answer3 != -20) {
                try {
                    System.out.println(polyQuestions.peek());
                } catch (OperationNotSupportedException e) {
                    System.out.println(e);
                }

                System.out.print("> ");
                answer3 = input.nextDouble();
            }

            System.out.println("Good job! Run the code again to try the other topics.");


        } else if (topicChoice == 2) {
            String answer1 = new String();
            while (!"(13,15)".equals(answer1)) {
                //prints out the question first in the queue
                try {
                    System.out.println(funcQuestions.peek());
                } catch (OperationNotSupportedException e) {
                    System.out.println(e);
                }

                System.out.print("> ");
                answer1 = input.nextLine();

            }

            //removes the question above from the queue and puts the second one infront
            try {
                funcQuestions.dequeue();
            } catch (OperationNotSupportedException e) {
                System.out.println(e);
            }

            Transformed vertexQuadratic2 = new Transformed();
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
                polyQuestions.dequeue();
            } catch (OperationNotSupportedException e) {
                System.out.println(e);
            }

            System.out.println("Good job! Run the code again to try the other topics.");

        }

    }
}
