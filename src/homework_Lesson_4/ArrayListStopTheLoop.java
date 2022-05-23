package homework_Lesson_4;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;

public class ArrayListStopTheLoop {

    public static void main(String[] args) {

        //Given a list, iterate it and display numbers which are divisible by 5 and
        // if you find a number greater than 150, stop the loop iteration list1 = [12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200]

        int [] array = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};
        System.out.println("The initial array is: " + Arrays.toString(array));

        System.out.print("The numbers divisible by 5 and not greater than 150 are: [");
        for (int i = 0; i < array.length; i++) {
            if (array[i]%5 == 0) {
                if (array[i] > 150) {
                    break;
                }
                System.out.print(" " + array[i] + ",");
            }
        }
        System.out.println("]");
    }

}
