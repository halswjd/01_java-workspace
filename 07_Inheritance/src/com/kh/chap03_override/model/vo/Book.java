package com.kh.chap03_override.model.vo;

public class Book /*extends Object*/ {
	
	//필드
	private String title;
	private String author;
	private int price;
	
	
	// 생성자
	public Book() {
		
	}
	
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	
	// 메소드
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	/*
	 * < 오버라이딩 >
	 * 자식클래스가 상속받고 있는 부모클래스의 메소드를 재정의(재작성) 하는 것
	 * 부모가 제공하는 메소드를 자식이 일부 고쳐서 사용하겠다는 의미
	 * 자식객체를 통해 실행 시 자식메소드가 우선권을 가짐
	 * 
	 * * 오버라이딩 성립 조건
	 * 부모메소드명과 동일
	 * 매개변수 개수, 자료형, 순서 동일(매개변수명 상관없음)
	 * 부모메소드의 반환형 동일
	 * 부모메소드의 접근제한자보다 범위가 같거나 커야한다
	 * ex) 부모메소드의 접근제한자 protected일 경우 오버라이딩하는 메소드는 접근제한자는 protected, public 이어야함
	 * => 규약의 개념 (너가 재정의 할거면 이정도의 규칙은 지켜줘라)
	 * 
	 * @Override 어노테이션
	 * 생략가능함, 크게 상관 X (명시하지 않아도 오버라이딩 된 상태)
	 * 어노테이션 붙이는 이유
	 * >> 부모메소드 명이나 매개변수가 수정될 경우 => 찾아보기 쉽다.
	 * >> 자식메소드 기술시 오타가 있을 경우 => 찾아보기 쉽다. 부모메소드를 오버라이딩하는 자식클래스에서의 오류발견 찾기 용이
	 * 
	 */
	
	@Override
	public String toString() { // Object클래스에 있는 toString메소드를 재정의
		return "title : " + title + ", author : " + author + ", price : " + price;
	}
	
}








