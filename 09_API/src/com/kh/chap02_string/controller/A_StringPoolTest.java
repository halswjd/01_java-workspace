package com.kh.chap02_string.controller;

public class A_StringPoolTest {
	
	public void method1() {
		
		/*
	String s = "안녕"; // 참조자료형
	int a = 10; // 기본자료형
		 */
		
		// 1. 생성자를 통한 문자열 생성
		String str1 = new String("Hello"); // 매개변수 생성자
		String str2 = new String("Hello"); // 매개변수 생성자
		
		System.out.println(str1.toString()); // 주소값이 출력되지 않을까? => Hello 출력
		System.out.println(str2); // Hello 출력
		// String 클래스에 toString() 메소드가 이미 오버라이딩 돼있음!! (실제 담긴 문자열 반환하도록)
		
		// 동등비교
		System.out.println(str1 == str2); // 주소값을 비교하니까 당연히 false 출력
		System.out.println(str1.equals(str2)); // 그래서 String은 동등비교를 위해 equals 메소드 필요
		// String 클래스에 equals 메소드 이미 오버라이딩 돼있음!!
		// Object 클래스 확인해보면 원래는 주소값을 동등비교하는 메소드임!!
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode()); // 위의 출력과 같은 주소를 출력함
		// String 클래스에 hashCode 메소드 이미 오버라이딩 돼있음! (주소값이 아닌 실제 담겨있는 문자열(Hello)을 가지고 해쉬코드를 만듦)
		
		// 근데 나는 주소값을 꼭 알고싶다
		// System.indentitityHashCode(레퍼런스);
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2)); // 서로 다른 주소값 출력
	}
	
	public void method2() {
		String str = new String("hello");
		
		// 2. 문자열을 리터럴값으로 생성
		String str1 = "hello";
		String str2 = "hello";
		// String Pool 특징 : 동일한 문자열을 가질 수 없음(중복 허용X)
		// 리터럴값은 String Pool에 담김, 다른 String의 변수가 생길 때 그 리터럴값이 StringPool에 있는지 확인함
		
		System.out.println(str1/*.toSting*/);
		System.out.println(str2);
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println(str1 == str2); // ?? true 출력 (주소값 일치함)
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2)); // String Pool에있는 hello를 둘다 참조하므로 주소값 일치
		System.out.println(System.identityHashCode(str)); // 위와 다른 주소값 출력
		
		String str3 = "hi";
		System.out.println(str1 == str3); // false 출력
		System.out.println(System.identityHashCode(str3));
		
		// String 클래스 == 불변 클래스 (변하지 않는 클래스)
		// 그럼 값을 못 바꾸는건가요? 그건 아님..
		// 변경이 가능하긴 하나 그 자리에서 수정되는 개념 아님!!
		str3 = "bye";  // 주소값이 변경되는 것
		System.out.println(System.identityHashCode(str3)); // 주소값 변경됨을 확인
		// 변경하는 순간 기존의 문자열 자리에서 변경되는게 아닌 새로운 곳을 참조하도록 됨 (새로운 주소값 부여받음 == 주소값 변경)
		
		str3 = "hello";
		System.out.println(System.identityHashCode(str3)); // str1, str2의 주소값과 동일해짐
	
		
	}
	

}


















