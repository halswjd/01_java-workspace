package com.kh.chap06_method.run;

import java.util.Scanner;

import com.kh.chap06_method.controller.NonStaticMethod;
import com.kh.chap06_method.controller.OverloadingTest;
import com.kh.chap06_method.controller.StaticMethod;

public class MethodRun {

	public static void main(String[] args) {
		
		/*
		
		// ----------------------NonStaticMethod----------------------
		NonStaticMethod n = new NonStaticMethod();
		
		// 1. 매개변수도 없고 반환값도 없는 메소드 호출
//		n.method1(10);  메소드에 매개변수가 없으므로 값입력 안됨
		n.method1();
		
		
		// 2. 매개변수 없고 반환값은 있는 메소드 호출
//		int str = n.method2();   mehod2는 String이 반환형이기 때문에 int형에 담는거 불가
//		String str = n.method2();
//		n.method2(); return 값은 출력되지 않음
		System.out.println(n.method2());  // return값 출력
		
		
		// 3. 매개변수 있고 반환값은 없는 메소드 호출
//		n.method3(); 매개변수 없으면 호출 안됨 
//		n.method3(10); 매개변수 개수 맞지 않으면 오류남
//		n.method3("zz","gg") 매개변수 자료형에 맞지 않는 값이라 오류
//		매개변수가 있는 메소드는 변수 입력해야 호출 가능(★갯수와 자료형에 맞는 값 입력!)
//		int a = n.method3(10, 20); 반환값 없어서 오류 => 메소드를 변수에 저장하려면 return값이 필요한데 method3은 반환형이 void
		n.method3(10, 5); // 'num1 / num2 : 2' 출력
		n.method3(10, 0); // '0으로 나눌 수~' 출력
		
		
		// 4. 매개변수도 있고 반환값도 있는 메소드 호출
		n.method4("lemon", 1); // return만 된거일뿐 출력을 위해선 출력구문(sysout) 입력해야됨
//		char ch = n.method4("lemon", 1);
//		System.out.println(ch); // 'e' 출력
		System.out.println(n.method4("lemon", 1)); // 위의 두줄 한줄로
		
		
		// 사용자에게 매개변수(문자열, 정수값)를 입력 받아서 해당 메소드 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		System.out.print("인덱스 입력 : ");
		int index = sc.nextInt();
		
		
		// 여기서 유효성 검사 해보기
		// index 0 이상이면서 문자열의 길이보다 작을때만 method4 실행하게끔
		if(index >=0 && index < str.length()) {
			System.out.println("결과 : " + n.method4(str, index));		
		} else {
			System.out.println("인덱스 값이 부적절합니다.");
		}
		
		*/
		
		// ---------------------Static Method----------------------------
		// 생성 없이 바로 호출 가능
		// Math.random();
		StaticMethod.method1(); // static 메소드는 기울임체
		StaticMethod.method2(); // return 값은 출력하지않으면 보이지 않음
		System.out.println(StaticMethod.method2());
		StaticMethod.method3("차은우");
		System.out.println(StaticMethod.method4("apple", "kiwi")); // 'false' 출력
		// return값은 출력문"으로 확인!!
		
		
		
		
		// ---------------------OverloadingTest----------------------------
		OverloadingTest ot = new OverloadingTest();
		ot.test();
		ot.test(10);
		ot.test(10, "ㅋㄷㅋㄷ");
		ot.test("ㅎㅎ", 10);
		ot.test(10,10);
		ot.test("차은우");
		
		// 오버로딩의 대표적인 예 => print()
//		System.out.pri -> 자동완성 시 매개변수에 따른 여러 메소드가 뜸
	}
	
	

}









