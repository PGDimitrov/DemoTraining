package homework_Lesson_2;

import java.util.Scanner;

public class Exercise_1_JAVA_input {

    public static void main(String[] args) {

        //Store your names in 3 different variables and print your whole name
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter your middle name: ");
        String middleName = scanner.nextLine();

        System.out.println("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.println("My full name is: " +firstName +" " +middleName +" " +lastName);
    }

}
