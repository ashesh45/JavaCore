package com.DI;

public class Customer {
	
	private int id;
	private String name;
	private String phone;
	private String age;
	
	
	public Customer(int id, String name, String phone, String age) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phone=" + phone + ", age=" + age + "]";
	}
	

}
