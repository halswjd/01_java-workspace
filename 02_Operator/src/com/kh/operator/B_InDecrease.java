package com.kh.operator;

public class B_InDecrease {

	/*
	 * ** 증감연산자 (단항연산자)**
	 * ++ : 변수에 담긴 값을 1 증가시켜주는 연산자
	 * 		++변수, 변수++
	 * -- : 변수에 담긴 값을 1 감소시켜주는 연산자
	 * 		--변수, 변수--
	 * 
	 * (증감연산자)변수 : 전위연산 => "선증감" 후 처리
	 * 변수(증감연산자) : 후위연산 =>  선처리 "후증감"
	 * 
	 */

	public void method1() {
		
		//전위연산 테스트
		int num1 = 10;
		System.out.println("전위연산 적용 전 num1의 값 : " + num1); // num1 = 10 출력
		System.out.println("1회 수행 후 결과 : " + ++num1); // 11 출력
		System.out.println("2회 수행 후 결과 : " + ++num1); // 12 출력
		System.out.println("3회 수행 후 결과 : " + ++num1); // 13 출력
		System.out.println("최종 num1의 값 : " + num1); // 13 출력
		
		System.out.println("===============");
		
		//후위연산 테스트
		int num2 = 10;
		System.out.println("후위연산 적용 전 num2의 값 : " + num2); // num2 = 10 출력
		System.out.println("1회 수행 후 결과 : " + num2++); // 10 출력 후 => num2 = 11로 증가
		System.out.println("2회 수행 후 결과 : " + num2++); // 11 출력 후 => num2 = 12로 증가
		System.out.println("3회 수행 후 결과 : " + num2++); // 12 출력 후 => num2 = 13로 증가
		System.out.println("최종 num2의 값 : " + num2);  // 13 출력
	}

	public void method2() {
		
		int a = 10;
		int b = ++a;
		// a=?, b=?
		System.out.printf("a : %d, b : %d%n", a, b); // a = 11, b = 11 출력
		
		
		int c = 10;
		int d = c++;
		// c=?, d=?
		System.out.printf("c : %d, d : %d%n", c, d); // c = 11, d = 10 출력

		
		int num = 20;
		System.out.println("현재 num : " + num); // num = 20 출력
		System.out.println("++num은?" + ++num); // 21 출력
		System.out.println("num++은?" + num++); // 21 출력 (출력 후, 22)
		System.out.println("--num은?"+ --num); // 21 출력
		System.out.println("num--은?"+ num--); // 21 출력 (출력 후, 20)
		System.out.println("최종 num : " + num); // 20 출력		
		
		
	}


}
