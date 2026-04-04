package MethodOverloading;

public class Test {
	
	 public static void main(String[] args) {
	        calculator calc = new calculator();

	        // Test cases
	        int sumTwo = calc.add(10, 20);
	        System.out.println("Sum of 2 integers: " + sumTwo);

	        int sumThree = calc.add(5, 10, 15);
	        System.out.println("Sum of 3 integers: " + sumThree);

	        double sumDouble = calc.add(5.5, 4.5);
	        System.out.println("Sum of 2 doubles: " + sumDouble);
	    }

}
