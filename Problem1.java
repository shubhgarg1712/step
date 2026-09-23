public class Problem1 {
    public static void main(String[] args) {
        Student student = new Student(101, "Rahul", "Artificial Intelligence");
        Course course = new Course("AI101", "Java Programming", 4);

        System.out.println("STUDENT INFORMATION");
        student.displayStudent();

        System.out.println("\nCOURSE INFORMATION");
        course.displayCourse();
    }
}

class Student {
    private int studentId;
    private String name;
    private String department;

    public Student(int studentId, String name, String department) {
        this.studentId = studentId;
        this.name = name;
        this.department = department;
    }

    public void displayStudent() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + name);
        System.out.println("Department: " + department);
    }
}

class Course {
    private String courseId;
    private String courseName;
    private int credits;

    public Course(String courseId, String courseName, int credits) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credits = credits;
    }

    public void displayCourse() {
        System.out.println("Course ID: " + courseId);
        System.out.println("Course Name: " + courseName);
        System.out.println("Credits: " + credits);
    }
}
