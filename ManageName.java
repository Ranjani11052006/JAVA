import java.util.Scanner;

public class ManageName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[5];
        System.out.println("Enter the names of 5 attendees:");

        for (int i = 0; i < names.length; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }
        scanner.close();
        String longestName = names[0];
        for (String name : names) {
            if (name.length() > longestName.length()) {
                longestName = name;
            }
        }
        String shortestName = names[0];
        for (String name : names) {
            if (name.length() < shortestName.length()) {
                shortestName = name;
            }
        }
        System.out.println("\nNames in Reverse Order:");
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.print(names[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println("\nLongest Name: " + longestName);
        System.out.println("Shortest Name: " + shortestName);
    }
}
