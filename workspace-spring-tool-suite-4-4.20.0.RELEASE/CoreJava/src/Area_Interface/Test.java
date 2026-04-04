package Area_Interface;

public class Test {

	
	 public static void main(String[] args) {

	        Shape s1 = new Rectangle(10, 5);
	        Shape s2 = new Circle(7);
	        Shape s3 = new Triangle(6, 4);

	        System.out.println("Rectangle Area: " + s1.getArea());
	        System.out.println("Circle Area: " + s2.getArea());
	        System.out.println("Triangle Area: " + s3.getArea());
	    }
	
}
