package aggregiation1;

public class Student {
	
	private int id;
    private String name;

    // Constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Display student info
    public void displayStudent() {
        System.out.println("Student ID: " + id + ", Name: " + name);
    }

}
