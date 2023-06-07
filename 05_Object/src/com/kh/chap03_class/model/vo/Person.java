package com.kh.chap03_class.model.vo;

public class Person {

	// 필드 선언
	private String id;
	private String pwd;
	private String name;
	private int age;
	private char gender;
	private String phone;
	// 폰번호를 입력할 때 010~으로 시작하기 때문에 int형에 넣을 때 앞자리의 0이 날라가서 String 자료형이 적합
	private String email;
	
	// setter 메소드 (7개)
	
	public void setId(String id) {
		this.id = id;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	// getter 메소드 (7개)
	
	public String getId() {
		return id;
	}
	public String getPwd() {
		return pwd;
	}
	public String getname() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	public String getPhone() {
		return phone;
	}
	public String getEmail() {
		return email;
	}
	
	
	// information 메소드
	public String information() {
		return "Id : " + id + ", Pwd : " + pwd + ", Name : " + name + ", Age : " + age + ", Gender : " + gender + ", Phone : " + phone + ", Email : " + email;
	}
	

}
