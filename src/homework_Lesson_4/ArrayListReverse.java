package homework_Lesson_4;

import java.util.Enumeration;

public class ArrayListReverse {

    public static void main(String[] args) {

        //Reverse the following list using for loop list1 = [10, 20, 30, 40, 50]

        int [] array = {10, 20, 30, 40, 50};
        int [] reverseArray = new int[5];
        int j = reverseArray.length-1;

        for (int i = 0; i < array.length; i++) {
        reverseArray[i] = array[j];
        System.out.println(reverseArray[i]);
        j--;
        }

    }
}
