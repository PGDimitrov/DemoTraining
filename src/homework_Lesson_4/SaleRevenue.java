package homework_Lesson_4;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class SaleRevenue {

    public static void main(String[] args) {

        //Write a Java program to calculate the revenue from a sale based on the unit price and quantity of a product input by the user.
        // The discount rate is 15% for the quantity purchased between 100 and 120 units and 20% for the quantity purchased greater than 120 units.
        // If the quantity purchased is less than 100 units, the discount rate is 0%. See the example output as shown below:
        //Enter unit price: 25
        // Enter quantity: 110
        // The revenue from sale: 2337.5$
        // Discount: 412.5$(15.0%)

        double unitPrice;
        double quantity;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter unit price:");
        unitPrice = scanner.nextDouble();

        System.out.println("Enter quantity:");
        quantity = scanner.nextDouble();

        //revenue=price*quantity
        //discount=15% when purchased units are between 100 and 120
        //discount=20% when purchased units are greater than 120

        double revenue = unitPrice*quantity;
        double discount15 = unitPrice*quantity - (unitPrice*quantity)*15/100;
        double discount20 = unitPrice*quantity - (unitPrice*quantity)*20/100;

        if (quantity > 0 && unitPrice >=0) {
            if (quantity < 100) {
                System.out.println("The revenue from sale: " +(revenue) +("$"));
                System.out.println("Discount: 0$ (0.0%)");
             }

            if (quantity >=100 && quantity <=120) {
                System.out.println("The revenue from sale: " +discount15 +("$"));
                System.out.println("Discount: " +(revenue-discount15) +("$") +( "(15.0%)"));
            }

            if (quantity > 120) {
                System.out.println("The revenue from sale: " +discount20 +("$"));
                System.out.println("Discount: " +(revenue-discount20) +("$") +(" (20.0%)"));
            }
        }

        else {
            System.out.println("Entered values are not relevant.");
        }
    }
}
