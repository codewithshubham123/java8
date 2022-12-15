package com.java8;

public class EmployeeDemo {

	private int id;
	
	private String name;
	
	private String email;

	private long salary;

	public EmployeeDemo(int id, String name, String email, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
	}

	public EmployeeDemo() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeDemo [id=" + id + ", name=" + name + ", email=" + email + ", salary=" + salary + "]";
	}

	
	
	
}
