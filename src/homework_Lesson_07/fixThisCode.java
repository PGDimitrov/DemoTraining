package homework_Lesson_07;

import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class fixThisCode {

    //Fix the code to handle all possible exceptions using try/catch where needed
    //Fix the code to handle all possible exceptions – using throws where needed
    //Create all needed tests with input values in order to validate that the code works fine.

        private static FileWriter getFileWriter(String filePath) {
            FileWriter fileWriter = null;
            try {
                fileWriter = new FileWriter(filePath, true);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return fileWriter;
        }
        protected static void closeFileWriter(FileWriter fileWriter) {
            try {
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        public static void printToFile(FileWriter fileWriter, String text, int repeat) {
            for (int i = 0; i < repeat; i++) {
                try {
                    fileWriter.append(text).append("\n");
                    fileWriter.flush();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("Enter file name and path: ");
                String filePath = scanner.nextLine();
                System.out.println("Enter text content for the file: ");
                String textToAdd = scanner.nextLine();
                System.out.println("Enter int number: ");
                int howManyTimesToPrintTheTextToFile = scanner.nextInt();
                printToFile(getFileWriter(filePath), textToAdd, howManyTimesToPrintTheTextToFile);
                closeFileWriter(getFileWriter(filePath));
            } catch (InputMismatchException ime) {
                System.out.println("Enter integer number how many times to copy the text to the file.");
            }
        }
}


