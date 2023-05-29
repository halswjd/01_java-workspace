package com.kh.operator;

public class F_Compound {

	/* 
	 * 복합 대입 연산자
	 * 산술연산자와 대입연산자가 결합돼있는 형태 (산술연산 먼저 쓰고 대입연산 나중)
	 * 연산 처리속도가 빨라지므로 사용하는걸 권장!!
	 * 
	 * +=, -=, *=, /=, %=
	 * 
	 * a = a + 3; 	=>	 a += 3;
	 * a = a - 3; 	=>	 a -= 3;
	 * a = a * 3; 	=>	 a *= 3;
	 * a = a / 3;	=>	 a /= 3;
	 * a = a % 3;	=>	 a %= 3;
	 * 
	 */
	
	
	public void  method1() {
		
		int num = 12;
		System.out.println("최초 num : " + num); // 12
		
		// int num = 13; 한 메소드에서 변수 중복 안됨
		
		num = num; // ~~ no effect : 변화되지 않는 코드 
		num = num + 3;
		System.out.println("3 증가 시킨 num : " + num); // 15
		
		num += 3;
		System.out.println("3 증가 시킨 num : " + num); // 18
		
		num -= 5;
		System.out.println("5 감소 시킨 num : " + num); // 13
		
		num *= 6;
		System.out.println("6배 증가 시킨 num : " + num); // 78
		
		num /= 2;
		System.out.println("2배 감소 시킨 num : " + num); // 39
		
		num %= 4;
		System.out.println("최종 num : " + num); // 3
		
		String str = "Hello";
		//str = str + "World";  ★ 산술연산 중 +만 가능하다
		str += "World"; // 숫자보다는 문자열 표현이 가독성이 좋음
		System.out.println(str);
		
	}
}



















