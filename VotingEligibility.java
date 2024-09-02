import java.util.Scanner;  // Import the Scanner class for user input

public class VotingEligibility {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object to read input

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();  // Read the age input from the user

        // If-else statement to check voting eligibility
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        scanner.close();  // Close the scanner to prevent resource leaks
    }
}