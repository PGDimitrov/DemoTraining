package homework_Lesson_6;

public class ComputeAverageOfThreeNumbers {

    public static void main(String[] args) {
        //Write a Java method to compute the average of three numbers.

        ComputeAverageOfThreeNumbers averageOfThreeNumbers = new ComputeAverageOfThreeNumbers();
        System.out.println(averageOfThreeNumbers.computeAverageOfThreeNumbers(0,5,10));
        System.out.println(averageOfThreeNumbers.computeAverageOfThreeNumbers(12,4,3));
        System.out.println(averageOfThreeNumbers.computeAverageOfThreeNumbers(0,5,-1));
        System.out.println(averageOfThreeNumbers.computeAverageOfThreeNumbers(0,0,0));
        System.out.println(averageOfThreeNumbers.computeAverageOfThreeNumbers(-1,-5,-10));

    }

    public double computeAverageOfThreeNumbers (double x, double y, double z) {
        return ((x + y + z) / 3);
    }
}
