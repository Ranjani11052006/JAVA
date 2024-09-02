import java.util.Scanner;
public class bankwithdraw {
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		float Currentbalance=obj.nextFloat();
		float withdrawal=obj.nextFloat();
		float newbalance=Currentbalance-withdrawal;
		if(withdrawal>=Currentbalance)
		{
			System.out.println("Error Insufficient Balance");
		}
		else 
		{
			System.out.println("Withdraw Successfull");
			System.out.print( "newbalance"+newbalance);
		}
	}
}


