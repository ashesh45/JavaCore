package com.service;

import java.util.ArrayList;
import java.util.List;

import com.model.Student;

public class StudentServiceImpl implements StudentService {
	
	
	List<Student> list = new ArrayList<>();

	@Override
	public void addStudent(Student s) {
		// TODO Auto-generated method stub
		list.add(s);
		System.out.println("Student added sucessfully");		
		
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		 list.removeIf(s -> s.getId() == id);
	     System.out.println("Student deleted!");
	}

	@Override
	public List<Student> getAllStudents() {
		        return list;
	}

	@Override
	public void updateStudent(Student s) {
		for (Student st : list) {
            if (st.getId() == s.getId()) {
                st.setName(s.getName());
                st.setFaculty(s.getFaculty());
                st.setMarks(s.getMarks());
                System.out.println("Student updated!");
                return;
            }
		}
		System.out.println("Sudent not found");
		
	}

	@Override
	public Student searchStudent(int id) {
		// TODO Auto-generated method stub
		for (Student s : list) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }
	}

