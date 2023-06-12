package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {

		// 3명의 학생 정보를 기록할 수 있게 객체 배열 할당 (Student[])
		Student[] s = new Student[3];
		
		// 위의 사용 데이터 참고하여 3명의 학생 정보 초기화
		s[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		s[1] = new Student("김말똥", 21, 187.3, 80, 2, "경영학과");
		s[2] = new Student("강개순", 23, 167, 45, 4, "정보통신공학과");
		
		
		// 위의 학생 정보 모두 출력
		for(int i=0; i<s.length; i++) {
			System.out.println(s[i]/*.toString()*/);
		}
		System.out.println("=====================================================");
		
		// 최대 10명의 사원 정보를 기록할 수 있게 배열을 할당 (Employee[])
		Employee[] emp = new Employee[10];
		
		// 사원들의 정보를 키보드로 계속 입력 받고 → while(true) 무한 반복문을 통해
		// 입력받은 정보들을 가지고 매개변수 생성자를 이용하여 객체 배열에 객체 생성
		// 한명씩 추가 될때마다 카운트함
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		while(true) { // 선생님은 count 변수와 while문만을 이용하여 객체 생성
			
			for(int i=0; i<emp.length; i++) {
				System.out.print("이름 : ");
				String name = sc.nextLine();
				
				System.out.print("나이 : ");
				int age = sc.nextInt();
				
				System.out.print("신장 : ");
				double height = sc.nextDouble();
				
				System.out.print("몸무게 : ");
				double weight = sc.nextDouble();
				
				System.out.print("급여 : ");
				int salay = sc.nextInt();
				sc.nextLine();
				
				System.out.print("부서 : ");
				String dept = sc.nextLine();
				
				emp[i] = new Employee(name, age, height, weight, salay, dept);
				count++;
				if(i==9) { // 배열 크기만큼 입력하고 빠져나가기
					break;
				}
				
				System.out.print("추가하시겠습니까? : ");
				char ch = sc.nextLine().charAt(0);
				if(ch=='y' || ch=='Y') {
					continue;
				}else if(ch=='n' || ch=='N'){
					break;
				}
			}
			System.out.println("=====================================================");
			for(int i=0; i<count; i++) {
				System.out.println(emp[i]);
			}
			break;
		}
		
		sc.close();
		

	}

}
