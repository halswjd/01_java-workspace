package com.kh.chap03_class;

import com.kh.chap03_class.model.vo.Person;

public class ClassRun {

	public static void main(String[] args) {
		
		Person p = new Person(); 	// new를 만나면 heap 영역에 객체가 생김 -> 크기는 필드부에 지정한 갯수만큼 
		
		System.out.println(p.getId()); // null 출력 (값 입력을 안해서)
		System.out.println(p.getGender()); // ' ' (공백) 출력
		
		// 생성 후에 필드에 담긴 값을 곧 바로 알아보면 JVM이 초기화(값 세팅)까지 진행해줬음!!
		
		p.setId("user01");
		p.setPwd("pwd01");
		p.setGender('F');
		p.setAge(26);
		p.setEmail("minjung3229@gmail.com");
		p.setName("하민정");
		p.setPhone("01043292816");
		
		System.out.println("=== 값 대입 후 ===");
		System.out.println(p.getId());
		System.out.println(p.getPwd());
		System.out.println(p.getname());
		System.out.println(p.getAge());
		System.out.println(p.getGender());
		System.out.println(p.getPhone());
		System.out.println(p.getEmail());
		
		System.out.println();
		System.out.println(p.information());
		
	}

}
