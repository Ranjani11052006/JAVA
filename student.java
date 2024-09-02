
	package java_practice;
	import java.util.*;

	public class student {
		public static void main(String args[])
		{
			Scanner obj=new Scanner(System.in);
			int num=5;
			double[] scores=new double[num];
			for(int i=0;i<num;i++)
			{
				System.out.print("Enter the scores of students"+(i+1)+":");
				scores[i]=obj.nextDouble();
				
				
			}
			int sum=0;
			for(int i=0;i<scores.length;i++)
				sum+=scores[i];
			double average= sum/scores.length;
			System.out.println("Average:"+average);
			Arrays.sort(scores);
			System.out.println("Maximum marks:"+scores[4]);
			System.out.println("Minimum marks:"+scores[0]);
			
			
					
			
			
		}
	}


