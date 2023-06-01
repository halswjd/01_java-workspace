package com.kh.practice.comp.func;

import java.util.Scanner;

public class CompExample {

	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num>0) {
			for(int i=1; i<=num;i++) {
				if(i%2==1) {
					System.out.print("박");
				} else {
					System.out.print("수");
				}
			}
		}else {
			System.out.println("양수가 아닙니다.");
		}
		
		
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
	
		while(true) {
			
			System.out.print("정수 : ");
			int num = sc.nextInt();
			
			if(num>0) {
				for(int i=1; i<=num;i++) {
					if(i%2==1) {
						System.out.print("박");
					} else {
						System.out.print("수");
					}
				}
				break;
			}else {
				System.out.println("양수가 아닙니다.");
			}
		
		
		}
		
	}
	
	
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
				
		int sum = 0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==ch) {
				sum += 1;
			}
		}
		
		System.out.println(str + "안에 포함된 " + ch + "의 개수 : " + sum);
		
	}
	
	public void practice4() {
		
		while(true) {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("문자열 : ");
			String str = sc.nextLine();
			System.out.print("문자 : ");
			char ch = sc.nextLine().charAt(0);
			
			int sum = 0;
			
			for(int i=0; i<str.length(); i++) {
				if(str.charAt(i)==ch) {
					sum += 1;
				}
			}
			System.out.println(str + "안에 포함된 " + ch + "의 개수 : " + sum);
			
			System.out.print("더 하시겠습니까? : ");
			char answer = sc.nextLine().charAt(0);
			
			if(answer == 'y' || answer == 'Y') {
				continue;
			} else if(answer == 'N' || answer == 'n') {
				break;
			} else {
				System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
				continue;
			}
		}
		
		
	}
	
		
}
	

