package aggregiation1;

public class Test {
	
	 public static void main(String[] args) {
	        // Create students
	        Student s1 = new Student(1, "Ashesh");
	        Student s2 = new Student(2, "Bikesh");
	        Student s3 = new Student(3, "Chirag");

	        // Create department
	        Department dept = new Department("Computer Science");

	        // Add students to department
	        dept.addStudent(s1);
	        dept.addStudent(s2);
	        dept.addStudent(s3);

	        // Display department details
	        dept.displayDepartment();
	    }

}
