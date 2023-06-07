package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		
		Product phone = new Product();
		
		phone.setpName("galaxy note 10");
		phone.setPrice(100);
		phone.setBrand("samsung");
		
		System.out.println("==== 상품1 ====");
		System.out.println("상품명 : " + phone.getpName());
		System.out.println("가격 : " + phone.getPrice() + "만원");
		System.out.println("브랜드 : " + phone.getBrand());
		
		System.out.println();
		
		Product tablet = new Product();
		
		tablet.setpName("iPad pro");
		tablet.setPrice(120);
		tablet.setBrand("apple");
		
		System.out.println("==== 상품2 ====");
		System.out.println("상품명 : " + tablet.getpName());
		System.out.println("가격 : " + tablet.getPrice() + "만원");
		System.out.println("브랜드 : " + tablet.getBrand());
		
		System.out.println();
		
		Product earphone = new Product();
		
		earphone.setpName("buds pro");
		earphone.setPrice(20);
		earphone.setBrand("samsung");
		
		System.out.println("==== 상품3 ====");
		System.out.println("상품명 : " + earphone.getpName());
		System.out.println("가격 : " + earphone. getPrice() + "만원");
		System.out.println("브랜드 : " + earphone.getBrand());
		
		
		System.out.println();
		System.out.println("=== 메소드 만들고 난 후 ===");
		phone.informaition(); // 출력 안됨 -> return으로 호출만 된거일뿐 sysout 을 만나야 출력이 됨
		System.out.println(phone.informaition());
		System.out.println(tablet.informaition());
	}

}
