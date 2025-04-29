// Course.java
public class Course {
    // Instance variables
    String courseName;
    String courseCode;

    // Constructor to initialize the course object
    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    // Method to display course information
    public void displayCourseInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
    }

    // Main method to test the Course class
    public static void main(String[] args) {
        // Create a new Course object
        Course course1 = new Course("Java Programming", "CS101");

        // Display course information
        course1.displayCourseInfo();
    }
}
