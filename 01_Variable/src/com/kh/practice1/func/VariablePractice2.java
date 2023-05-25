package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {

	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int fir = sc.nextInt();
		
		System.out.print("두 번째 정수 : ");
		int sec = sc.nextInt();
		
		System.out.println("더하기 결과 : " + (fir+sec));
		System.out.println("곱하기 결과 : " + (fir*sec));
		System.out.println("나누기 결과 : " + (fir/sec));
		
		sc.close();
	}
}
