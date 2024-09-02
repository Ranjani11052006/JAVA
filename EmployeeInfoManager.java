public class EmployeeInfoManager {

    private String name;
    private double salary;

    public EmployeeInfoManager(String initialName, double initialSalary) {
        name = initialName;
        setSalary(initialSalary);
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double newSalary) {
        if (newSalary >= 0) {
            salary = newSalary;
        } else {
            System.out.println("Error: Salary cannot be negative.");
        }
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {

        EmployeeInfoManager employee1 = new EmployeeInfoManager("John Doe", 50000.0);
        System.out.println("Name after setting to 'John Doe': " + employee1.getName()); 

        
        System.out.println("Salary after setting to 50000.0: " + employee1.getSalary()); 

        
        employee1.setSalary(-10000.0);
        System.out.println("Salary after attempting to set to -10000.0: " + employee1.getSalary()); 

        
        employee1.setSalary(0.0);
        System.out.println("Salary after setting to 0.0: " + employee1.getSalary()); 

        
        employee1.setName("Jane Smith");
        System.out.println("Name after changing to 'Jane Smith': " + employee1.getName());
    }
}
