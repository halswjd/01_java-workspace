package com.kh.chap01_beforeVSafter.before.model.vo;

public class Desktop {
	
	// 필드부
	private String brand;
	private String pCode;
	private String pName;
	private int price;
	private boolean allInOne;
	
	// 기본생성자
	public Desktop() {
		
	}
	
	// 전체생성자
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.allInOne = allInOne;
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
	
	public boolean isAllInOne() { // boolean은 getter 메소드에서 관례적으로 is~로 입력한다 
		return allInOne;
	}
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	public String information() {
		return brand + ", " + pCode + ", " + pName + ", " + price + ", " + allInOne;
	}
}
