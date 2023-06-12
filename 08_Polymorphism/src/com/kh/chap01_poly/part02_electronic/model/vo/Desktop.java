package com.kh.chap01_poly.part02_electronic.model.vo;

public class Desktop extends Electronic{

	public static final String CPU ="intel"; // static 영역에 저장된 상수이니 매개변수생성자, getter-setter 메소드 필요 없음
	private String graphic;
	
	public Desktop() {
		
	}
	public Desktop(String brand, String name, int price, String graphic) {
		super(brand, name, price);
		this.graphic = graphic;
	}
	
	public String getGraphic() {
		return graphic;
	}
	public void setGraphic(String graphic) {
		this.graphic = graphic;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", " + graphic; 
	}
	
	
}
