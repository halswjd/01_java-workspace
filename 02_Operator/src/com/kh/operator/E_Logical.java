package com.kh.operator;

import java.util.Scanner;

public class E_Logical {
	
	/*
	 * 논리연산자 (이항연산자)
	 * 두 개의 논리값(true, false)을 연산해주는 연산자
	 * 논리연산한 결과마저한 논리값임!
	 * 
	 * 논리값 && 논리값 : 왼쪽과 오른쪽 둘다 true일 경우 결과값은 true, && 의미 : ~이고, 그리고
	 * 논리값 || 논리값 : 왼쪽과 오른쪽 하나라도 true일 경우 결과값은 true
	 * 
	 */
	
	public void method1() {
		
		// 사용자가 입력한 정수값이 1부터 100 사이의 값인지 확인
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		// boolean result = (1 <= num <= 100);
		boolean result = (1 <= num) && (num <= 100); 
		// num값이 1 이상 "그리고" num값이 100 이하일 경우
		// 97 입력 : && 기준 좌항이 true 우항도 true => true 값 저장

		System.out.println("사용자가 입력한 값이 1이상 100이하 입니까? : " + result);
		
		// && : 두 개의 조건 모두가 true여야 연산의 결과값이 최종적으로 true!!
		//		둘 중에 하나라도 false가 있을 경우 &&연산의 결과값은 false
		
		
	}
	
	public void method2() {
		// 사용자가 입력한 문자값이 영어 대문자인지 확인
		// 'A' ~ 'Z' :  65 ~ 90
		// int 와 char 쌍방향 자동형변환 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 하나 입력 : ");
		char ch = sc.nextLine().charAt(0);
		
		// boolean result = (65 <= ch <= 90);
		
		// 첫번재 방법
		boolean result = (ch >= 65) && (ch <= 90);
		System.out.println("사용자가 입력한 값이 대문자 입니까? : " + result);
		
		// 두번째 방법
		boolean result1 = (ch >= 'A') && (ch <= 'Z');
		System.out.println(result1);
		
		
	}
	
	public void method3() {
		
		// 사용자에게 성별을 입력 받을 후 여자인지 확인
		Scanner sc = new Scanner(System.in);
		
		System.out.println("성별을 입력해주세요(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		boolean result = (gender == 'F') || (gender == 'f');
		// 하나만 만족(true)여도 true가 출력이 되어야하기 때문에 ||(OR) 입력
		// ||(OR) 의미 : ~이거나, 또는~
		System.out.println("사용자가 여자 입니까? : " + result);
		
		// || : 두 개의 조건 중 하나라도 true가 있다면 || 연산의 결과값은 true
		// 		두 개의 조건 모두 false || 연산의 결과값이 false
	}
	
	public void method4() {
		
		// 사용자에게 입력을 받아 게임을 종료하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("게임을 종료하시려면 y를 입력해주세요 : ");
		char ch = sc.nextLine().charAt(0);
		boolean result = (ch == 'y') || (ch == 'Y');
		System.out.println("사용자가 입력한 값이 y 또는 Y 입니까? : " + result);
		
	}
	
	/* 정리
	 * && : 두 개의 조건이 모두 true 여야 결과값도 true (AND == ~이고, 그리고, ~이면서, 뿐만아니라)
	 * true && true => true
	 * true && false => false
	 * false && true => false
	 * false && false => false
	 * 
	 * ★ && 연산자를 기준으로 앞의 결과가 false일 경우 뒤의 조건은 굳이 실행하지 않는다!!
	 * 
	 * 
	 * || : 두 개의 조건 중 하나라도 true라면 결과값이 true임 (OR == 또는, ~이거나)
	 * true || true => true
	 * true || false => true
	 * false || true => true
	 * false || false => false
	 * 
	 *  ★ || 연산자 기준으로 앞의 결과가 true일 경우 뒤의 조건 굳이 실행하지 않는다!!
	 * 
	 */
	
	public void method5() {
		
		int num = 10;
		//boolean result1 = (num < 5) && (++num > 0);
		boolean result1 = (num > 5) && (++num > 0); // && 기준 좌항이 true이기 때문에 우항도 연산처리가 되어 num값은 증가한다
		
		System.out.println("result1 : " + result1);		
		System.out.println("&& 연산 후의 num값 : " + num);
		// ★ && 기준 좌항의 값이 이미 false이면 결과값은 이미 false이기에 우항은 읽지 않아서 num값이 10이다
		
		
		int num2 = 10;
		//boolean result2 = (num2 < 20) || (++num2 > 0);
		boolean result2 = true || (++num > 0); // (++num > 0) 은 Dead code로 절대 실행될 일 없는 코드
		System.out.println("result2 : " + result2);		
		System.out.println("|| 연산 후의 num값 : " + num2);
		
	}
}


		
		
		
		
		
		
		
		