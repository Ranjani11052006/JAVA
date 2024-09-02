public class Student {
    private String name;
    private String id;  

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static void main(String[] args) {
        
        Student student1 = new Student("Alice", "S001");
        System.out.println("Name: " + student1.getName());  
        System.out.println("ID: " + student1.getId());      

        student1.setName("Bob");
        student1.setId("S002");
        System.out.println("Name: " + student1.getName());  
        System.out.println("ID: " + student1.getId());      

        Student student2 = new Student("Charlie", "S003");
        System.out.println("Name: " + student2.getName());  
        System.out.println("ID: " + student2.getId());      

        Student student3 = new Student("", "");
        System.out.println("Name: " + student3.getName());  
        System.out.println("ID: " + student3.getId()); 

        
        student2.setName("Dave");
        student2.setId("S004");
        System.out.println("Name: " + student2.getName());  
        System.out.println("ID: " + student2.getId());  
    }
}
