package com.kh.chap01_beforeVSafter.after.model.vo;

			// 자식 -----------> 부모
			// 후손 -----------> 조상
			// 하위 -----------> 상위
			// this ----------> super
public class Desktop extends Product { // ★ 자식클래스명 extends 부모클래스명

	// Desktop만 가지는 필드
	private boolean allInOne;
	
	// 생성자
	public Desktop() {
		
	}
	
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
//		this.brand = brand; // this : 이 클래스의 주소값    super : 부모클래스의 주소값 => 부모클래스는 하나만 존재 가능(단일상속만 가능)
		// brand ~ price 네 개의 값들은 부모 클래스(Product)의 필드에 대입
		
		// 해결방법1. 부모클래스에 있는 필드를 protected 접근 제한자로 수정
		// protected : 다른 패키지에서 호출 안되지만 상속관계에서는 가능한 접근제한자
		/*
		super.brand = brand;
		super.pCode = pCode;
		super.pName = pName;
		super.price = price;
		*/
		
		// 해결방법2. 부모클래스에 있는 setter 메소드 활용하기 => 접근제한자가 public 이기 때문에 활용 가능
		/*
		super.setBrand(brand);
		super.setpCode(pCode);
		super.setpName(pName);
		super.setPrcie(price);
		*/
		
		// 해결방법3. 부모 생성자 호출하기 *** (public이라 가능)
		// this 생성자 this(), super 생성자 super() 위치가 항상 위어야한다
		super(brand, pCode, pName, price); 
		this.allInOne = allInOne; // 이 클래스내에 필드부로 존재하기에 가능
		
		
	}
	
	
	// 메소드
	public boolean isAllInOne() { // 관례적으로 자료형이 boolean 일 때, getter method는 is~로 입력
		return allInOne;
	}
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}

	// 오버라이딩 : 부모클래스에 있는 메소드를 자식 클래스에서 재정의 하는 것
	// 오버라이딩일 때, 자식클래스의 메소드가 우선순위라서 재정의 가능
	public String information() {
		return super.information() + ", " + allInOne;
	}
	
//	public String information(int a){ 오버라이딩 X => 부모클래스의 메소드와 형태가 일치해야함 
//	}
	
	
}



















