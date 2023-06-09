package com.kh.chap02_Inherit.model.vo;

public class Vehicle {

	// 필드부
	private String name;
	private double mileage;
	private String kind;
	
	
	// 기본생성자
	public Vehicle() {
		
	}
	
	// 매개변수생성자
	public Vehicle(String name, double mileage, String kind) {
		this.name = name;
		this.mileage = mileage;
		this.kind = kind;
	}
	
	
	// 메소드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public double getMileage() {
		return mileage;
	}
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public String information() {
		return name + ", " + mileage + ", " + kind;
	}
	
	public void howToMove() {
		System.out.println("움직인다.");
	}
	

}
