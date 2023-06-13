package com.kh.chap02_abstractAndInterface.part01_easy.run;

import com.kh.chap02_abstractAndInterface.part01_easy.model.vo.Basketball;
import com.kh.chap02_abstractAndInterface.part01_easy.model.vo.FootBall;
import com.kh.chap02_abstractAndInterface.part01_easy.model.vo.Sports;

public class EasyRun {

	public static void main(String[] args) {

//		Sports s = new Sports(); Sports가 추상클래스라 객체 생성 안됨
		// 추상클래스 객체 생성 불가! => 왜? 미완성 클래스라서
		
//		Sports s; 객체 생성이 안될뿐이지 레퍼런스로는 사용이 가능함.
		Sports s = new Basketball(); // 다형성 적용시켜서 부모타입으로 자식객체를 받아주는 형태는 가능하다
		
		Sports[] arr = new Sports[2]; // 객체 안된다며? => 이건 객체 생성이 된게 아니라 배열만 만든거
		
//		 부모				자식  =>	다형성 적용(부모레퍼런스로 자식객체를 생성하는 것)
		arr[0] = new Basketball(); // 이게 객체 생성이된 것
		arr[1] = new FootBall();
		
		// 단순 for문
		for(int i=0; i<arr.length; i++) {
			arr[i].rule();
		}
		
		// 향상된 for문
		for(Sports a :arr) { // a = arr[0], a = arr[1] 모든 arr 탐색 후 빠져나옴
			// 배열 이름 먼저쓰고 배열의 자료형이 뭔지 생각해보기
			a.rule();
			// Sports 클래스의 메소드를 실행할것처럼 보이지만 자식객체에 오버라이딩 메소드가 실행 됨 => 동적바인딩
		}
		
		/*
		 * 동적바인딩 : 컴파일 시점(코들르 막 입력하는 시점)에서는 정적바인딩으로 현재 레퍼런스의 자료형의 클래스에 있는 메소드를 가리키긴함(자동완성시 확인가능)
		 * 			 런타임 시점(실행할 때에 시점)에서는 동적바인딩으로 각각의 자식클래스에 오버라이딩 된 메소드가 있을 경우 그 메소드를 실행함
		 * 
		 */
		
		
		/*
		 * < 추상메소드 >
		 * 미완성된 메소드로 몸통부({})가 구현되어있지않은 메소드
		 * 추상메소드가 하나라도 있다면 추상클래스로 만들어줘야함
		 * 
		 * 추상클래스
		 * 미완성된 클래스
		 * 일반필드 + 일반메소드 [+ 추상메소드]
		 * => 추상메소드를 가진 클래스는 반드시 추상클래스로 명시 해야됨
		 * 
		 * 추상메소드가 굳이 없어도 추상클래스로 만들 수 있음
		 * 언제사용되나요?
		 * 개념적 > 단지 이 클래스가 미완성된 클래스다 라는걸 부여 할 목적 => 덜만들었을 때
		 * 프로그래밍적 > 객체 생성이 불가 하게끔 하고자할 때
		 * 
		 * 추상메소드가 존재하는 추상클래스를 쓰는 이유
		 * 부모클래스에 추상메소드가 존재한다면 자식클래스에서는 강제로 오버라이딩해서 동일한 패턴의 메소드를 가지게 됨!(강제성부여)
		 * 
		 * => 각 자식 클래스마다 실행시킬 내용은 다르지만 동일한 형태의 메소드로 구현했으면 할 때
		 * => 메소드 통일성 확보 목적
		 * => 표준화된 틀을 제공할 목적
		 * 
		 */
		
		
		// ctrl shift R : 파일명으로 찾기
		// ctrl H : 소스 찾기 File Search로 검색 , * : 모든 확장자
		
		
	}

}
