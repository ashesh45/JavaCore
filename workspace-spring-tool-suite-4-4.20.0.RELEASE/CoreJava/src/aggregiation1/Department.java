package aggregiation1;

import java.util.ArrayList;

public class Department {
	
	private String deptName;
    private ArrayList<Student> students; // Aggregation: Department HAS-A list of Students

    // Constructor
    public Department(String deptName) {
        this.deptName = deptName;
        students = new ArrayList<>(); // Initialize ArrayList
    }

    // Add student to department
    public void addStudent(Student s) {
        students.add(s);
    }

    // Display department and all students
    public void displayDepartment() {
        System.out.println("Department: " + deptName);
        System.out.println("Students in Department:");
        for (Student s : students) {
            s.displayStudent();
        }
    }

}
