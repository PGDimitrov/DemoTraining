package homework_Lesson_4;

import java.text.BreakIterator;
import java.util.Scanner;

public class TriangleProgram {
    public static void main(String[] args) {

        double angle1;
        double angle2;
        double angle3;
        double anglesSum;

        //The angles are taken from the user input.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value for angle1");
        angle1 = scanner.nextDouble();

        System.out.println("Enter value for angle2");
        angle2 = scanner.nextDouble();

        System.out.println("Enter value for angle3");
        angle3 = scanner.nextDouble();

        anglesSum = angle1 + angle2 + angle3;

        //There are 2 possible outputs – the triangle can’t be built based on the angle values, or the triangle can be built based on the angle values.
        //triangle can be build when the sum=180 and each angle>0 and angle<180
        if ((angle1 > 0) && (angle2 > 0) && (angle3 > 0)) {
            if (anglesSum == 180) {
                System.out.println("The triangle can be built based on the angle values.");

                //triangle type – acute (остроъгълен), right-angled (правоъгълен), obtuse (тъпоъгълен), equilateral (равностранен), isosceles (равнобедрен), multifaceted (разностранен).
                if ((angle1 < 90) && (angle2 < 90) && (angle3 < 90)) {
                    System.out.print("The triangle is: acute");
                    //equilateral
                    if (angle1 == angle2 && angle2 == angle3 && angle1 == angle3) {
                        System.out.print(" and equilateral.");
                    }
                    //isosceles
                    else if (angle1 == angle2 || angle2 == angle3 || angle1 == angle3) {
                        System.out.print(" and isosceles.");
                    }
                    //multifaceted
                    else if (angle1 != angle2 && angle2 != angle3 && angle1 != angle3) {
                        System.out.println(" and multifaceted.");
                    }

                } else if ((angle1 == 90) || (angle2 == 90) || (angle3 == 90)) {
                    System.out.print("The triangle is: right-angled");
                    //equilateral - not possible
                    //isosceles
                    if (angle1 == angle2 || angle2 == angle3 || angle1 == angle3) {
                        System.out.print(" and isosceles.");
                    }
                    //multifaceted
                    else if (angle1 != angle2 && angle2 != angle3 && angle1 != angle3) {
                        System.out.println(" and multifaceted.");
                    }
                } else {
                    System.out.print("The triangle is: obtuse");
                //isosceles
                    if (angle1 == angle2 || angle2 == angle3 || angle1 == angle3) {
                    System.out.println(" and isosceles.");
                }
                //multifaceted
                    else if (angle1 != angle2 && angle2 != angle3 && angle1 != angle3) {
                    System.out.println(" and multifaceted.");
                    }
                }
            }

            else{
                System.out.println("Angles sum must be equal to 180.");
            }
        }

        else {
            System.out.println("The triangle can't be built based on the angle values.");
        }

    }
}
