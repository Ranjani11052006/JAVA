 package java_practice;
import java.util.*;

public class password {
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		String correctpass="secret123";
		while(true)
		{
			System.out.print("Enter Your password:");
			String inputpass=obj.nextLine();
			if(inputpass.equals(correctpass))
			{
				System.out.println("Access granted");
				break;
			}
			else
				System.out.println("Invalid password Try again");
				
			
		}

	}

	}