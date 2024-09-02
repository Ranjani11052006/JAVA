import java.util.Scanner;
public class patternstar {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of levels for the pyramid: ");
        int levels = scanner.nextInt();

        for (int i = 1; i <= levels; i++) {
            
            for (int j = 1; j <= levels - i; j++) {
                System.out.print(" ");
            }

            
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            
            System.out.println();
        }

     
    }


	}