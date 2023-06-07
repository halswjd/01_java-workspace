package com.kh.chap04_field.model.vo;

// 클래스 변수(static 변수), 상수필드에 대해서 알아보기

public class FieldTest3 {

	// static 은 공유의 개념
	// static 이 붙은 애들은 프로그램 실행과 동시에 메모리의 static영역에 올라감!!
	// 프로그램 실행과 동시에 메모리상에 한번 올려놓고 여기저기서 가져다 쓰는 개념
	// public이랑 같이 쓴다
	
	public static String sta = "static_FiledTest3";
	
	// static : 공유의 개념
	// final : 상수의 개념(한번 값 지정하면 변경안됨)
	
	// 상수필드 (static final) : 프로그램 시작시 값이 저장되면 더 이상 변경되지 않고 공유하면서 사용할 목적
	public static final String STA_FIN = "static final"; // 상수 선언은 대문자로 명칭
	
}
