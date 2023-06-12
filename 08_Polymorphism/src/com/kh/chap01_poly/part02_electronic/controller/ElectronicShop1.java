package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

// 다형성 적용 안했을 때
public class ElectronicShop1 {

	// 용산 전자상가에 있는 가게
	
	// 필드부
//	private int price; // 기본 자료형
	
	// 3개 제품을 마련할 자리부터 만들자
	private Desktop desk; // 내가 만든 자료형
	private NoteBook note; // 객체 생성은 안되고 텅 비어있음
	private Tablet tab;
	
	// 이건 실제로 객체 생성 된 것은 아님
	// 필드가 메모리상에 확보되는 순간 => 객체가 생성되는 순간!!
	
	public void insert(Desktop d) { // Desktop d = new Desktop(~~~~~);
		desk = d;
	}
	
	public void insert(NoteBook n) { // NoteBook n = new NoteBook(~~~~);
		note = n;
	}
	
	public void insert(Tablet t) { // Tablet t = new Tablet(~~~~);
		tab = t;
	}
	// 위 세개의 insert메소드는 오버로딩 => 동일한 클래스에 동일한 메소드 명으로 여러개 만들어져있는것
	// 단, 매개변수명은 달라야 한다

	
	
	// 조회
	// 모르겠으면 일단은 반환형을 void 가자 => 나중에 수정
	public Desktop selectDesktop() {
		return desk;
	}
	
	public NoteBook selectNoteBook() {
		return note;
	}
	
	public Tablet selectTablet() {
		return tab;
	}
	
	// 그럼 insert처럼 select도 같은 메소드명으로 하면 안되는 이유는?
	// 매개변수가 없기 때문에 불가함!! => 오류남
	
	// 현재는 메소드가 총 6개!!
	// 다형성 적용하면? 2개~3개 줄이기가능함
}








