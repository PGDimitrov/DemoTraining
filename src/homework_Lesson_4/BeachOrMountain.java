package homework_Lesson_4;

import java.util.Objects;
import java.util.Scanner;

public class BeachOrMountain {

    public static void main(String[] args) {

        //Write a program which advises the user where to go to a vacation based on the type of vacation and the budget.
        //There should be 2 options – Beach, Mountain.
        //If the user puts a different value, then the program should print a message that there is no information about this type of vacation.
        //Budgets are considered per day per person.
        //If the budget per day for a Beach type vacation is smaller than 50, then the program should advise Bulgaria as a destination, otherwise Outside Bulgaria.
        //If the budget per day for a Mountain type vacation is smaller than 30, then the program should advise Bulgaria as a destination, otherwise Outside Bulgaria.

        String holidayType;
        int numberOfDays;
        int numberOfPersons;
        double totalBudget;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter type of vacation: Beach or Mountain");
        holidayType = scanner.next();

        String Beach = "Beach";
        String mountain = "Mountain";

        if (Objects.equals(holidayType, "Beach")) {

            System.out.println("Enter number of days");
            numberOfDays = scanner.nextInt();

            System.out.println("Enter number of persons");
            numberOfPersons = scanner.nextInt();

            System.out.println("Enter total holiday budget");
            totalBudget = scanner.nextDouble();

            double budgetPerDay = (totalBudget) / (numberOfDays * numberOfPersons);

            if (numberOfDays <= 0 || numberOfPersons <=0 || totalBudget <=0 || budgetPerDay <=0) {
                System.out.println("Not a valid values!");
            }

                else if (budgetPerDay < 50) {
                    System.out.println("We advise you to choose a bulgarian beach as destination.");
                }

                else if (budgetPerDay >= 50) {
                    System.out.println("We advise you to choose a beach destination outside Bulgaria.");
                }
            }

        else if (Objects.equals(holidayType, "Mountain")) {

            System.out.println("Enter number of days");
            numberOfDays = scanner.nextInt();

            System.out.println("Enter number of persons");
            numberOfPersons = scanner.nextInt();

            System.out.println("Enter total holiday budget");
            totalBudget = scanner.nextDouble();

            double budgetPerDay = (totalBudget) / (numberOfDays * numberOfPersons);

            if (numberOfDays <= 0 || numberOfPersons <=0 || totalBudget <=0 || budgetPerDay <=0) {
                System.out.println("Not a valid values!");
            }

            else if (budgetPerDay < 30) {
                System.out.println("We advise you to choose a bulgarian mountain as destination.");
            }

            else if (budgetPerDay >= 30) {
                System.out.println("We advise you to choose a mountain holiday outside Bulgaria.");
            }

        }

        else {
            System.out.println("There is no information about this type of vacation.");
        }

    }

}


