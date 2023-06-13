package com.kh.chap02_abstractAndInterface.part01_easy.model.vo;

public class Basketball extends Sports { // 상속클래스 입력하면 추상클래스로 만들던지 미완성된 추상클래스를 반드시 구현하라는 에러 발생 => 에러 해결 클릭시 자동으로 추상클래스 구현됨

	// 왜 추상클래스를 사용하나요..?
	// 자식클래스에 강제성을 부여하기 위함
	// basketball, football 이든 무조건 rule이 존재하니 반드시 rule을 구현했으면해서 강제성을 부여한 것
	
	// 추상메소드가 존재하는 추상클래스를 상속받는 순간 부모클래스에 있던 추상메소드를 강제로 오버라이딩 해야됨
	
	@Override
	public void rule() {
		System.out.println("공을 항상 손으로만 다뤄야한다.");
	}
	
	

}
