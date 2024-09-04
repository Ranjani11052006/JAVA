import java.util.Scanner;

public class ManageGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] scores = new int[3][4]; // 3 students, 4 subjects (Math, Science, English, History)
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Enter scores for Student " + (i + 1) + ":");
            System.out.print("Math: ");
            scores[i][0] = scanner.nextInt();
            System.out.print("Science: ");
            scores[i][1] = scanner.nextInt();
            System.out.print("English: ");
            scores[i][2] = scanner.nextInt();
            System.out.print("History: ");
            scores[i][3] = scanner.nextInt();
        }
        scanner.close();
        calculateAndPrintStudentAverages(scores);
        calculateAndPrintSubjectAverages(scores);
    }
    public static void calculateAndPrintStudentAverages(int[][] scores) {
        System.out.println("Average scores for each student:");
        for (int i = 0; i < scores.length; i++) {
            double total = 0;
            for (int j = 0; j < scores[i].length; j++) {
                total += scores[i][j];
            }
            double average = total / scores[i].length;
            System.out.println("Student " + (i + 1) + ": " + average);
        }
    }
    public static void calculateAndPrintSubjectAverages(int[][] scores) {
        System.out.println("Average scores for each subject:");
        String[] subjects = {"Math", "Science", "English", "History"};
        
        for (int j = 0; j < scores[0].length; j++) {
            double total = 0;
            for (int i = 0; i < scores.length; i++) {
                total += scores[i][j];
            }
            double average = total / scores.length;
            System.out.println(subjects[j] + ": " + average);
        }
    }
}
