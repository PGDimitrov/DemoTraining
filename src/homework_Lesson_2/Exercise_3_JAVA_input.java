package homework_Lesson_2;

import java.util.Scanner;

public class Exercise_3_JAVA_input {

    public static void main(String[] args) {

        //Print the area of a triangle by given sides. Use formula to calculate it.

        double side;
        double height;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side of the triangle: ");
        side = scanner.nextDouble();

        System.out.println("Enter height of the triangle: ");
        height = scanner.nextDouble();

        double surface = side*height/2;

        System.out.println("The area of the triangle is: " + surface);

    }
}
