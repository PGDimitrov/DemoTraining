package homework_Lesson_2;

import java.util.Scanner;

public class Exercise_6 {

    public static void main(String[] args) {

        //Write a simple program, without checks to print the result of quadratic equation.

        double a;
        double b;
        double c;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value for a: ");
        a = scanner.nextDouble();

        System.out.println("Enter value for b: ");
        b = scanner.nextDouble();

        System.out.println("Enter value for c: ");
        c = scanner.nextDouble();

        double determinant = b*b - (4*a*c);
        double sqrt = Math.sqrt(determinant);
        System.out.println("The roots are: " +(-b + sqrt)/(2*a)+ " and " +(-b - sqrt)/(2*a));
    }
}
