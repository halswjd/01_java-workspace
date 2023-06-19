package com.kh.chap03_wrapper.run;

public class WrapperRun {

	public static void main(String[] args) {
		
		/*
		 * < Wrapper 클래스 >
		 * 기본자료형을 객체로 포장해줄 수 있는 클래스
		 * 
		 * 기본자료형 <----> Wrapper 클래스
		 * boolean		  Boolean
		 * char			  Character ***
		 * byte			  Byte
		 * short		  Short
		 * int			  Integer   ***
		 * long			  Long
		 * float		  Float
		 * double		  Double
		 * 
		 * (객체화 => new 연산자로 만드는 거)
		 * int a = 10;
		 * Integer a = new ~~~ (객체화) 이때 Wrapper 클래스 필요
		 * 
		 * 기본자료형을 객체로 취급해야하는 경우
		 * - 메소드 호출해야 될 때 ex) a.toString();
		 * - 메소의 매개변수로 기본자료형이 아닌 객체타입만이 요구될 때
		 * - 다형성을 적용시키고 싶을 때
		 * 
		 */
		
		// Boxing : 기본자료형 => Wrapper 클래스 자료형
		int num1 = 10;
		int num2 = 15;
		
//		System.out.println(num1.equals(num2)); num1과 num2는 기본자료형이라 stack 영역에 존재해서 주소값 없음  
		// equals => String => 오버라이딩 : 본래의 equals는 주소값을 비교하지만 String클래스에선 실제값을 비교
		System.out.println(num1 == num2);
		
		// 그래도 equals 메소드를 사용하자고한다면 주소값을 가질 수 있게 객체를 생성해보자 => Boxing
		// 1. 객체 생성 구문을 통한 방법
		Integer i1 = new Integer(num1);
		Integer i2 = new Integer(num2);
		
		System.out.println(i1.toString()); // 10 출력 => 왜 주소값 아님? => Integer 클래스 역시 toSting메소드가 실제값 출력되도록 오버라이딩되어있음 
		System.out.println(i2); // 15
		
		System.out.println(i1 == i2); // 주소값비교 => false 출력
		// 실제값이 같은지 궁금하다
		System.out.println(i1.equals(i2)); // false 출력, 실제값을 비교할 수 있게 equals 메소드 오버라이딩 되어있음
		System.out.println(i1.compareTo(i2)); // 두 값을 비교해서 앞쪽이 크면 1, 뒤쪽이 크면  -1, 같으면 0을 return하는 메소드
		
		
		// 2. 객체 생성따위 하지 않고 곧바로 대입하는 방법 (AutoBoxing)
		Integer i3 = num1;
		System.out.println(i3); // 10
		
		// 객체생성을 통해서 반드시 변환해야되는 경우 => 문자열을 Integer 타입으로
//		Integer i4 = "123";
		Integer i4 = new Integer("123"); // 매개변수는 꼭 숫자만 줘야함
		System.out.println("i4 : " + i4); // 123 출력
		
		// UnBoxing : Wrapper 클래스 자료형 ---> 기본자료형
		
		// 방법1. 해당 그 Wrapper클래스에서 제공하는 xxxValue() 메소드 이용
		int num3 = i3.intValue(); // num3 = 10
		int num4 = i4.intValue(); // num4 = 15
		
		// 방법2. 메소드 따위 사용하지 않고 바로 대입하는 방법(AutoUnBoxing)
		int num5 = i1;
		
		// 이거 왜 배우나요?
		// 웹 개발할 때 값 입력하면 무조건 문자로 날아옴
		System.out.println("==================================");
		
		String str1 = "10";
		String str2 = "15.3";
		
		System.out.println(str1 + str2); // 1015.3 출력 => 문자열 + 문자열 = 문자열
		
		// 1. String ---> 기본자료형 ★★
		//    "10" 		10
		// 	  "15.3"	15.3
		//    Wrapper클래스에서 제공하는 Wrapper.parseXXX() 메소드 이용
		
		int i= Integer.parseInt(str1);
		double d = Double.parseDouble(str2);
		System.out.println(i+d); // 연산된 결과 25.3 출력됨
		
		// 2. 기본자료형 ---> String
		// 		10			"10"
		// 		15			"15.3"
		//	String클래스에서 제공하는 String.valueOf() 메소드 이용
		
		String strI = String.valueOf(i);
		String strD = String.valueOf(d);
		
		// 근데 이렇게는 많이 안씀...
		String test = i + ""; // 다른자료형 + 문자열 => 문자열
		
		
		
	}

}















