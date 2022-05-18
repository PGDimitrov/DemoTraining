package homework_Lesson_2;

import java.util.Scanner;

public class Exercise_2_JAVA_input {

    public static void main(String[] args) {

        //Print the perimeter of a triangle by given sides. Use formula to calculate it.
        double sideA;
        double sideB;
        double sideC;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side A: ");
        sideA = scanner.nextDouble();

        System.out.println("Enter side B: ");
        sideB = scanner.nextDouble();

        System.out.println("Enter side C: ");
        sideC = scanner.nextDouble();

        double perimeter = sideA + sideB + sideC;

        System.out.println("The perimeter of the triangle is: " +perimeter);

    }

}

