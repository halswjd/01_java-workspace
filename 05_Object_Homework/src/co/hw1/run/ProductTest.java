package co.hw1.run;

import co.hw1.model.vo.Product;

public class ProductTest {

	public static void main(String[] args) {
		
		// 매개변수 생성자를 이용하여 3개의 객체 생성 (위의 사용 데이터 참고)
		
		Product a = new Product("ssgnote9", "갤럭시노트9", "경기도 수원", 960000, 10.0);
		
		Product b = new Product("lgxnote5", "LG스마트폰5", "경기도 평택", 780000, 0.7);
		
		Product c = new Product("ktsnot3", "KT스마트폰3", "서울시 강남", 250000, 0.3);
		
		
		// 객체가 가진 필드 값 출력 확인
		System.out.println(a.information());
		System.out.println(b.information());
		System.out.println(c.information());
		
		System.out.println("=========================================");
		
		// 각 객체의 가격을 모두 120만원으로 변경 / 부가세율도 모두 0.05로 변경
		a.setPrice(1200000);
		b.setPrice(1200000);
		c.setPrice(1200000);
		
		a.setTax(0.05);
		b.setTax(0.05);
		c.setTax(0.05);
		
		
		
		// 객체가 가진 필드 값 출력 확인
		System.out.println(a.information());
		System.out.println(b.information());
		System.out.println(c.information());
		
		System.out.println("=========================================");
		
		// 각 객체의 가격에 부가세율을 적용한 실제 가격을 계산해서 출력함
		System.out.println("상품명 : " + a.getProductName());
		System.out.println("부가세 포함 가격 : " + (int)(a.getPrice()*a.getTax() + a.getPrice()) + "원");
		
		System.out.println("상품명 : " + b.getProductName());
		System.out.println("부가세 포함 가격 : " + (int)(b.getPrice()*b.getTax() + b.getPrice()) + "원");
		
		System.out.println("상품명 : " + c.getProductName());
		System.out.println("부가세 포함 가격 : " + (c.getPrice()*c.getTax() + c.getPrice()) + "원");
		
		// ** 실제가격 = 가격 + (가격 * 부가세율)
		
	}

}
