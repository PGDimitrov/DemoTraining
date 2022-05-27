package homework_Lesson_5;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseElementsInLinkedList {

    public static void main(String[] args) {

        //Reverse the order of the elements in a LinkedList using algorithms.

        LinkedList<String> towns = new LinkedList<>();
        towns.add("Sofia");
        towns.add("Plovdiv");
        towns.add("Varna");
        towns.add("Bourgas");

        System.out.println("LinkedList element before reverse is: " +towns);

        Collections.reverse(towns);
//        for (String i : towns) ;
        System.out.print("LinkedList elements after reverse is: " +towns);
    }
}
