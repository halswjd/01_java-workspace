package com.kh.exception.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_UncheckedException {

	/*
	 * < RuntimeException >
	 * 프로그램 실행시 발생되는 예외들
	 * 
	 * RuntimeException 의 후손들
	 * - IndexOutOfBoundsException : 부적절한 인덱스를 가지고 접근시 발생하는 에러
	 * int[] arr = {10,20,30};
	 * arr[6];; 에러
	 * 
	 * - NullPointerExcetion : 참조변수가 null로 초기화된 상황에서 null에 접근했을 때 발생되는 예외
	 * Phon3[] phones = new Phone[3]; 배열만 생성된것 -> null
	 * phones[0].setBrand(); 에러
	 * phones[0] = new phone(~~); 객체 만들어줘야함
	 * 
	 * - ArithemeticException : 나누기 연산시 0으로 나누려 할 때 발생되는 예외
	 * 
	 * - ClassCastException : 허용할 수 없는 형변환이 진행될 때 발생되는 예외
	 * Parent pp = new Child1();
	 * (Child2)pp.printChild1(); 에러
	 * 
	 * - NegativeArraySizeException : 배열 할당 과정에서 배열의 크기를 음수로 지정하는 경우 발생되는 예외 
	 * 
	 * => RuntimeException 관련된 예외는 충분히 예측가능한 상황이 있음
	 * 	  애초에 예외 발생이 안되게끔 if문 조건처리 가능
	 * 
	 */
	
	Scanner sc = new Scanner(System.in); // 전역변수로 선언
	
	public void method1() {
		
		// ArithmeticException : 나누기 연산시 0으로 나누려 할 때 발생되는 예외
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		
//		int result = num1 / num2;
		
		// 애초에 예외 자체가 발생이 안되게끔 if문으로 조건 검사를 하자 => 예외처리는 아님
		/*
		int result = 0;
		if(num2 !=0) {
			result = num1/num2;
		}
		
		System.out.println("안녕하세요. 반갑습니다. 계산결과를 알려드리겠습니다.");
		System.out.println("result : " + result);
		*/
		
		// 예외처리 : 예외가 "발생했을 대" 실행할 내용을 미리 작성해놓는 방법
		
		/*
		 * [표현법]
		 * try catch 방법
		 * try {
		 * 		예외가 발생될 수도 있는 구문;
		 * } catch(발생될 예외클래스 매개변수){
		 * 		해당 예외가 발생됐을 경우 실행할 구문;
		 * }
		 * 
		 */
		
		try {
			int result = num1 / num2;
			System.out.println("result : " + result);
		}catch(ArithmeticException e) { // 예외를 낚아챔
			System.out.println("0으로 나눌 수 없습니다.");
			e.printStackTrace(); // 강제로 오류난 이력 보고자할때 실행하는 구문
		}
		
		System.out.println("프로그램을 종료합니다.");
	}
	
	public void method2() {
		
		// NegativeArraySizeException : 배열을 할당하는 과정에서 배열의 크기를 음수로 지정하는 경우 발생되는 예외
		// ArrayIndexOutOfBoundsException : 배열의 부적절한 인덱스를 가지고 접근시 발생되는 예외
		
		System.out.print("배열의 크기 : ");
		int size = sc.nextInt();
		
//		int[] arr = new int[size];
		
		/*
		if(size>=101) { // 예외처리는 아님 if문으로 예외자체가 발생이 안되도록 먼저 막는 것
			System.out.println("100번 인덱스 값 : " + arr[100]);
		}
		*/
		
//		System.out.println("100번 인덱스 값 : " + arr[100]);
		
		try {
			int[] arr = new int[size];
			System.out.println("100번 인덱스 값 : " + arr[100]);
		}catch(NegativeArraySizeException e) { // 예외처리
			System.out.println("배열의 크기로 음수를 제시할 수 없습니다.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("부적절한 인덱스로 접근했습니다.");
		}
		// 다중 catch 블럭 작성 가능
		
		System.out.println("프로그램을 종료합니다.");
		
	} // 끝
	
	public void method3() {
		
		System.out.print("배열의 크기 : ");
		
		/*
		try {
			int size = sc.nextInt();
			int[] arr = new int[size];
			System.out.println("100번 인덱스 값 : " + arr[100]);
		}catch(NegativeArraySizeException e) { // 예외처리
			System.out.println("배열의 크기로 음수를 제시할 수 없습니다.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("부적절한 인덱스로 접근했습니다.");
		}catch(InputMismatchException e) { // InputMismatchException => java.util => import 필요
			System.out.println("정수로만 입력해주세요");
		}
		*/
		
		try {
			int size = sc.nextInt();
			int[] arr = new int[size];
			System.out.println("100번 인덱스 값 : " + arr[100]);
		}catch(InputMismatchException e) {
			// InputMismatchException은 RuntimeException 은 자식클래스이기 때문에 자식클래스의 catch문은 부모클래스보다 위에 위치해야 실행이 됨
			// 부모에 의해 실행이 안될 수 있으니 순서가 중요!
			System.out.println("정수로만 입력해주세요");
			
		}catch(RuntimeException e) { // 위의 에러들의 부모클래스인 RuntimeException을 이용해보자 (다형성 적용해서 부모타입 예외클래스 작성 가능)
									// 모든 자식 예외발생시 다 받아서 처리할 수 있음
			System.out.println("예외가 발생, 배열크기?, 부적절한 인덱스? 정수로만 입력?");
		}
		
		// 부모예외클래스와 자식예외클래스를 가지고 catch블럭을 기술하고자 할 때에는 무조건 자식의예외클래스가 catch블럭이 위에 위치해야한다.
		// 그렇지않으면 unreachable catch block 오류발생
		
		/*
		 * RuntimeException 관련애들은 UncheckedException(예외처리가 필수X)이라고 한다.
		 * if문 : 애초에 예외자체가 발생되기 전에 소스코드로 처리하는거임 (예외처리구문은 아님)
		 * try-catch문 : 예외가 "발생했을경우" 처리해주는 구문을 작성해두는 것(이게 예외처리구문!)
		 * 
		 * 예측가능한 상황은 if문으로 조건검사로 해결하는게 권장사항임
		 * 부득이하게 조건문으로 핸들링이 안되는 구문은 예외처리구문으로 작성해둘 것!
		 * 
		 */
		
	} //
}























