package com.kh.chap03_override.run;

import com.kh.chap03_override.model.vo.Book;

public class OverrideRun {

	public static void main(String[] args) {

		Book bk1 = new Book("수학의 정석", "나수학", 100);
		
		Book bk2 = new Book("칭찬은 고래도 춤추게한다", "고래", 300);
		
		System.out.println(bk1); // toString은 생략되어져있는 자동으로되는 메소드 -> Book클래스에서 오버라이딩으로 출력되게끔 재정의함
				
		// 출력문에 레퍼런스를 출력하고자 할 때 JVM이 자동으로 해당 레퍼런스.toString() 메소드 호출
		
		// 오버라이딩 전 : Object 클래스에 있는 toString() 실행 => 풀클래스명 + @ + 주소값이 return
		// 오버라이딩 후 : Book 클래스의 toString() 실행 => 해당 객체가 가지고 있는 모든 필드값을 한 문자열로 합쳐 return
		
	}

}
