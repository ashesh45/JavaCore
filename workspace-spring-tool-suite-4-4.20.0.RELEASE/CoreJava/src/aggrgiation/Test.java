package aggrgiation;

public class Test {
	
	public static void main(String[] args) {
        // Create Address object
        address addr = new address("Kathmandu", "Bagmati");

        // Pass Address object to Employee
        employee emp = new employee(101, "Ashesh", addr);

        // Display employee details
        emp.displayEmployee();
    }

}
