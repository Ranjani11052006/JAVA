
package java_practice;
import java.util.*;

public class multiplication {
	public static void main(String [] args)
	{
		Random rand=new Random();
		while(true)
		{
			int a=rand.nextInt(11);
			int b=rand.nextInt(11);
			int mul=a*b;
			System.out.println("What is "+a+"*"+b);
			Scanner obj=new Scanner(System.in);
			System.out.print("Enter Your answer");
			int ans=obj.nextInt();
			if(ans==0)
			{
				System.out.println("Thank You");
				break;
			}
			else if(mul==ans) 
				System.out.println("correct");
		

			else
				System.out.println("Incorrect.The correct answer is"+mul);
				
			
			
		}
			
		
	}

}