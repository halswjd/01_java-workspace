package com.kh.chap02_set.part01_hashSet.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.kh.chap02_set.part01_hashSet.model.vo.Student;

public class SetRun {

	public static void main(String[] args) {
		
		// Object.equals() => 두 객체의 "주소값"을 비교해서 일치하면 true / 일치하지 않으면 false 반환
		// Object.hashCode() => 해당 객체의 "주소값"을 가지고 10진수 형태로 만들어서 반환
		
		// String.equals() => 오버라이딩 => "실제 담긴 문자열"을 가지고 비교해서 일치하면 true / 일치하지 않으면 false 반환
		// String.hashCode() => "실제 담긴 문자열"을 가지고 10진수의 형태로 만들어서 반환

		HashSet<String> hs1 = new HashSet<>();
		
		hs1.add("반갑습니다");
		hs1.add(new String("반갑습니다"));
		hs1.add(new String("여러분"));
		hs1.add(new String("안녕하세요"));
		hs1.add(new String("여러분"));
		
		System.out.println(hs1); // [반갑습니다, 안녕하세요, 여러분]
		// 저장 순서 유지 안됨!! (인덱스 개념 없음), 중복된 데이터(동일객체) 보관 불가능!
		
		HashSet<Student> hs2 = new HashSet<>();
		
		// 존잘월드 3명이 산다고 가정
		hs2.add(new Student("공유", 43, 100));
		hs2.add(new Student("차은우", 26, 85));
		hs2.add(new Student("주지훈", 24, 20));
		hs2.add(new Student("공유", 43, 100));
		
		System.out.println(hs2); // 저장 순서 유지 안됨!!(인덱스 개념 없음), 중복제거 안됨 => 왜? 동일객체로 판단이 안되고 있어서...
		
		// HashSet 이라는 공간에 객체가 추가 될때마다 동일 객체인지 비교!! => 자바에서 Object의 hashCode와 equals로 비교해서 판단
		// 동일 객체 : 각 객체마다 hashCode()호출결과가 일치하고, equals() 비교시 true일 경우 => String의 오버라이딩된 메소드 이용 필요
		// Student 클래스에서 오버라이딩으로 hashCode, equals 메소드 생성시 중복제거 됨 
		
		// Student equals() 오버라이딩 => "실제 각 필드에 담긴 데이터" 들이 다 일치하면 true / 일치하지않으면 false
		// Student hashCode() 오버라이딩 => "실제 각 필드에 담긴 데이터"들이 일치하면 동일한 10진수 반환하도록
		
		/*
		System.out.println(new Student("공유", 43, 100).hashCode()); 
		System.out.println(new Student("공유", 43, 100).hashCode()); // 실제 주소값은 다르지만 담긴 데이터의 값이 일치해서 위의 출력값과 같음
		// 재정의한 hashCode() 메소드에 의해 둘다 결과 똑같음
		
		System.out.println(new Student("공유", 43, 100).equals(new Student("공유", 43, 100))); // true
		*/
		
//		hs2.get(1); => 인덱스의 개념도 없고 get메소드 자체가 정의되어 있지 않음!!(하나의 객체만 뽑아올 수 없음)
		
		// HashSet 의 담긴 모든 객체들에 순차적으로 접근
		// 1. for문 사용 가능 (단, for each문만 사용가능)
		for(Student s : hs2) {
			System.out.println(s);
		}
		
		System.out.println("========================================================");
		
		// 2. ArrayList에 담아준 다음 ArrayList를 반복문 돌려가며 접근
		// ArrayList에 담기
		// 방법1. ArrayList 생성 후 addAll()메소드 이용해서 통째로 추가하기
		ArrayList<Student> list = new ArrayList<>();
		list.addAll(hs2);
		
		// 방법2. ArrayList 생성과 동시에 통째로 추가하는 방법
		ArrayList<Student> list2 = new ArrayList<>(hs2);
		for(int i=0; i<list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		
		// 근데 이거 왜 쓰는거임?
		// 중복된 데이터가 들어오면 절대 안되는 경우!! => 근데 거의 안쓰임...
		
		System.out.println("========================================================");
		
		// 3. Iterator 반복자 이용해서 순차적으로 접근
		Iterator<Student> it = hs2.iterator(); // hs2에 담겨있는 객체들을 Iterator(반복자)에 담는 과정
//		Student s = it.next();
//		System.out.println(s);
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println(s);
		}
		
//		it.next(); NoSuchElementException 더 이상 뽑을 요소 없음
		
		
		
		
		
		
		
	}

}
















