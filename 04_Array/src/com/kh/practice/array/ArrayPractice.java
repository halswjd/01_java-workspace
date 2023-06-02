package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {

	public void practice1() {

		int[] arr = new int[10];

		for (int i = 0; i < 10; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
	}

	public void practice2() {

		int[] arr = new int[10];

		for (int i = 0; i < 10; i++) {
			arr[i] = 10 - i;
			System.out.print(arr[i] + " ");
		}

	}

	public void practice3() {

		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();

		int[] arr = new int[num];

		for (int i = 0; i < num; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
	}

	public void practice4() {

		String[] arr = new String[5];

		arr[0] = "사과";
		arr[1] = "귤";
		arr[2] = "포도";
		arr[3] = "복숭아";
		arr[4] = "참외";

		System.out.println(arr[1]);
	}

	public void practice5() {

		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 : ");
		String str = sc.nextLine();

		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);

		char[] arr = new char[str.length()];

		int count = 0;
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
			if (ch == arr[i]) {
				count++;
				result += i + " ";
			}
		}
		System.out.printf("%s에 %c가 존재하는 위치(인덱스) : %s%n", str, ch, result);
		System.out.println("i 개수 : " + count);
	}

	public void practice6() {

		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();

		String[] arr = { "월", "화", "수", "목", "금", "토", "일" };

		if (num >= 0 && num <= 6) {
			System.out.println(arr[num] + "요일");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}

	}

	public void practice7() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 : ");
		int size = sc.nextInt();

		int[] arr = new int[size];
		int sum = 0;

		for (int i = 0; i < size; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 :");
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		System.out.println();
		System.out.println("총합 : " + sum);

	}

	public void practice8() {

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("정수 : ");
			int num = sc.nextInt();

			if (num >= 3 && num % 2 == 1) {
				int[] arr = new int[num];

				for (int i = 0; i <= num/2; i++) {
					arr[i] = i + 1;
				}
				for (int i =num/2+1; i < num; i++) {
					arr[i] = arr[i-1] - 1;
				}
				for(int i=0; i<num; i++) {
					System.out.print(arr[i] + " ");
				}break;
				
			} else {
				System.out.println("다시 입력하세요.");
			}
		}
	}
	
	public void practice9() {

		Scanner sc = new Scanner(System.in);
		System.out.print("치킨 이름을 입력하세요 : ");
		String str = sc.nextLine();
		
		String[] arr = {"양념", "후라이드", "불닭", "어니언"};
		int size = arr.length;
		
		for(int i=0; i<size; i++) {
			boolean result = str.equals(arr[i]);
			if(result) {
				System.out.println(arr[i] + "치킨 배달가능");
				break;
			}else {
				System.out.println(str + "치킨은 없는 메뉴입니다.");
				break;
			}
		}
		
	}
	
	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String id = sc.nextLine();
		int size = id.length();
		
		char[] arr = new char[size];
		
		for(int i=0; i<size; i++) {
			arr[i] = id.charAt(i);
		}
		
		char[] copy = arr.clone();
		
		for(int i=8; i<size; i++) {
			copy[i] = '*';
		}
		
		for(int i=0; i<size; i++) {
			System.out.print(copy[i]);
		}
		
	}
	
	public void practice11() {
		
		int[] arr = new int[10];
		
		for(int i=0; i<10; i++) {
			int num = (int)(Math.random()*10+1);
			arr[i] = num;
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice12() {
		
		int[] arr = new int[10];
		
		for(int i=0; i<10; i++) {
			int num = (int)(Math.random()*10+1);
			arr[i] = num;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		int max = 0;
		int min = 1;
		
		for(int i=0; i<10; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
	}
	
	public void practice13() {
		
		int[] arr = new int[10];
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<=i; j++) {
				arr[i] = (int)(Math.random()*10+1);
				boolean a = arr[j] == arr[i];
				if(a) {
					arr[i] = (int)(Math.random()*10+1);
					break;
				} else {
					break;
				}
			}
		}
		for(int i=0; i<10; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
	

		
	}
}
	









//		arr[0] = (int)(Math.random()*10+1);
//		
//		for(int i=1; i<10;i++) {
//			
//			while(true) {
//				int random = (int)(Math.random()*10+1);
//				for(int j=1; i<) {
//					
//				}
//			}
//		}
//		for(int i=0; i<10; i++) {
//			System.out.print(arr[i] + " ");
//		}













