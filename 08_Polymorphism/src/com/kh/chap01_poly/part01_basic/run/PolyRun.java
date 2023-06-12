package com.kh.chap01_poly.part01_basic.run;

import com.kh.chap01_poly.part01_basic.model.vo.Child1;
import com.kh.chap01_poly.part01_basic.model.vo.Child2;
import com.kh.chap01_poly.part01_basic.model.vo.Parent;

public class PolyRun {

	public static void main(String[] args) {

		// 기억해둘 것 !! '=' 기준으로 해서 좌항과 우항의 자료형(타입)이 일치해야함
		
		System.out.println("1. 부모타입 레퍼런스로 부모객체를 다루는 경우");
		Parent p1 = new Parent(); // 크기는 필드부 갯수만큼
		p1.printParent();
//		p1.printChild1(;)
		// p1 레퍼런스로 Parent 에만 접근 가능
		
		System.out.println("2. 자식타입 레퍼런스로 자식객체를 다루는 경우");
		Child1 c1 = new Child1();
		c1.printChild1();
		c1.printParent(); // 부모클래스의 메소드도 사용 가능 => 자동형변환이 된거였음! (Child1 => Parent)
		((Parent)c1).printParent(); // 내부적으로 아래 코드를 위 코드로 자동형변환
		// c1 레퍼런스로 Child1, Parent 둘 다 접근 가능
		// Parent 접근 시 자동으로 형변환된 채로 진행된거임
		
		System.out.println("3. 부모타입 레퍼런스로 자식객체를 다루는 경우(다형성의 개념이 적용)");
		Parent p2 = /*(Parent)*/new Child1(); // 좌항과 우항의 자료형이 다르다 => 에러 안뜸? => 자동형변환이 된 것
		Parent p3 = new Child1(1, 2, 3);
		System.out.println(p3.information());
	
		p2.printParent();
//		p2.printChild1(); p2는 Parent이기 때문에 자식의 메소드 사용 안됨
		((Child1)p2).printChild1(); // 강제 형변환을 통해 자식 메소드 호출 가능!!
		
		// p2 레퍼런스로 지금 당장은 Parent에만 접근 가능하지만
		// Child1에 접근하고자 한다면 강제형변환을 하면 접근은 가능!
		
		/*
		 * "상속 구조의 클래스들 간"에는 형변환 가능
		 * 
		 * 1. UpCasting : 자식이 마치 부모인것처럼 형변환, 자식타입 => 부모타입 형변환 -> 자동형변환
		 * 			ex ) 자식.부모메소드(); 
		 * 2. DownCasting : 부모타입 => 자식타입 형변환 -> 강제형변환
		 * 			ex ) ((자식)부모).자식메소드();
		 * 
		 */			

//		String str = (String)new Child1();  상속구조 아니면 안된다.
		
		// 다형성 정의
		// 부모타입으로부터 파생된 여러가지 타입의 자식 객체들을 부모클래스 타입 하나로도 다룰 수 있다.
		
		// 다형성을 쓰는 목적
		
		// 다형성을 배우기 전..
		Child1[] arr1 = new Child1[2]; // 배열 생성
		arr1[0] = new Child1(1, 2, 4);
		arr1[1] = new Child1(2, 3, 5);
		
		Child2[] arr2 = new Child2[2];
		arr2[0] = new Child2(2, 1, 5);	
		arr2[1] = new Child2(3, 6, 2);	
		
		
		// --------------------------------------------------
		// 다형성 (부모타입 레퍼런스)을 적용한 후...)
		Parent[] arr = new Parent[4]; // Parent 타입
		arr[0] = new Child1(1, 2, 4);
		arr[1] = new Child2(2, 1, 5);
		arr[2] = new Child1(5, 7, 2);
		arr[3] = new Child2(2, 3, 5);
		// 하나의 부모타입만으로 여러 자식 객체들을 받을 수 있음 => 편리하다, 코드길이 감소
		
		System.out.println("======================================================");
		((Child1)arr[0]).printChild1();
		((Child2)arr[1]).printChild2();
//		((Child1)arr[2]).printChild2();
//		((Child2)arr[2]).printChild2(); : ClassCastException 에러 => 부적절한 형변환
		// 내가 생성한 타입에 맞게 형변환을 해야함, Child1으로 생성했으니 Child1으로만 형변환 가능
		((Child2)arr[3]).printChild2();
		
		System.out.println("=========== 반복문 이용해서 출력 ==============");
		for(int i=0; i<arr.length; i++) {
			
			/*
			 * instanceof 연산자 => 연산결과를 true / false 로 반환
			 * 현재 레퍼런스가 실질적으로 어떤 클래스 타입을 참조하는지 확인할 때 사용
			 * 
			 */
			
			if(arr[i] instanceof Child1) { // 헤당 레퍼런스가 실제 Child1 참조하고 있다면 true 아니면 false를 뱉는다
				((Child1)arr[i]).printChild1();
			} else {
				((Child2)arr[i]).printChild2();
			}
			
			/*
			if(i==0 || i==2) {
				((Child1)arr[i]).printChild1();
			}else {
				((Child2)arr[i]).printChild2();
			}
			*/
		}
		
		Parent pp = new Child1();
		pp.print(); // Child1 클래스 메소드의 내용 출력
		
		/*
		 * 동적바인딩 : 프로그램이 실행되기 전에는 컴파일이 되면서 정적바인딩(레퍼런스 타입의 메소드를 가리킴)
		 * 			단, 실질적으로 참조하는 자식클래스에 해당메소드가 오버라이딩돼있다면 프로그램 실행시 동적으로 그 자식클래스의 오버라이딩 된 메소드를 찾아서 실행한다
		 * 
		 */
		
		System.out.println("====================================");
		
		for(int i=0; i<arr.length; i++) {
			arr[i].print();
		}
	}

}











