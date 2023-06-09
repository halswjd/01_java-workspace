package com.kh.chap02_Inherit.model.vo;

public class Ship extends Vehicle {

	// 필드
	private int propeller;
	
	// 생성자
	public Ship() {
		
	}
	
	public Ship(String name, double mileage, String kind, int propeller) {
		super(name, mileage, kind);
		this.propeller = propeller;
	}
	
	public int getPropeller() {
		return propeller;
	}
	public void setTire(int propeller) {
		this.propeller = propeller;
	}
	
	public String information() {
		return super.information() + ", " + propeller;
	}
	
	@Override
	public void howToMove() {
		System.out.println("프로펠러를 돌려서 움직인다.");
	}
}
