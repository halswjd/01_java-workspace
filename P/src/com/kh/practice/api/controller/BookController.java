package com.kh.practice.api.controller;

import java.util.Date;

import com.kh.practice.api.model.vo.Book;

public class BookController {

	public BookController() {
		
	}
	
	// private 접근제한자로 크기 5의 Book 객체 배열 생성
	// 각각의 인덱스에 접근하여 샘플 데이터 넣어서 객체 생성
	private Book[] b = new Book[5];
	{
		b[0] = new Book("자바의 정석", "차은우", "나무", new Date(2023-1900, 6-1, 14), 10000);
		b[1] = new Book("여러분 파이팅", "주지훈", "사과", new Date(2023-1900, 5-1, 11), 20000);
		b[2] = new Book("API의 모든것", "문동은", "오렌지", new Date(2020-1900, 4-1, 25), 35000);
		b[3] = new Book("언어의 천재", "장원영", "키위", new Date(2015-1900, 1-1, 1), 70000);
		b[4] = new Book("개발왕국", "시연샘", "바나나", new Date(2022-1900, 12-1, 25), 80000);
		
	}
	// 1. 도서 전체 출력 기능 메소드
	public void printAll() {
	// list에 담긴 전체 Book객체의 정보 출력하는 구문 작성하시오.
	// 1) for loop문 방법
		/*
		for(int i=0; i<b.length; i++) {
			System.out.println(b[i]);
		}
		*/
	// 2) for each문 방법 (향상된 for문)
		for(Book a:b) {
			System.out.println(a);
		}
	}
	
	// 2. 도서 추가 기능 메소드
	public void insertBook(String newTitle, String newAuthor, String newPublisher, String 
	newDate, String newPrice) {
	// 1. 매개변수로 전달받은 newPrice값 ==> String --> int로 변환작업 (int price라는 변수에 담으시오)
	// "20000" --> 20000
		
	// 2. 매개변수로 전달받은 newDate값 ==> String --> Date로 변환 작업 (Date publishDate에 담으시오)
	// '-'를 구분자로 StringTokenizer를 이용하여 문자열 분리 후 각각 년,월,일 을 Date에 적용
	// 1) StringTokenizer를 이용한 방법
	// 1_1) StringTokenizer를 이용하여 먼저 "2020-07-01" 을 각각 문자열로분리("2020", "07", "01")
	// 1_2) 각 분리된 문자열들을 매번 뽑아서 int 변수들에 담기
	// 1_3) year, month, date 가지고 Date객체 생성하기
	// 2) split 메소드를 이용한 방법
	// 2_1) split 메소드를 이용하여 먼저 "2020-07-01" 을 각각 문자열로 분리후 String[] 배열에 담기
	// 2_2) 각 분리된 문자열들이 담겨있는 해당 배열에 인덱스에 접근해서int 변수들에 담기
	// 2_3) year, month, date 가지고 Date객체 생성하기
	
	}
}











