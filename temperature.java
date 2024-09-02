import java.util.Scanner; 
public class temperature {
		public static void main(String[]args)
		{
			Scanner obj=new Scanner(System.in);
	        double temp=obj.nextDouble();
	        double celcius=(temp-32)*0.5/0.9;
	        System.out.print("Celcius"+celcius);

		    
		}

	}


