package com.kh.variable;

public class A_Variable {
	
	// 시급과 근무시간, 근무일수를 곱해서 월급을 계산해서 출력하는 메소드
	public void  printVariable() {
		
		System.out.println("=== 변수 사용 전 ===");
		
		System.out.println("시급 : 9620원");
		System.out.println("근무일수 : 6일");
		System.out.println("근무시간 : 8시간");
		
		// 월급 = 시급 x 근무시간 x 근무일수
		// 주지훈 : 0000원 형식으로 출력하고 싶다
		
		System.out.println("차은우 : "+(9620*6*8)+"원");
		System.out.println("주지훈 : "+(9620*6*8)+"원"); // ctrl alt 아래방향기 : 행 복사
		System.out.println("이제훈 : "+(9620*6*8)+"원");
		
		
		// 여기서 최저시급과 근무일수가 바뀐다면? -> 변수 사용 
		System.out.println("=== 변수 사용 후 ===");
		
		int pay = 9620; // 자료형 변수명 = 값 ; 값에 맞는 자료형을 골라 변수 입력
		int time = 8;  // 자바에서 = 수식은 '같다'가 아니라 '대입'
		int day = 6; // 좌항의 int박스에 우항의 6값이 담긴다, int박스는 숫자의 자료형이기 때문에 문자는 대입 안됨
		// 자료형에 따라 담을 수 있는 값이 다르기 때문에 자료형 입력이 중요
		
		System.out.println("차은우 : "+(pay*day*time)+"원");
		System.out.println("주지훈 : "+(pay*day*time)+"원");
		System.out.println("이제훈 : "+(pay*day*time)+"원");
		
		/* 이렇게 시급과 급무일자가 늘어도 변수의 값만 바꾸면 해결 됨
		 * 변수 사용 이유
		 * 1. 변수는 우선적으로 값에 의미를 부여할 목적으로 쓴다 -> 가독성 높아짐
		 * 2. 단 한번 값을 기록하고 필요할 때마다 가져다 쓰는 목적으로 쓴다 -> 재사용성이 높아짐
		 * 3. 유지보수를 보다 쉽게 할 수 있다 -> 내가 아닌 다른 사람이 봤을 때 구분이 쉽다
		 */
		
		System.out.println("시급 : " + pay);
		
		System.out.println("aaa"); // 출력 후 개행
		System.out.print("bbb"); // 개행 없음

	}
	
