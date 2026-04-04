package aggrgiation;

public class employee {
	
	private int id;
    private String name;
    private address address; // Aggregation

    // Constructor
    public employee(int id, String name, address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    // Display method
    public void displayEmployee() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.print("Employee Address: ");
        address.displayAddress();
    }

}
