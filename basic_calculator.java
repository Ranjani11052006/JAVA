import java.util.*;
public class basic_calculator {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        while(true){
            System.out.println("1.addition,2.subtration,3.multiplication,4.division,5.exit");
            
            System.out.println("Enter your choice:");
            int n=s.nextInt();
            if(n==5){
                break;
            }
            int a,b;
            System.out.println("enter first number:");
            a=s.nextInt();
            System.out.println("enter second number:");
            b=s.nextInt();
            switch (n) {
                case 1:
                    System.out.println("addition of this numbers is:"+(a+b));
                    break;
                case 2:
                    System.out.println("subtraction of this numbers is:"+(a-b));
                    break;
                case 3:
                    System.out.println("multiplication of this numbers is:"+(a*b));
                    break;
                case 4:
                    System.out.println("division of this numbers is:"+(a/b));
                    break;
            
                default:
                    System.out.println("enter correct choice");
                    break;
            }
        }
    }
    
}
import java.util.*;
public class basic_calculator {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        while(true){
            System.out.println("1.addition,2.subtration,3.multiplication,4.division,5.exit");
            
            System.out.println("Enter your choice:");
            int n=s.nextInt();
            if(n==5){
                break;
            }
            int a,b;
            System.out.println("enter first number:");
            a=s.nextInt();
            System.out.println("enter second number:");
            b=s.nextInt();
            switch (n) {
                case 1:
                    System.out.println("addition of this numbers is:"+(a+b));
                    break;
                case 2:
                    System.out.println("subtraction of this numbers is:"+(a-b));
                    break;
                case 3:
                    System.out.println("multiplication of this numbers is:"+(a*b));
                    break;
                case 4:
                    System.out.println("division of this numbers is:"+(a/b));
                    break;
            
                default:
                    System.out.println("enter correct choice");
                    break;
            }
        }
    }
    
}
