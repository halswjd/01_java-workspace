package com.kh.chap01_beforeVSafter.after.model.vo;

public class Tv extends Product {

	// 필드
	private int inch;
	
	// 생성자
	public Tv() {
		
	}
	
	public Tv(String brand, String pCode, String pName, int price, int inch) {
		super(brand, pCode, pName, price);
		this.inch = inch;
	}
	
	
	// 메소드
	public int getInch() {
		return inch;
	}
	public void setInch(int inch) {
		this.inch = inch;
	}
	
	public String information() {
		return super.information() + ", " + inch;
	}
}
