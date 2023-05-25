package com.kh.run;

import com.kh.variable.A_Variable;
import com.kh.variable.B_KeyboradInput;


public class Run {
	public static void main(String[] args) {
		A_Variable a = new A_Variable(); // 서로 다른 클래스에서 호출하는 방법
		//클래스명 별칭 = new 클래스명();
		
		//a.printVariable();  // 실행
		// a.decleareVariable();
		
		B_KeyboradInput b = new B_KeyboradInput();
		// 클래스명 별칭 = new 클래스명();
		
		//b.inputTest1();
		//b.inputTest2();
		//b.inputTest3();
		//b.inputTest4();
		b.charAtTest();
		
	
	}
}
