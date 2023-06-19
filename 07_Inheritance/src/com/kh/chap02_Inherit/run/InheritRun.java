package com.kh.chap02_Inherit.run;

import java.util.ArrayList;

import com.kh.chap02_Inherit.model.vo.Airplane;
import com.kh.chap02_Inherit.model.vo.Car;
import com.kh.chap02_Inherit.model.vo.Ship;
import com.kh.chap02_Inherit.model.vo.Vehicle;

public class InheritRun /*extends Object*/ {

	public static void main(String[] args) {
		
		Car c = new Car("벤틀리", 12.5, "세단", 4);
		Ship s = new Ship("낚시배", 3, "어선", 1);
		Airplane a = new Airplane("종이비행기", 0.01, "제트기", 14);
		
		System.out.println(c.information());
		System.out.println(s.information());
		System.out.println(a.information());
		
		c.howToMove();
		s.howToMove();
		a.howToMove();
		
		System.out.println("======================================================");
		
		ArrayList<Vehicle> list = new ArrayList<>();
		
		list.add(new Car("벤틀리", 12.5, "세단", 4)); // 다형성 적용
		list.add(new Ship("낚시배", 3, "어선", 1));
		list.add(new Airplane("종이비행기", 0.01, "제트기", 14));
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).information());// 동적바인딩
		}
		
		System.out.println("======================================================");
		
		/*
		 * < 상속 장점 >
		 * 보다 적은 양의 코드로 새로운 클래스 작성 가능
		 * 코드를 공통적으로 관리하기 때문에 추가나 변경에 용이 (유지보수랑 생산성이 UP!)
		 * 
		 * 상속의 특징
		 * 클래스간의 상속에 있어서는 다중상속이 안된다!! 단일상속만 가능!!(부모클래스는 하나만)
		 * 자식객체는 부모클래스에 있는 메소드를 마치 내것처럼 호출 가능
		 * + 부모클래스에 있는 메소드가 맘에 안들면 자식 클래스에서 오버라이딩 가능(내 입맛대로 재정의 가능)
		 * 부모클래스에 정의돼있는 protected 필드는 자식클래스에서 직접 접근 가능
		 * 명시되어있지는 않지만 모든 클래스(제공하는 클래스, 직접 만든 클래스)는 Object 클래스의 후손이다. 
		 * => 즉, Object 클래스에 있는 메소드들 마음대로 호출 가능!
		 * => 뿐만 아니라 오버라이딩을 통해 재정의도 가능함!!
		 * 
		 */
		
		// 자동완성시 부모클래스가 Object임을 확인 가능
		System.out.println(c.hashCode());
		System.out.println(c.equals("s"));
		// 그럼 부모가 2명인가요?
		// 부모클래스는 Vehicle 하나, Vehicle의 부모클래스가 Object => 상위 클래스 모두 호출 가능
		
		// 알게모르게 모든클래스는 Object클래스의 메소드를 이용하고있었음
		System.out.println(c/*.toString()*/); // 자동으로 toString이 입력이돼서 주소값 출력이 가능했던것
		// .toSting() 메소드는 생략이되는 코드이기에 오버라이딩으로 활용 많이 함
		System.out.println(c); // 이렇게만 입력해서 출력이되게하려면? -> toString 메소드를 오버라이딩
		
	}

}
