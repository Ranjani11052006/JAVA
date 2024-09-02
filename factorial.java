import java.util.Scanner;
public class factorial {

		public static void main(String [] args)
		{
			Scanner obj=new Scanner(System.in);
			System.out.print("Enter a positive integer");
			int n=obj.nextInt();
			int i=1;
			long fact=1;
			while(i<=n)
			{
				fact=fact*i;
				i=i+1;
				
			}
			System.out.println("factorial of "+n+" is :"+fact);
			
		}
	}

