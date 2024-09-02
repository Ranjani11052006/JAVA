import java.util.*;
class employees{
    String name;
    int id;
    double basic_salary,allowance,gross_salary;
    public employees(String name,int id,double basic_salary,double allowance){
        this.name=name;
        this.id=id;
        this.basic_salary=basic_salary;
        this.allowance=allowance;
        this.gross_salary=this.basic_salary+this.allowance;
    }
    public void display(){
        System.out.println("Name:"+this.name);
        System.out.println("ID:"+this.id);
        System.out.println("Basic Salary: $"+this.basic_salary);
        System.out.println("Allowances: $"+this.allowance);
        System.out.println("Gross Salary: $"+this.gross_salary);

    }

}
public class employee_management {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter number of employees:");
        int n=s.nextInt();
        employees[] employee=new employees[n];
        if(n==0){
            System.out.println("The program should terminate gracefully without any additional input or output since there are no\r\n" + //
