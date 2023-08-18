package com.kh.variable;

public class C_Printf {

	public void printfTest() {
		
		// System.out.print(출력하고자 하는 값); => 출력만함 줄바꿈 발생 X 
		// System.out.println(출력하고자 하는 값); => 출력 후 줄바꿈 발생 O
		
		// System.out.printf("출력하고자 하는 형식(포맷)", 출력하고자 하는 값);
		// 출력하고자 하는 값들이 제시한 형식(포맷)에 맞춰서 출력만 진행(줄바꿈X)
		
		/*
		 * 포맷 안에서 쓰일 수 있는 키워드
		 * %d : 정수 
		 * %c : 문자
		 * %s : 문자열, 문자도 가능
		 * %f : 실수
		 * 
		 */
		
		int iNum1 = 10;
		int iNum2 = 20;
		
		// "10 20" 출력
		System.out.println(iNum1 + " " + iNum2); // 10 20 으로 출력
		System.out.println(iNum1 + iNum2); // 30 출력 -> int 끼리만 더해졌을때는 int 결과값이 나옴
		System.out.printf("%d%d", iNum1, iNum2); // 1020 출력
		System.out.printf("%d %d", iNum1, iNum2); // 10 20 출력
//		 System.out.printf("%d %d", iNum1); 형식에는 두개의 정수가 있지만 하나의 변수만 들어가서 에러
		System.out.printf("%d %d", iNum1, iNum2, iNum2); // 변수가 넘치게 들어가있는건 가능
		
		System.out.printf("%d%d", iNum1, iNum2);
		System.out.println(); // printf 는 줄바꿈이 안됨
		System.out.println("하하");
		
		// "10 20%" 출력
//		System.out.printf("%d %d%", iNum1, iNum2); //에러 -> %뒤에는 원래 포맷키워드가 와야해서
		System.out.printf("%d %d%%", iNum1, iNum2); // 10 20% 출력
		System.out.println();
		
		// 정렬하고자 할 때 많이 씀
		System.out.printf("%5d\n", iNum1); // 양수 5 오른쪽정렬
		System.out.printf("%-5d\n", iNum2); // 음수 5 왼쪽정렬

		
		System.out.printf("%5d\n", 250);
		System.out.printf("%5d\n", 3000);
		System.out.printf("%5d\n", 16);
		
		System.out.println();
		
		double dNum1 = 1.23456789;
		double dNum2 = 4.53;
		
		System.out.printf("%f %f%n", dNum1, dNum2); // %f 포맷은 무조건 소수점 아래 6번째 자리까지 보여줌, %n 줄바꿈
		System.out.printf("%f\t%f", dNum1, dNum2); // \t 는 tab
		System.out.println();
		System.out.printf("%.2f %.1f", dNum1, dNum2); // %.2f는 소수점 둘째자리까지
		System.out.println();
		
		char ch = 'a';
		String str = "hello";
		
		System.out.printf("%c %s %s", ch, str, ch); // %s에 문자도 가능
		System.out.println();
		System.out.printf("%C %S %S", ch, str, ch); // 형식이 대문자여서 출력도 대문자로 출력됨
		
		
	}
}














