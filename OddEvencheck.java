import java.util.Scanner;

public class OddEvenCheck {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); // Read the number input by the user

        // Check if the number is even or odd
        if (number % 2 == 0) {
            // If the remainder when divided by 2 is 0, the number is even
            System.out.println(number + " is even.");
        } else {
            // If the remainder is not 0, the number is odd
            System.out.println(number + " is odd.");
        }

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}