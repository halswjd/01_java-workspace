package com.kh.chap04_field.run;

import com.kh.chap04_field.model.vo.FieldTest1;
import com.kh.chap04_field.model.vo.FieldTest2;
import com.kh.chap04_field.model.vo.FieldTest3;

public class FieldRun {

	public static void main(String[] args) {

		FieldTest1 f = new FieldTest1();
//		f.test(20);
		
		// ---------- FieldTest2 -------------
		
		/*
		FieldTest2 f2 = new FieldTest2();
		
		// public
		System.out.println(f2.pub); // 출력O
		
		// protected : 같은 패키지내에서는 접근가능, 다른 패키지라면 상속구조에서만 접근 가능
//		System.out.println(f2.pro); 다른 패키지라서 접근 불가, 출력X
		
		// default : only 같은 패키지 내에서만 접근 가능
//		System.out.println(f2.def); 다른 패키지라서 접근 불가, 출력X
		
		// private : only 해당 클래스에서만 접근 가능
//		System.out.println(f2.pri); 같은 클래스가 아니라서 접근 불가, 출력X
		*/
		
		// ---------- FieldTest3 -------------
		System.out.println(FieldTest3.sta); // new 연산 없이 static 영역에 있으면 출력 가능
		
		// 수정하고싶다면?
		FieldTest3.sta = "ㅋㅋㅋ";
		System.out.println(FieldTest3.sta); // 'ㅋㅋㅋ' 출력
		
		// 근데 절대 변경 안되게 하고싶다면? => 상수필드로 선언해야함
		System.out.println(FieldTest3.STA_FIN);
//		FieldTest3.STA_FIN = "ㅎㅎㅎ"; 상수필드라 변경 안됨
		
		System.out.println(Math.PI);
//		Math.PI = 3.1432524; // 상수필드라 변경 불가
		
		System.out.println(Math.random()); // static : 글꼴이 기울임이 적용
		
	}

}







