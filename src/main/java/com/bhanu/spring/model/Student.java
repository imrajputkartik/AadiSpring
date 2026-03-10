package com.bhanu.spring.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

	private String name, gender;
	private int id;
	private Address address;

	List<Integer> list;
	Set<Integer> set;
	Map<Integer, String> map;

	public Student() {
		super();
		System.out.println("Student.student()");
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String gender, int id, Address address, List<Integer> list, Set<Integer> set,
			Map<Integer, String> map) {
		super();
		this.name = name;
		this.gender = gender;
		this.id = id;
		this.address = address;
		this.list = list;
		this.set = set;
		this.map = map;
	}

	public List<Integer> getList() {
		return list;
	}

	public void setList(List<Integer> list) {
		this.list = list;
	}

	public Set<Integer> getSet() {
		return set;
	}

	public void setSet(Set<Integer> set) {
		this.set = set;
	}

	public Map<Integer, String> getMap() {
		return map;
	}

	public void setMap(Map<Integer, String> map) {
		this.map = map;
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
		return "Student [name=" + name + ", gender=" + gender + ", id=" + id + ", address=" + address + ", list=" + list
				+ ", set=" + set + ", map=" + map + "]";
	}

}
