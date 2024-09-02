package java_practice;
import java.util.Scanner;
public class bmi {
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		//weight in kg
		double weight=obj.nextDouble();
		//height 
		double height=obj.nextDouble();
		double BMI=weight/(height*height);
		if(BMI < 18.5)
			System.out.print("Underweight");
		else if(BMI>=18.5 && BMI<24.9)
			System.out.print("Normal Weight");
		else if(BMI>=25 && BMI<29.9)
			System.out.print("Overweight");
		else
			System.out.print("Obe