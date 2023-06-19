package com.kh.practice.list.run;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.practice.list.model.vo.Dog;

public class DogRun {

	public static void main(String[] args) {

		// 5마리의 강쥐 이름을 입력 받아서 ArrayList에 저장한 후에
		// 이들 중 '구' 라는 이름이 포함된 강쥐를 모두 출력하시오.
		// * 처음에는 4마리의 강쥐 ArrayList 생성 후 (크기 4짜리)
		// 2번 인덱스에 마지막 강쥐를 추후에 추가 할 것!(끼워넣기)
		
		ArrayList<Dog> list = new ArrayList<Dog>(4);
		
		Scanner sc = new Scanner(System.in);
		
		int count = 1;
		while(count != 6) {
			System.out.print(count + "번째 강쥐 이름 입력 : ");
			String name = sc.nextLine();
			
			System.out.print("강쥐 나이 입력 : ");
			int age = sc.nextInt();
			sc.nextLine();
			
			System.out.print("강쥐 종 입력(ex. 말티즈) : ");
			String kind = sc.nextLine();
			
			if(count == 5) {
				list.add(2, new Dog(name, age, kind));
				//break;
			}else {
				list.add(new Dog(name, age, kind));
			}
			count++;
		}
		System.out.println("==================================");
		System.out.println("전체 깡쥐 출력");
		System.out.println("==================================");
		
		for(Dog d:list) {
			System.out.println(d);
		}
		
		// + 구 포함한 이름을 가진 강쥐가 몇마리 인지 출력하시오.
		System.out.println("==================================");
		System.out.println("이름에 '구'가 들어간 깡쥐 정보 출력");
		System.out.println("==================================");
		
		count = 0;
		
		for(Dog d:list) {
			if(d.getName().contains("구")) {
				System.out.println(d);
				count++;
			}
		}
		System.out.println("이름에 '구'가 들어간 강쥐는 총 " + count + "마리 입니다.");
				
		
		
	}

}
