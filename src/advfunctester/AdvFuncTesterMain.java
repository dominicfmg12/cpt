package advfunctester;

import java.util.Scanner;
import javax.naming.OperationNotSupportedException;

/**
 * author: Dom date: 10/10/2024 Quadratic roots and vertex calculator
 */
public class AdvFuncTesterMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose a topic:");
        System.out.println("1 - Polynomials ");
        System.out.println("2 - Basic Functions");
        System.out.println("3 - Trigonometry");
        System.out.print("> ");
        double topicChoice = input.nextDouble();

        //questions on polynomials
        StringQueue polyQuestions = new StringQueue();
        polyQuestions.enqueue("What are the roots of x^3-7x-6");
        polyQuestions.enqueue("What is a factor of 4x^3-2x^2+6x-3");
        polyQuestions.enqueue("What is the IROC of -5x^2+10x+15 at x=3 (1 s.f)");

        if (topicChoice == 1) {
            //placeholders for an array with 3 elements
            double[] answer1 = {1, 0, 0};
            //when the user enters roots that do not result in 0 when substituted, the question loops
            while (answer1[0] + answer1[1] + answer1[2] != 0){
                //prints out the question infront of a queue
                try {
                    System.out.println(polyQuestions.peek());
                } catch (OperationNotSupportedException e) {
                    System.out.println(e);
                }

                //takes in 3 inputs
                for (int i = 0; i < answer1.length; i++) {
                    System.out.print("> ");
                    answer1[i] = input.nextDouble();
                }
            }

            //removes the question above from the queue and puts the second one infront
            try {
                polyQuestions.dequeue();
            } catch (OperationNotSupportedException e) {
                System.out.println(e);
            }

            double answer2 = 0;
            while (answer2 != 0.5){
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
            while (answer3 != -20){
                try {
                    System.out.println(polyQuestions.peek());
                } catch (OperationNotSupportedException e) {
                    System.out.println(e);
                }

                System.out.print("> ");
                answer3 = input.nextDouble();
            }

        } else if (topicChoice == 2) {

        }

    }
}
