package com.kh.chap01_beforeVSafter.after.model.vo;

public class Product {
	
	// 세 클래스 모두 공통적으로 가지고 있는 요소들 (필드, 메소드) 만을 기술

	private String brand;  // protected : 다른 패키지에서 호출 안되지만 상속관계에서는 가능한 접근제한자
	private String pCode;
	private String pName;
	private int price;
	
	// 기본생성자
	public Product() {
		
	}
	
	// 전체생성자
	public Product(String brand, String pCode, String pName, int price) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
	}
	
	// setter - getter 메소드
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	public String getpCode() {
		return pCode;
	}
	public void setpCode(String pCode) {
		this.pCode = pCode;
	}
	
	
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	
	
	public int getPrice() {
		return price;
	}
	public void setPrcie(int price) {
		this.price = price;
	}
	
	
	public String information() {
		return brand + ", " + pCode + ", " + pName + ", " + price;
	}
	
}
