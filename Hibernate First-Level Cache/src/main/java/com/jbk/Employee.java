package com.jbk;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Employee {

	@Id
	private int eid;
	private String name;
	private String dept;
	private double salary;

	@OneToOne(cascade = javax.persistence.CascadeType.ALL)
	private Address address;

	public Employee() {
		super();
	}

	public Employee(int eid, String name, String dept, double salary, Address address) {
		super();
		this.eid = eid;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.address = address;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", dept=" + dept + ", salary=" + salary + ", address="
				+ address + "]";
	}

}
