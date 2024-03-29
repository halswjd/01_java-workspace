package com.hw1.model.vo;

public class Employee extends Person{

	// 필드
	private int salary;
	private String dept;
	
	// 생성자
	public Employee() {
		
	}
	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(age, height, weight);
		super.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	
	// 메소드
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", 연봉 : " + salary + ", 부서 : " + dept;
	}
}
