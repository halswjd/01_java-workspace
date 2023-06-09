package com.kh.chap01_beforeVSafter.before.model.vo;

public class SmartPhone {

	// 필드부
		private String brand;
		private String pCode;
		private String pName;
		private int price;
		private String mobileAgency;
		
		// 기본생성자
		public SmartPhone() {
			
		}
		
		// 전체생성자
		public SmartPhone(String brand, String pCode, String pName, int price, String mobileAgency) {
			this.brand = brand;
			this.pCode = pCode;
			this.pName = pName;
			this.mobileAgency = mobileAgency;
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
		
		public String getMobileAgency() {
			return mobileAgency;
		}
		public void setMobileAgency(String mobileAgency) {
			this.mobileAgency = mobileAgency;
		}
		
		public String information() {
			return brand + ", " + pCode + ", " + pName + ", " + price + ", " + mobileAgency;
		}
}
