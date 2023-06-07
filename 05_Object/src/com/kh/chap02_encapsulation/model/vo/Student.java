package com.kh.chap02_encapsulation.model.vo;

public class Student { // 나만의 자료형
	
	// 필드부
	// 접근제한자 자료형 변수명
	private String name;
	private int age;
	private double height;
	private int korScore;
	private int mathScore;
	
	
	/*
	 *  메소드
	 *  [표현법]
	 *  접근제한자 [예약어] 반환형 메소드명([매개변수]) {
	 *  
	 *  	...실행할 코드
	 *  
	 *  }
	 */
	
//	public void method1(int a) { // 매개변수 : 전달되는 변수(생략가능)
//		int b = 10; // 일반변수
//	}
	
	// - setter 메소드
	// 해당 필드에 대입시키고자 하는 값 전달 받아 해당 필드에 대입시켜주는 기능의 메소드
	
	/*
	public void setName(String newName) {
//		System.out.println(newName);
		// 매개변수 : 해당 메소드 호출시 전달값을 받아주기 위한 변수 선언문
		name = newName;
	}
	*/
	
	public void setName(String name) { // 관례적인 표현 : 필드부랑 같은 이름으로 매개변수를..
//		name = name; 색이 없음.. 매개변수 name = 매개변수 name;형식
					// 필드명과 매개변수명이 동일한 시점에서는 해당 메소드 영역에서 만들어진 변수가 우선수위가 높음
//		필드 name = 매개변수 name; 원함
		this.name = name;
//		this => Student 클래스의 주소값을 가져서 필드부를 바꿔줄수있다
		
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setKorScor(int korScore) {
		this.korScore = korScore;
	}
	
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	
	// - getter 메소드
	// 해당 필드에 담긴 값을 "반환"해주는 역할을 수행
	
	// 우리가 썼던 public void에 void는 아무것도 반환을 안해준다는 뜻의 반환형
	
	public String getName() { // void가 아니고 어떤 자료형을 던져줄지 써야함
		return name; 	// 해당 메소드 영역에 변수가 없으므로 name에 this 불필요
		
	}
	public int getAge() {
		return age;
		
	}
	public double getHeight() {
		return height;
		
	}
	public int getKorScor() {
		return korScore;
		
	}
	public int getMathScore() {
		return mathScore;
		
	}
	
	// set 은 값을 넣어야하기때문에 매개변수가 필요, get은 출력을 해야하기때문에 반환형이 필요
}












