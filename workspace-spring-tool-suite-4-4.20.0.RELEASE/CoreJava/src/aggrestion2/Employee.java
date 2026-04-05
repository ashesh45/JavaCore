package aggrestion2;

public class Employee {
	private int id;
	private String name;
	private String company;
	private int salary;
	private Car car; // Has - A (aggregation) and IS -A (inheritance)
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getCompany() {
		return company;
	}
	public int getSalary() {
		return salary;
	}
	public Car getCar() {
		return car;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", company=" + company + ", salary=" + salary + ", car=" + car
				+ "]";
	}
	
	
	
	

}
