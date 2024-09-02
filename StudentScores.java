import java.util.Scanner;

public class StudentScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] scores = new int[5];
        System.out.println("Enter the scores of 5 students:");

        for (int i = 0; i < scores.length; i++) {
            System.out.print("Score " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
        }
        scanner.close();
        double sum = 0;
        for (int score : scores) {
            sum += score;
        }
        double average = sum / scores.length;
        int highest = scores[0];
        for (int score : scores) {
            if (score > highest) {
                highest = score;
            }
        }
        int lowest = scores[0];
        for (int score : scores) {
            if (score < lowest) {
                lowest = score;
            }
        }
        System.out.println("\nScores:");
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println("\nAverage Score: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
    }
}
