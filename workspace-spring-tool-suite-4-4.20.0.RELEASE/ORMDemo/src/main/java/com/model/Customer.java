package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="customer_tbl")
public class Customer {

	@Id
	@GeneratedValue
    @Column
	private int id;
    @Column(name="customer_name",length=20,nullable=false)
	private String name;
    @Column
	private String phone;
    @Column
	private String age;
    @Column
	private String city;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Customer\n [id=" + id + ", name=" + name + ", phone=" + phone + ", age=" + age + ", city=" + city + "]";
	}
	
	
	
		
}
