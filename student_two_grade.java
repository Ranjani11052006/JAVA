import java.util.*;
class student{
    String name;
    double HW_grade,FE_grade,avg_grade;
    public student(String name,double HW_grade,double FE_grade){
        this.name=name;
        this.HW_grade=HW_grade;
        this.FE_grade=FE_grade;
        this.avg_grade=(this.HW_grade+this.FE_grade)/2;

    }
    public void display(){
        System.out.println(" Student Name:"+this.name);
        System.out.println(" Homework Grade:"+this.HW_grade);
        System.out.println("Final Exam Grade:"+this.FE_grade);
        System.out.println("Average Grade:"+this.avg_grade);
    }
}

public class student_two_grade {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Name:");
        String name=s.nextLine();
        System.out.print("Homework Grade:");
        double HW=s.nextDouble();
        System.out.print("Final Exam Grade:");
        double FE=s.nextDouble();
        student obj=new student(name,HW,FE);
        obj.display();
        
    }
}
