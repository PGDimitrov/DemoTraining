package homework_Lesson_2;

import java.util.Scanner;

public class Exercise_4 {

    public static void main(String[] args) {

        //Print pine tree using asterisks in the console.

        //set tree height
        double treeHeight;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the  height: ");
        treeHeight = scanner.nextDouble();

        for (double i=1; i<=treeHeight; i++) {

            //empty character
            for (double space=1; space<=treeHeight-i; space++){
                System.out.print(" ");
            }

            //print stars
            for (double star=1; star<=i*2-1; star++){
                System.out.print("*");
            }

            //print new line
            System.out.println();

        }
    }
}
