// Employee.java
public class Employee {
    // Instance variables
    private String name;
    private int age;
    private double salary;

    // Constructor to initialize the employee object
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
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

    // Getter and Setter methods for salary
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to display employee information
    public void displayEmployeeInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
        System.out.println("Employee Salary: " + salary);
    }

    // Main method to test the Employee class
    public static void main(String[] args) {
        // Create a new Employee object
        Employee employee1 = new Employee("Iram", 19, 55000.0);
        
        // Display employee information
        employee1.displayEmployeeInfo();
    }
}
