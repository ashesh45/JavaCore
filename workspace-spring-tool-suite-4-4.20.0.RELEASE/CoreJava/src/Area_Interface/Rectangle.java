package Area_Interface;

public class Rectangle implements Shape {
	
	double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

}
