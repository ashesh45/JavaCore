package com.view;

import java.util.List;
import java.util.Scanner;

import com.model.Employee;
import com.service.EmployeeService;
import com.service.EmployeeServiceImpl;

public class EmployeeView {

    static EmployeeService service = new EmployeeServiceImpl();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //add();
         //getAll();
         //delete();
        update();
    	 
    }

    // add employee
    static void add() {

        char flag = 'y';

        do {
            Employee emp = new Employee();

            System.out.println("Enter id:");
            emp.setId(sc.nextInt());

            System.out.println("Enter Name:");
            emp.setName(sc.next());

            System.out.println("Enter Employee:");
            emp.setAddress(sc.next());

            System.out.println("Enter salary:");
            emp.setSalary(sc.nextInt());

           
            service.addEmployee(emp);

            System.out.println("Do you want to add more? (y/n)");
            flag = sc.next().charAt(0);

        } while (flag == 'y');
    }

    // get all employees
    static void getAll() {

        List <Employee> list = service.getAllEmployees();
        System.out.println(list);
    }

    // delete employee
    static void delete() {

        System.out.println("Enter employee ID to delete:");
        int id = sc.nextInt();

        service.deleteEmployee(id);

        System.out.println("After deletion:");
        getAll();
    }
    
    static void update() {

        Employee emp = new Employee();

        System.out.println("Enter Employee ID to update:");
        emp.setId(sc.nextInt());

        System.out.println("Enter New Name:");
        emp.setName(sc.next());

        System.out.println("Enter New Address:");
        emp.setAddress(sc.next());

        System.out.println("Enter New Salary:");
        emp.setSalary(sc.nextInt());

        service.updateEmployee(emp);

        System.out.println("Employee updated successfully!");
    }
}