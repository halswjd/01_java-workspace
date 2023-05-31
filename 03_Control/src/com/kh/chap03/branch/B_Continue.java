package com.kh.chap03.branch;

public class B_Continue {

	/*
	 * continue; 반복문 안에 기술되는 구문으로 continue; 구문 실행 시 그 뒤의 구문을 실행하지 않고 곧바로 현재 속해있는 반복문
	 * 위로 올라간다
	 * 
	 */

	public void method1() {

		// for문으로 1부터 10까지 홀수 출력
		// 1 3 5 7 9

//		
//		for(int i =1; i<=10; i+=2) {
//			System.out.print(i + " ");
//		}

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) { // i값이 짝수일 경우
				continue; // 건너뛰기 생각하자
				// 반복문 실행안하고 반복문 위로 올라감 => 증감식으로 가라
			}
			System.out.print(i + " ");
		}
	}

	public void method2() {

		// 1부터 100까지의 총합계
		// 단, 6의 배수값은 빼고 덧셈연산하겠다

		// 1. 1부터 100까지의 총합계를 for문으로 작성
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 6 == 0) { // 6의 배수만 if문에 들어옴
				continue; // 건너뛰고 증감만
			}
			sum += i;
		}

		System.out.println("1부터 100까지의 합계 : " + sum);

	}

	public void method3() {

		// 2~9단까지 출력
		// 단, 3의 배수단은 빼고 출력

		for (int j = 2; j <= 9; j++) {
			if (j % 3 == 0) {
				continue;
			}
			System.out.println("==== " + j + "단 ====");
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d x %d = %d%n", j, i, j * i);
			}
			System.out.println();
		}

	}

}
