package homework_Lesson_6;

public class FindSmallestNumber {

    public static void main(String[] args) {

        //Write a Java method to find the smallest number among three numbers.

        FindSmallestNumber smallestNumber = new FindSmallestNumber();
        smallestNumber.findSmallestNumber(0,5,10);
        smallestNumber.findSmallestNumber(12,4,3);
        smallestNumber.findSmallestNumber(0,5,-1);
        smallestNumber.findSmallestNumber(0,0,0);
        smallestNumber.findSmallestNumber(-1,-5,-10);
    }

        public void findSmallestNumber (int x, int y, int z) {
            if (x <= y && x <= z) {
                System.out.println("The smallest number is: " + x);
            }
            else if (y <= x && y <= z) {
                System.out.println("The smallest number is " +y);
            }
            else {
                System.out.println("The smallest number is: " +z);
            }
        }

}
