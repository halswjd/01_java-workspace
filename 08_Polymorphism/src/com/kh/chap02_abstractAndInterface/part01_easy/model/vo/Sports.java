package com.kh.chap02_abstractAndInterface.part01_easy.model.vo;

public abstract class Sports {

	private int people;
	
	public Sports() {
		
	}
	
	public Sports(int people) { 
		this.people = people; 
	}
	
	// 메소드는 항상 반환형이 있다
	public int getPeople() { // (메소드의) 머리부
		return people;	// 몸통부 => 핵심 => 이게 없으면 완벽한 메소드가 아님
	}
	public void setPeople(int people) {
		this.people = people;
	}
	
	@Override
	public String toString() {
		return "people : " + people;
				
	}
	
	// 추상 메소드 (미완성된 메소드) 만들기
//	public void rule(); // 머리부만 있음.. 몸통부가 없어서 에러 발생
	// 지금할건 아니고 나중에 자식클래스에서 메소드를 정의하고싶다
	public abstract void rule(); 
	// 추상메소드 하나라도 가지려면 이 클래스도 아직 완성되지않은 클래스라고 명시해라 => 클래스에도 abstract 명시
	// 미완성된 메소드가 있다는 소리는 이 클래스도 아직 미완성이라는 이야기
	
	// 그럼 언제 완성하나요..? => 해당 추상클래스를 상속 받는 자식에서 (필수적으로) 완성!!
}
/*
 추상메소드
추상..? => 불분명한것
메소드 내용 안에 o => 분명
메소드 내용 안에 X => 불분명
*/
