import java.util.Scanner;
public class passfail {
	public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	float marks=obj.nextFloat();
	String result=marks>=50?"Pass":"Fail";
	System.out.println(result);
}
}