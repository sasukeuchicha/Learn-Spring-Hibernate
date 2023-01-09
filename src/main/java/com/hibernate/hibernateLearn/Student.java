package com.hibernate.hibernateLearn;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //if not provided with namei.e., eg: "@Entity(name="something") default name of entity is class name in lowercase
@Table
public class Student {
	
	@Id //id annotation provides the primary key
	private int id;
	private String name;
	private String city;
	private Certificate certi;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Certificate getCerti() {
		return certi;
	}
	public void setCerti(Certificate certi) {
		this.certi = certi;
	}
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
}
