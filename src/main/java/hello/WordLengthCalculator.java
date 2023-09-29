package hello;

import java.util.Scanner;

public class WordLengthCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = scanner.nextLine();

        int length = input.length();

        System.out.println("Length of the entered word: " + length);

        scanner.close();
    }
}
