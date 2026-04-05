package aggrestion2;

public class Test {
	public static void main(String[] args) {
		Car c = new Car();
		Employee e = new Employee();
		
		c.setColor("red");
		c.setModel("bmw");
		c.setPrice(900000);
		
		e.setId(1);
		e.setCompany("cg");
		e.setName("hari");
		e.setSalary(686);
		e.setCar(c);
		System.out.println(e.getId());
		System.out.println(e.getCar());
		System.out.println(e.getName());
		System.out.println(e.getSalary());
		System.out.println(e.getCompany());
		
		System.out.println("car info");
		System.out.println("color"+e.getCar().getColor());
		System.out.println("brand "+ e.getCar().getModel());
		System.out.println("price"+e.getCar().getPrice());
		
	}

}
