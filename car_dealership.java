import java.util.*;
class car_dealer{
    String make,model;
    int year;
    double price;
    public car_dealer(String make,String model,int year,double price)
    {
        this.make=make;
        this.model=model;
        this.year=year;
        this.price=price;

    }
    public void display(){
        System.out.println("Make:"+this.make);
        System.out.println("Model:"+this.model);
        System.out.println("Year:"+this.year);
        System.out.println("Price:"+this.price);

    }
} 

public class car_dealership {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        System.out.print("Enter car make:");
        String make=s.nextLine();
        System.out.print("Enter car model:");
        String model=s.nextLine();
        System.out.print("Enter car year:");
        int year=s.nextInt();
        System.out.print("Enter car price:");
        double price=s.nextInt();
        car_dealer obj=new car_dealer(make,model,year,price);
        obj.display();
        
    }
}
import java.util.*;
class car_dealer{
    String make,model;
    int year;
    double price;
    public car_dealer(String make,String model,int year,double price)
    {
        this.make=make;
        this.model=model;
        this.year=year;
        this.price=price;

    }
    public void display(){
        System.out.println("Make:"+this.make);
        System.out.println("Model:"+this.model);
        System.out.println("Year:"+this.year);
        System.out.println("Price:"+this.price);

    }
} 

public class car_dealership {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        System.out.print("Enter car make:");
        String make=s.nextLine();
        System.out.print("Enter car model:");
        String model=s.nextLine();
        System.out.print("Enter car year:");
        int year=s.nextInt();
        System.out.print("Enter car price:");
        double price=s.nextInt();
        car_dealer obj=new car_dealer(make,model,year,price);
        obj.display();
        
    }
}
