package homework_Lesson_07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideTwoNumbers {

    public static void main(String[] args) {
        //Write a program which reads two numbers from the console and divide them.
        //Handle the following exceptions – wrong input values / division by 0

        Scanner scanner = new Scanner(System.in);

        int a = 0;
        int b = 0;

        try {
            System.out.println("Enter number a: ");
            a = scanner.nextInt();

            System.out.println("Enter number b: ");
            b = scanner.nextInt();
        } catch (InputMismatchException ime) {
            System.out.println("The entered input is not an integer!");
        }

        try {
            System.out.println("Result of a/b= " + a/b);
        } catch (ArithmeticException ae) {
            System.out.println("Division by zero is forbidden!");
        }

    }
}
