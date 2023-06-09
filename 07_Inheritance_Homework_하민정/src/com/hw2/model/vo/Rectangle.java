package com.hw2.model.vo;

public class Rectangle extends Point{

	// 필드부
	private int width;
	private int height;
	
	// 생성자
	public Rectangle() {
		
	}
	public Rectangle(int x, int y, int width, int height) {
		super(x,y);
		this.width = width;
		this.height = height;
	}
	
	
	// 메소드
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public void draw() {
		super.draw();
		System.out.println("면적 : " + width * height);
		System.out.println("둘레 : " + 2 * (width + height));
	}
}
