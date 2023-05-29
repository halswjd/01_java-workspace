package com.kh.variable;

public class D_Cast {
	
	 public void autoCasting() {
		
		/*
		 * 형변환 : 값의 자료형을 바꾸는 것
		 * 왜 바꾸냐? 컴퓨터에서의 값 처리 규칙 때문에 (즉, 형변환 필요한 상황)
		 * 1. 대입 연산자(=) 기준으로 왼쪽과 오른쪽은 같은 자료형이여야 한다!!  int num = "하하" (X)
		 * 	  => 즉, 같은 자료형에 해당하는 값만 대입 가능 int num = 33 (O)
		 * 	  => 즉, 다른 자료형의 값을 대입하고자 한다면 형 변환이 필수이다
		 *[표현법] 변수명 = (자료형)값;  int a = (int)9.0
		 *
		 * 2. 같은 자료형 끼리만 연산이 가능
		 * 값 + 값 = 계산 결과도 같은 자료형을 나옴
		 * 
		 * 형변환 종류
		 * 1. 자동 형변환(Auto Casting) : 자동으로 형변환이 이루어져서 우리가 형변환을 시킨 필요X 
		 * 2. 강제(명시적) 형변환 : 자동형변환이 안돼서 우리가 직접 형변환을 해줘야 함
		 * 
		 * [표현법] (바꿀자료형)값
		 * 
		 * 주의사항
		 * boolean 은 형변환이 불가능
		 *
		 */
		
		/* 자동형변환
		 * 값의 범위가 작은 자료형과 큰 자료형간의 연산 시 자동으로 범위가 작은 자료형을 큰 자료형으로 변환 후 처리해줌
		 */
		
		// 1. int(4byte) => double(8byte)
		int i1 = 12;
		double d1 = /*(double)*/i1; 
		System.out.println(d1);// 12.0 으로 출력
		// 엄청 큰 박스에는 작은 박스 담을 수 있음! 자동형변환 가능!
		
		int i2 = 12;
		double d2 = 3.3;
		double result = /*(double)*/i2 + d2; 
		System.out.println(result);// 15.3 출력
		
		
		// 2. int(4byte) -> long(8byte)
		int i3 = 1000;
		long l3 = /*(long)*/i3;
		
		
		// 3. float(4byte) -> double(8byte)
		float f4 = 1.0f;
		double d4 = /*(double)*/f4;
		
		
		//======= 특이케이스 =======
		// 4. long(8byte) -> float(4byte) 로 자동형변환 가능
		// float이 실수형이기 때문에 long형보다 표현 가능한 수의 범위가 더 커서 자동형변환됨!
		long l5 = 1000000L;
		float f5 = /*(float)*/l5;
		
		// 5. char(2byte) <-> int(4byte)
		int num = 'A';
		System.out.println(num); // 65출력
		char ch = 91; 
		System.out.println(ch); // '['출력
		// 아스키코드표 : 각 문자들마다 고유한 숫자가 지정되어 있기 때문에 쌍방향으로 형변환 가능
		// char는 음수값 저장 불가 => 값의 범위가 0~65535
		
		
		// 6. byte 또는 short간의 연산
		byte b1 = 1;
		byte b2 = 10;
		// byte b3 = b1 + b2; 에러발생 -> byte 와 short는 연산시 무조건 int형으로 처리함
		// 연산 결과가 범위가 더 큰 int 형임 => byte형에 대입 불가
		byte b3 = (byte)(b1+b2); // 그래서 강제형변환 필요
		System.out.println(b3);
	}
	 
	 
	 	public void forceCasting() {
	 		// 강제형변환(forceCasting) : 큰 크기의 자료형을 작은 크기의 자료형으로 바꾸는 것
	 		
	 		// double(8byte) => float(4byte)
	 		double d1 = 4.0;
	 		float f1 = (float)d1; // 강제형변환 안해주면 오류 발생 => 명시적으로 형변환 필요!
	 		
	 		// double(8byte) => int(4byte)
	 		int iNum = 10;
	 		double dNum = 5.89;
	 		
	 		// int iSum = iNum + dNum;
	 		// (iNum+dNum)을 double로 인식하기에 int자료형에 값을 담으려면 강제 형변환이 필요
	 		
	 		// 에러 해결 방법
	 		// 방법1. 연산결과를 int형으로 강제형변환
	 		int iSum1 = (int)(iNum + dNum); // 10.0 + 5.89 = 15.89
	 		System.out.println("iSum1 : " + iSum1);  // 15 출력
	 		// 형변환 통해서 정수값만 출력된다 ->
	 		
	 		// 방법2. double형 값 만을 int형으로 강제형변환 => 데이터 손실 발생
	 		int iSum2 = iNum + (int)dNum; // 10 + 5 = 15
	 		System.out.println("iSum2 : " + iSum2); // 15출력
	 		
	 		// 실수값을 정수형으로 강제형변환시 소수점 아래 부분은 버려짐 => 데이터 손실 발생 할 수 있다!
	 		
	 		// 방법3. 데이터 손실 발생하지 않게 연산결과를 double 변수에 대입
	 		double dSum3 = iNum + dNum ;
	 		System.out.println("dSum3 : " + dSum3); // '15.89' 출력
	 		
	 		// ** 데이터 손실 테스트
	 		int iNum2 = 290;
	 		byte bNum2 = (byte)iNum2;
	 		System.out.println("bNum2 : " + bNum2); // '34' 출력
	 		// byte의 범위가 (-128 ~ 127)여서 값을 잘못 출력
	 		
	 	
	 		
	 	
	 	}
}















