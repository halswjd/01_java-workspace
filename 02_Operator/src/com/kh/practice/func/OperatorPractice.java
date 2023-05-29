package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {

	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		String result = (num > 0)? "양수입니다" : "양수가 아닙니다";
		System.out.println("입력한 값은 " + result);
		
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		String result = (num > 0)? "양수입니다" : (num == 0)? "0입니다" : "음수입니다";
		System.out.println("입력한 값은 " + result);
		
		
	}
	
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		String result = (num % 2 == 0)? "짝수입니다" : "홀수입니다";
		System.out.println("입력한 값은 " + result);
		
		
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int per = sc.nextInt();
		
		System.out.print("사탕 수 : ");
		int can = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : " + (can / per));
		System.out.println("남는 사탕 개수 : " + (can % per));
		
	
	}
	
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("학년을 입력하세요(숫자만) : ");
		int grade = sc.nextInt();
		
		System.out.print("몇 반인지 입력하세요(숫자만) : ");
		int group = sc.nextInt();
		
		System.out.print("번호를 입력하세요(숫자만) : ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("성별을 입력하세요(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		String genResult = (gender == 'M' || gender == 'm')? "남학생" : "여학생";
		
		System.out.println("성적을 입력하세요(소수점 아래 둘째자리까지) : ");
		double score = sc.nextDouble();
		

				
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.", grade, group, num, name, genResult, score);
		
	}
	
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		String result = (age <= 13)? "어린이" : (age > 13 && age <=  19)? "청소년" : "성인";
		
		System.out.println(result);
		
		
		
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 : ");
		int lang = sc.nextInt();
		
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 점수 : ");
		int math = sc.nextInt();
		
		int sum = (lang + eng + math);
		double aver = sum / 3.0;
		
		String result = ((lang >= 40 && eng >= 40 && math >= 40) && (aver >= 60))? "합격" : "불합격";
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + aver);
		System.out.println(result);
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요(-포함) : ");
		String id = sc.nextLine();
		char result = id.charAt(7);
		
		System.out.println((result == '2' || result == '4')? "여학생" : "남학생");
		
		
	}
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력 : ");
		int input = sc.nextInt();
		
		boolean result = (input <= num1) || (input > num2);

		System.out.println(result);
	}
	
	public void practice10( ) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력3 : ");
		int num3 = sc.nextInt();
		
		boolean result = (num1 == num2) && (num2 == num3);
		System.out.println(result);
	}
	
	public void practice11( ) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A사원의 연봉 : ");
		int asal = sc.nextInt();
		
		System.out.print("B사원의 연봉 : ");
		int bsal = sc.nextInt();
		
		System.out.print("C사원의 연봉 : ");
		int csal = sc.nextInt();
		
		
		String a = asal + (asal * 0.4) >= 3000 ? "3000 이상" : "3000 미만";
		String b = bsal >= 3000? "3000 이상" : "3000 미만";
		String c = csal + (csal * 0.15) >= 3000 ? "3000 이상" : "3000 미만";
		
		System.out.println("A 사원 : " + a);
		System.out.println("B 사원 : " + b);
		System.out.println("C 사원 : " + c);
	}
}





















