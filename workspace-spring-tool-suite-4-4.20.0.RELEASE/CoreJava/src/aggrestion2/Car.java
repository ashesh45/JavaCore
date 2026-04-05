package aggrestion2;

public class Car {
	private String color;
	private String model;
	private int price;
	
	public String getColor() {
		return color;
	}
	public String getModel() {
		return model;
	}
	public int getPrice() {
		return price;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [color=" + color + ", model=" + model + ", price=" + price + "]";
	}
	

}
