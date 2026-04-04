package MethodOveriding;

public class Test {
	
	public static void main(String[] args) {
        // Base class reference
        shape s;

        // Reference points to Circle object
        s = new circle();
        s.draw();  // Output: Drawing a Circle

        // Reference points to Rectangle object
        s = new rectangle();
        s.draw();  // Output: Drawing a Rectangle

        // Reference points to Triangle object
        s = new triangle();
        s.draw();  // Output: Drawing a Triangle
    }

}
