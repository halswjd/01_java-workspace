package com.kh.chap04_field.model.vo;

public class Run {

	public static void main(String[] args) {
		
		FieldTest2 f2 = new FieldTest2();
		
		// public
		System.out.println(f2.pub); // 출력O
		
		// protected : 같은 패키지내에서는 접근가능, 다른 패키지라면 상속구조에서만 접근 가능
		System.out.println(f2.pro); // 출력O
		
		// default : only 같은 패키지 내에서만 접근 가능
		System.out.println(f2.def); // 출력O
		
		// private : only 해당 클래스에서만 접근 가능
//		System.out.println(f2.pri); 같은 클래스가 아니라서 접근 불가, 출력X
	}

}
