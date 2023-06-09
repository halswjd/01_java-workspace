package com.kh.chap02_Inherit.model.vo;

public class Car extends Vehicle {
	
	// 필드
	private int tire;
	
	// 생성자
	public Car() {
		
	}
	
	public Car(String name, double mileage, String kind, int tire) {
		super(name, mileage, kind);
		this.tire = tire;
	}
	
	// 메소드
	public int getTire() {
		return tire;
	}
	public void setTire(int tire) {
		this.tire = tire;
	}
	
	public String information() {
		return super.information() + ", " + tire;
	}
	
	
	@Override // 어노테이션(생략가능), 오버라이딩 할 부모클래스의 메소드명을 잘못 입력하면 오류남
	public void howToMove() {
		System.out.println("바퀴를 굴려 움직인다.");
	}
	
	@Override
	public String toString() { // toSting 메소드 이미 Oject클래스에 있지만 내 마음대로 재정의하고싶다 -> 오버라이딩을 통해 가능
		return "아무말";
	}
	

}
