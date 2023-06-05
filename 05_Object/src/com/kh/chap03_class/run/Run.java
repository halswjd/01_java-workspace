package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		
		Product phone = new Product();
		
		phone.setPname("galaxy note 10");
		phone.setPrice(100);
		phone.setBrand("samsung");
		
		System.out.println("==== 상품1 ====");
		System.out.println("상품명 : " + phone.getPname());
		System.out.println("가격 : " + phone.getPrice() + "만원");
		System.out.println("브랜드 : " + phone.getBrand());
		
		System.out.println();
		
		Product tablet = new Product();
		
		tablet.setPname("iPad pro");
		tablet.setPrice(120);
		tablet.setBrand("apple");
		
		System.out.println("==== 상품2 ====");
		System.out.println("상품명 : " + tablet.getPname());
		System.out.println("가격 : " + tablet.getPrice() + "만원");
		System.out.println("브랜드 : " + tablet.getBrand());
		
		System.out.println();
		
		Product earphone = new Product();
		
		earphone.setPname("buds pro");
		earphone.setPrice(20);
		earphone.setBrand("samsung");
		
		System.out.println("==== 상품3 ====");
		System.out.println("상품명 : " + earphone.getPname());
		System.out.println("가격 : " + earphone. getPrice() + "만원");
		System.out.println("브랜드 : " + earphone.getBrand());
	}

}
