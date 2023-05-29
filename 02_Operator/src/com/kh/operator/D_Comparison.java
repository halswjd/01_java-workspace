package com.kh.operator;

import java.util.Scanner;

public class D_Comparison {

	
		/*
		 * 비교연산자 / 관계연산자 (이항연산자)
		 * 두 값을 비교하는 연산자
		 * 비교연산자는 조건을 만족하면 true(참), 만족하지않으면 false(거짓)을 반환한다
		 * 
		 * 대소비교 연산자 : <, >, <=, >=
		 * 동등비교 연산자 : ==(같다), !=(같지않다)
		 * 
		 */
	
	
	public void method1(){
		int a = 10;
		int b = 25;
		// int a = 10, b = 25; 이렇게 다수의 변수 선언 가능, 그러나 가독성때문에 권장하지 않음!
		
		System.out.println("a == b : " + (a==b)); // false 출력
		System.out.println("a != b : " + (a!=b)); // true
		System.out.println("a <= b : " + (a<=b)); // true
		
		boolean result = (a > b); // ★ boolean 자료형에 false 값이 저장됨
		System.out.println("a > b : " + result);
		
		// 산술연산 + 비교연산
		System.out.println((a*2) > (b/5)); // true
		
		System.out.println("a가 짝수인가요? : " + (a % 2 == 0)); // true
		System.out.println("a가 홀수인가요? : " + (a % 2 != 0)); // false, 비교연산
		System.out.println("a가 홀수인가요? : " + !(a % 2 == 0)); // false, 논리부정
		System.out.println("a가 홀수인가요? : " + (a % 2 == 1)); // true, 비교연산
		
		// 2로 나눴을 때의 나머지가 0일 경우 == 2로 나눠 떨어진다는 의미 == 짝수
		//			   나머지가 1일 경우 == 2로 나눠 떨어지지않음 == 홀수
 		
	}
	
		public void method2() {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("첫번째 정수 : ");
			int num1 = sc.nextInt();
			
			System.out.print("두번째 정수 : ");
			int num2 = sc.nextInt();
			
			System.out.println("첫번재가 두번째 보다 큽니까? : " + (num1 > num2));
			System.out.println("첫번재 정수가 짝수입니까? : " + (num1 % 2 == 0));
			
			// 동적(코딩), 정적(코딩)
			// method1 일 경우 변수의 값을 선언했기 떄문에 결과는 늘 같다 => 정적
			// method2 일 경우 입력하는 값에 따라 결과가 달라진다 => 동적
			
			// 특이케이스 (문자와 숫자간의 대소비교가 가능!! cf.D_Cast 클래스)
			System.out.println(num2 < 'A'); // 자동형변환에 의해 문자와 비교 가능
			// 'A' ~ 'Z' = 65 ~ 90
			
		}
}















