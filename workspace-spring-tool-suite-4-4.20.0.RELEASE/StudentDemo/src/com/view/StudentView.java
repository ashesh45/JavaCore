package com.view;

import java.util.List;
import java.util.Scanner;

import com.model.Student;
import com.service.StudentService;
import com.service.StudentServiceImpl;

public class StudentView  {
	
	 static StudentService service = new StudentServiceImpl();
	    static Scanner sc = new Scanner(System.in);

	    public static void main(String[] args) {

	        int choice;

	        do {
	            System.out.println("\n===== STUDENT MENU =====");
	            System.out.println("1. Add Student");
	            System.out.println("2. View All");
	            System.out.println("3. Search Student");
	            System.out.println("4. Update Student");
	            System.out.println("5. Delete Student");
	            System.out.println("6. Exit");

	            System.out.print("Enter choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1: add(); break;
	                case 2: getAll(); break;
	                case 3: search(); break;
	                case 4: update(); break;
	                case 5: delete(); break;
	                case 6: System.out.println("Bye!"); break;
	                default: System.out.println("Invalid choice!");
	            }

	        } while (choice != 6);
	    }

	    static void add() {
	        Student s = new Student();

	        System.out.print("Enter ID: ");
	        s.setId(sc.nextInt());

	        System.out.print("Enter Name: ");
	        s.setName(sc.next());

	        System.out.print("Enter Faculty: ");
	        s.setFaculty(sc.next());

	        System.out.print("Enter Marks: ");
	        s.setMarks(sc.nextDouble());

	        service.addStudent(s);
	    }

	    static void getAll() {
	        List<Student> list = service.getAllStudents();

	        for (Student s : list) {
	            System.out.println("-------------------");
	            System.out.println("ID: " + s.getId());
	            System.out.println("Name: " + s.getName());
	            System.out.println("Faculty: " + s.getFaculty());
	            System.out.println("Marks: " + s.getMarks());
	        }
	    }

	    static void search() {
	        System.out.print("Enter ID to search: ");
	        int id = sc.nextInt();

	        Student s = service.searchStudent(id);

	        if (s != null) {
	            System.out.println("Found:");
	            System.out.println("Name: " + s.getName());
	            System.out.println("Faculty: " + s.getFaculty());
	            System.out.println("Marks: " + s.getMarks());
	        } else {
	            System.out.println("Student not found!");
	        }
	    }

	    static void update() {
	        Student s = new Student();

	        System.out.print("Enter ID to update: ");
	        s.setId(sc.nextInt());

	        System.out.print("Enter new Name: ");
	        s.setName(sc.next());

	        System.out.print("Enter new Faculty: ");
	        s.setFaculty(sc.next());

	        System.out.print("Enter new Marks: ");
	        s.setMarks(sc.nextDouble());

	        service.updateStudent(s);
	    }

	    static void delete() {
	        System.out.print("Enter ID to delete: ");
	        int id = sc.nextInt();

	        service.deleteStudent(id);
	    }
}