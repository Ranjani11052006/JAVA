import java.util.Scanner;  // Import the Scanner class for user input

public class StudentGrade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object to read input

        System.out.print("Enter your marks: ");
        int marks = scanner.nextInt();  // Read the marks input from the user

        // If-else-if ladder to determine the grade
        if (marks >= 85) {
            System.out.println("Grade: A");
        } else if (marks >= 70) {
            System.out.println("Grade: B");
        } else if (marks >= 55) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }

        scanner.close();  // Close the scanner to prevent resource leaks
    }
}