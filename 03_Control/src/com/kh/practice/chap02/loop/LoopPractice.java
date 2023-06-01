package com.kh.practice.chap02.loop;

import java.util.Scanner;

public final class LoopPractice {

	public void practice1() {

		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (num >= 1) {
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}

	public void practice2() {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();

			if (num >= 1) {
				for (int i = 1; i <= num; i++) {
					System.out.print(i + " ");
				}
				break;
			} else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
		}

	}

	public void practice3() {

		Scanner sc = new Scanner(System.in);

		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (num >= 1) {
			for (int i = num; i >= 1; i--) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}

	public void practice4() {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();

			if (num >= 1) {
				for (int i = num; i >= 1; i--) {
					System.out.print(i + " ");
				}
				break;
			} else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
		}

	}

	public void practice5() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();

		int sum = 0;

		for (int i = 1; i <= num; i++) {
			sum += i;
			if (i < num) {
				System.out.printf("%d + ", i);
			} else if (i == num) {
				System.out.printf("%d = %d", i, sum);
			}
		}

	}

	public void practice6() {

		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();

		if (num1 < 1 || num2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			if (num1 < num2) {
				for (int i = num1; i <= num2; i++) {
					System.out.print(i + " ");
				}
			} else if (num1 > num2) {
				for (int j = num2; j <= num1; j++) {
					System.out.print(j + " ");
				}
			}
		}

	}

	public void practice7() {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("첫 번째 정수 : ");
			int num1 = sc.nextInt();
			System.out.print("두 번째 정수 : ");
			int num2 = sc.nextInt();

			if (num1 < 1 || num2 < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			} else {
				if (num1 < num2) {
					for (int i = num1; i <= num2; i++) {
						System.out.print(i + " ");
					}
					break;
				} else if (num1 > num2) {
					for (int j = num2; j <= num1; j++) {
						System.out.print(j + " ");
					}
					break;
				}
			}
		}
	}

	public void practice8() {

		Scanner sc = new Scanner(System.in);

		System.out.print("출력할 단을 입력하세요(2~9) : ");
		int dan = sc.nextInt();

		System.out.println("==== " + dan + "단 ====");
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d%n", dan, i, dan * i);
		}
	}

	public void practice9() {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 : ");
		int dan = sc.nextInt();

		if (dan < 9) {
			for (int j = dan; j <= 9; j++) {
				System.out.println("===== " + j + "단 ====");
				for (int i = 1; i <= 9; i++) {
					System.out.printf("%d x %d = %d%n", j, i, j * i);
				}
			}
		} else {
			System.out.println("9 이하의 숫자만 입력해주세요.");
		}

	}

	public void practice10() {
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print("숫자 : ");
			int dan = sc.nextInt();
			
			if (dan < 9) {
				for (int j = dan; j <= 9; j++) {
					System.out.println("===== " + j + "단 ====");
					for (int i = 1; i <= 9; i++) {
						System.out.printf("%d x %d = %d%n", j, i, j * i);
					}
				}
				break;
			} else {
				System.out.println("9 이하의 숫자만 입력해주세요.");
			}
			
		}

	}
	
	public void practice11() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("공차 : ");
		int num2 = sc.nextInt();
		
		
		for(int i=num1; i<num1+num2*10 ; i+=num2) {
			System.out.print(i + " ");
		}
	}
	
	public void practice12() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("연산자(+,-,*,/,%) : ");
			String str = sc.nextLine();
			
			if(str.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			
			int result = 0;
			
			if(str.equals("+")||str.equals("-")||str.equals("*")||str.equals("/")) {
				
				switch(str) {
				case "+":
					result = num1 + num2;
					break;
				case "-":
					result = num1 = num2;
					break;
				case "*":
					result = num1 * num2;
					break;
				case "/":
					if(num2==0) {
						System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
						sc.nextLine();
						continue;
						
					}else {
						result = num1 / num2;
					}
				}
				System.out.printf("%d %s %d = %d", num1, str, num2, result);
				break;
			} else {
				System.out.println("없는 연산자입니다. 다시 입력해주세요");
				sc.nextLine();
				continue;
			}
		}
	}
	
	
	
	 
	
	public void practice13() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
	}
	
	public void practice14() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		
		for(int i=num; i>=1; i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
}