	// 변수의 선언을 공부하기 위한 메소드
	public void decleareVariable() {
	
	/*변수의 선언
	 * 값을 기록하기 위한 변수를 메모리 공간에 확보, 할당한다 => 즉, 값을 보관하기 위한 상자를 만들겠다!
	 * 
	 * [표현법] 자료형 변수이름;
	 * 
	 * 자료형 : 변수의 크기 및 모양을 지정해주는 부분
	 * 변수이름 : 변수의 이름을 붙여주는 부분 -> 추후의 알기 쉽게 의미 부여!
	 * 
	 * 변수 선언시 주의할 점
	 * 1.변수 이름은 소문자로 시작 / 단, 낙타봉 표기법을 지킬 것! 예약어는 불가
	 * 	ex) 사용자이름 => user + name => userName : 낙타봉 표기법(CamelCase)
	 * 	예약어 : package, out, int, public 등등
	 * 2.같은 영역 안 ({}) 에서는 동일한 변수명으로 선언 불가! => 중복 불가능
	 * 3.해당 영역 안 ({}) 에서 선언한 변수는 그 영역 안에서만 사용 가능 => 다른 메소드 에서는 사용이 불가능!
	 */
		
		
	// --------- 자료형에 대한 개념 ---------- 
	 
	// 1. 논리형 (논리값 = true / false) = boolean : 1byte
	 
		boolean isTrue;  // boolean 이라는 박스를 만듦 => 변수 선언
		boolean isFalse = false; // 선언된 변수에 자료형에 맞는 값 대입, boolean 은 true/false 값만 가짐
		System.out.println("isFalse의 값 : " + isFalse);
	
		isTrue = 1 + 3 > 1; // 논리값(1+3이 1보다 큽니까?) 입력도 가능, 우항의 식이 참이기 때문에 true의 값이 담긴다
		System.out.println(isTrue);
		
		isFalse = 4 + 2 < 1; // false 의 값이 담김
		
	
	// 2. 숫자형
	// (1) 정수형 (소숫점 x)
		byte bNum = 100; // 1byte (-128 ~ 127) 값만 가짐, 쓰임이 적음
		
		short sNum = 1000; // 2byte 
		
		int iNum = 10000; // 4byte , 정수형의 기본 자료형 (많이 쓰임)
		
		long lNum = 100000; // 8byte
		// 자료형에 크기에 맞게 메모리 할당을 하기 때문에 값에 맞는 자료형을 쓰는게 좋음
		
	// (2) 실수형 (소수점 o)
		float fNum = 0.0f; // 4byte => 소수점 7자리까지 표현 가능
						   // float의 경우 double 과 값을 구분하기 위해 값에 접미사 f가 붙음
		double dNum = 0.12345; // 8byte => 소수점 15자리까지 표현 가능 , 실수형의 기본 자료형
		
		
	// 3. 문자형
	// (1) 문자
		char ch = 'a'; // 2byte, 홑따옴표(')사이에 값 입력
		char kim;
		kim = '김'; // 영문 한글자는 1byte, 한글 한글자는 2byte
		
	// (1) 문자열
		String str; // 참조자료형이라 폰트컬러가 바뀌지 않음 (추후 수업)
		str = "abc";
		
		
	// 값이 잘 담겨있는지 확인 해보자! => 변수명 : 변수값
		System.out.println("isTure : " + isTrue);
		System.out.println("bNum : " + bNum);
		System.out.println("sNum : " + sNum);
		System.out.println("iNum : " + iNum);
		System.out.println("lNum : " + lNum);
		System.out.println("fNum : " + fNum);
		System.out.println("dNum : " + dNum);
		System.out.println("ch : " + ch);
		System.out.println("ch : " + kim);
		System.out.println("str : " + str);
		
		// 상수의 선언
		// [표현법] final 자료형 상수이름(대문자);
	
		final int AGE; //상수 선언
		AGE = 10; // 초기화
		System.out.println("AGE : " + AGE);
		
		// AGE = 11; 상수의 값은 변경이 불가하다!
		
		// 대표적인 상수의 예 : 3.14(파이, 원주율)
		System.out.println("파이 : " + Math.PI);  // Math 클래스 : 자바에서 자주 사용하는 상수들을 모아둔 값
		
		// 번외 : 가독성 위해 언더바(_)를 사용할 수 있음 -> 출력 안됨
		int etc = 999_999_999;
		System.out.println("etc : " + etc);
	
		
		// 변수 명명규칙
		
		// (1) 같은 영역 내에 중복된 이름 안됨
		int number;
		//int number; 
		int numBer; // 선언 가능 -> 대소문자는 구분
		
		// (2) 예약어(자바에서 사용되고 있는 키워드) 안됨
		// int true; 
		// int absract;
		// int class;
		// int static;
		
		// (3) 숫자 사용 가능하나 단, 숫자로 시작하는건 안됨
		int number1; // 가능
		// int 1number; 불가능
		
		// (4) 특수문자 사용가능하나 단, 언더바(_),$ 이외에는 사용안됨
		int number_1$; // 가능
		// int number!1; 불가능 
		
		
		
		// 변수명 권장사항!! (오류는 나지 않지만 개발자간의 룰, 매너)
		
		// (1) 낙타표기법(CamelCase)
		String username; // 관례상 틀림
		String userName; // 관례상 맞는 표현
		String userNameTest;
		
		// (2) 한글 사용 가능 하나 무조건 영문자로 작성하자!!, 한글을 사용하지 않는 환경에서는 오류를 발생시킬 수 있음
	
	
	
	
	}
}