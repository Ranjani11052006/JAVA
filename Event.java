import java.util.*;

public class Event {
	public static void main(String args [])
	{
		Scanner obj=new Scanner(System.in);
		int num=5;
		String[] attendes=new String[num];
		for(int i=0;i<num;i++) {
			System.out.println("Enter a name "+(i+1)+":");
			attendes[i]=obj.nextLine();
		}
		String Shortest=attendes[0];
		String longest=attendes[0];
		for(String name:attendes)
		{
			if(name.length() < Shortest.length())
			{
				Shortest=name;
			}
			if(name.length()> longest.length())
			{
				longest=name;
			}
			
		}
		for(int i=attendes.length-1;i>=0;i--) {
			System.out.println(attendes[i]);
		}
		
		System.out.println("Shortest:"+Shortest);
		System.out.println("Longest:"+longest);
		
		
		
	}
	
}