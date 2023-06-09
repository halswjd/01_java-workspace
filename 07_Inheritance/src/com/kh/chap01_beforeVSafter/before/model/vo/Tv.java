package com.kh.chap01_beforeVSafter.before.model.vo;

public class Tv {

	// 필드부
		private String brand;
		private String pCode;
		private String pName;
		private int price;
		private int inch;
		
	// 기본생성자
	public Tv() {
		
	}
	
	// 전체생성자
	public Tv(String brand, String pCode, String pName, int price, int inch) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.inch = inch;
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
		
		public int getInch() {
			return inch;
		}
		public void setInch(int inch) {
			this.inch = inch;
		}
		
		public String information() {
			return brand + ", " + pCode + ", " + pName + ", " + price + ", " + inch;
		}
}
