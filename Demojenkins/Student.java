// Student.java
public class Student {
    // Instance variables
    private String name;
    private int age;
    private double grade;

    // Constructor to initialize the student object
    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Getter and Setter methods for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter methods for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter and Setter methods for grade
    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    // Method to display student information
    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student Grade: " + grade);
    }

    // Main method to test the Student class
    public static void main(String[] args) {
        // Create a new Student object
        Student student1 = new Student("iram", 20, 85.5);
        
        // Display student information
        student1.displayStudentInfo();
        
        // Create another Student object
        Student student2 = new Student("misbha", 22, 90.0);
        
        // Display student information for second student
        student2.displayStudentInfo();
    }
}
