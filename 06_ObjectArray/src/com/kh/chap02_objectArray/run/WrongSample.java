package com.kh.chap02_objectArray.run;

import com.kh.chap02_objectArray.model.vo.Phone;

public class WrongSample {

	public static void main(String[] args) {

		Phone[] arr = new Phone[3]; // 배열만 생성, 배열 생성시 크기 지정은 필수!

//		==== 1번제 문제해결 =====
//		arr[0] = new Phone();
//		arr[1] = new Phone();
//		arr[2] = new Phone();
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].getName());
			// 배열만 생성시 arr[i]은 null만 출력되고 배열을 기본생성자로 생성시 
		}
		
		// 잘못된 부분
		// 1. NullPointerException : 객체배열의 각 인덱스에 담긴 값이 null 인 상태에서 메소드를 호출하려고 했기 때문에 에러
		//						조치 내용 => 객체배열을 만든 후 각 인덱스별로 객체 생성을 진행해야함
		// 2. ArrayIndextOutOfBoundsException : 배열의 적절한 인덱스 범위를 벗어난 경우
		//										조건식으로 i<=배열의 길이 라고 제시되어있음, 배열의 마지막 인덱스보다 큰 값이 제시
		//								조치 내용 => 조건식 수정 (i<배열의길이) 
		
	}
	

}
