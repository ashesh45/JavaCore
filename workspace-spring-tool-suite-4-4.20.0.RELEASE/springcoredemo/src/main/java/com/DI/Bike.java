package com.DI;

public class Bike {
	
	
	private String color;
	private String company;
	private String price;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Bike [color=" + color + ", company=" + company + ", price=" + price + "]";
	}
	
	

}
