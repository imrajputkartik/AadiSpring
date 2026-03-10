package com.bhanu.spring.model;

public class Student {

	private String name, gender;
	private int id;
	private Address address;

	public Student() {
		super();
		System.out.println("Student.student()");
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String gender, int id, Address address) {
		super();
		this.name = name;
		this.gender = gender;
		this.id = id;
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Student.setAddress()");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Student.setName()");
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
		System.out.println("Student.setGender()");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		System.out.println("Student.setId()");
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gender=" + gender + ", id=" + id + ", address=" + address + "]";
	}

}
