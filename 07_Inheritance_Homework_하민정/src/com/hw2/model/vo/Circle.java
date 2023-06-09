package com.hw2.model.vo;

public class Circle extends Point{
	
	// 필드
	private int radius;
	
	
	// 생성자
	public Circle() {
		
	}
	
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}
	
	// 메소드
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Override
	public void draw() {
		super.draw();
		System.out.printf("면적 : %.1f\n", Math.PI * radius * radius);
		System.out.printf("둘레 : %.1f\n", Math.PI * radius * 2);
		
//		System.out.println("면적 : " + Math.PI * radius * radius);
//		System.out.println("둘레 : " + Math.PI * radius * 2);
	}

}
