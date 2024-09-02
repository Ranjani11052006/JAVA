public class StudentGradeManager {
    
    private int grade;

    public StudentGradeManager(int initialGrade) {
        setGrade(initialGrade);
    }

    public void setGrade(int newGrade) {
        if (newGrade >= 0 && newGrade <= 100) {
            grade = newGrade;
        } else {
            System.out.println("Error: Grade must be between 0 and 100.");
        }
    }

    public int getGrade() {
        return grade;
    }

    public static void main(String[] args) {
        
        StudentGradeManager student1 = new StudentGradeManager(85);
        System.out.println("Grade after setting to 85: " + student1.getGrade()); 

        student1.setGrade(110);
        System.out.println("Grade after setting to 110: " + student1.getGrade());

        student1.setGrade(-10);
        System.out.println("Grade after setting to -10: " + student1.getGrade()); 

        student1.setGrade(0);
        System.out.println("Grade after setting to 0: " + student1.getGrade()); 

        student1.setGrade(100);
        System.out.println("Grade after setting to 100: " + student1.getGrade()); 
    }
}
