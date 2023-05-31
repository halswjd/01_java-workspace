package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {

	public void practice1() {
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("메뉴 번호를 입력하세요(숫자) : ");
		int num = sc.nextInt();
		String menu = " ";
		
		switch(num) {
		case 1:
			menu = "입력";
			break;
		case 2:
			menu = "수정";
			break;
		case 3:
			menu = "조회";
			break;
		case 4:
			menu = "삭제";
			break;
		case 7:
			System.out.println("프로그램이 종료됩니다.");
			return;
		default:
			System.out.println("다시 입력해주세요.");
			return;
		}
		System.out.println(menu + "메뉴입니다.");
		
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			if(num % 2 == 0) {
				System.out.println("짝수다");
			} else {
				System.out.println("홀수다");
			}
		} else {
			System.out.println("앙수만 입력해주세요.");
		}
	}
	
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 : ");
		int lang = sc.nextInt();
		
		System.out.print("수학 점수 : ");
		int math = sc.nextInt();
		
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		
		int sum = lang + math + eng;
		double aver = sum / 3.0;
		
		if(lang >= 40 && math >= 40 && eng >= 40 && aver >= 60) {
			System.out.printf("국어 : %d%n수학 : %d%n영어 : %d%n합계 : %d%n평균 : %.1f%n축하합니다, 합격입니다!"
					,lang, math, eng, sum, aver);
		} else {
			System.out.println("불합격입니다.");
		}
		
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 ~ 12 사이의 정수 입력 : ");
		int num = sc.nextInt();
		String result = " ";
		
		switch(num) {
		case 3:
		case 4:
		case 5:
			result = "봄";
			break;
		case 6:
		case 7:
		case 8:
			result = "여름";
			break;
		case 9:
		case 10:
		case 11:
			result = "가을";
			break;
		case 12:
		case 1:
		case 2:
			result = "겨울";
			break;
		default:
			System.out.println(num + "월은 잘못 입력된 달입니다.");
			return;
		}
		System.out.println(num +"월은 " + result + "입니다.");
	}
	
	public void practice5() {
		
		String id = "myId";
		String pw = "myPassword12";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String inputId = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String inputPw = sc.nextLine();
		
		if(inputId.equals(id)) {
			if(inputPw.equals(pw)) {
				System.out.println("로그인 성공!");
			} else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		} else {
			System.out.println("아이디가 틀렸습니다.");
		}
				
		
	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String input = sc.nextLine();
		
		switch(input) {
		case "관리자" :
			System.out.print("회원 관리, 게시글 관리, ");
		case "회원":
			System.out.print("게시글 작성, 댓글 작성, ");
		case "비회원":
			System.out.print("게시글 조회");
			
		}
		
		
	}
	
	
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		System.out.println("BMI 지수 : " + bmi);
		
		if(bmi >= 18.5) {
			if(bmi >= 23) {
				if(bmi >=25) {
					if(bmi >= 30) {
						System.out.println("고도비만");
					}else {
						System.out.println("비만");
					}
				}else {
					System.out.println("과체중");
				}
			}else {
				System.out.println("정상체중");
			}
				
		}else {
			System.out.println("저체중");
		}
		
		
	}
	
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피연산자1 입력(정수) : ");
		double num1 = sc.nextDouble();
		
		System.out.print("피연산자2 입력(정수) : ");
		double num2 = sc.nextDouble();
		
		sc.nextLine();
				
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		char input = sc.nextLine().charAt(0);
		
		double result = 0;
		
		if(num1 >0 && num2 > 0) {
			switch(input) {
			case '+':
				result = (num1 + num2);
				break;
			case '-':
				result = (num1 - num2);
				break;
			case '*':
				result = (num1 * num2);
				break;
			case '/':
				result = (num1 / num2);
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
				return;
			}
			
			System.out.printf("%d %c %d = %f", (int)num1, input, (int)num2, result);
			
		}
		
	}
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		double mid = sc.nextDouble() * 0.2;
		
		System.out.print("기말 고사 점수 : ");
		double fin = sc.nextDouble() * 0.3;
		
		System.out.print("과제 점수 : ");
		double report = sc.nextDouble() * 0.3;
		
		System.out.print("출석 회수 : ");
		double check = sc.nextDouble();
		
		double sum= mid + fin + report + check;
		
		String result = " ";
		
		if(20-check <= 20*0.3) {
			if(sum >= 70) {
				result = "Pass";
			}else {
				result = "Fail [점수 미달]";
			}
		} else {
			System.out.printf("Fail [출석 회수 부족 (%d/20)]", (int)check);
			return;
		}
		
		System.out.println("========= 결과 =========");
		System.out.printf("중간고사 점수(20) : %.1f%n", mid);
		System.out.printf("기말고사 점수(30) : %.1f%n", fin);
		System.out.printf("과제 점수(30) : %.1f%n", report);
		System.out.printf("중간고사 점수(20) : %.1f%n", check);
		System.out.printf("총점 : %.1f%n", sum);
		System.out.println(result);
		
	}
	
	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("실행 할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수 홀수");
		System.out.println("3. 합격 / 불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7.BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P / F");
		
		System.out.print("선택 : ");
		int num = sc.nextInt();
		
		String str = " ";
		
		switch(num) {
		case 1:
			str = str + num;
			break;
			
		case 2:
			str = str + num;
			break;
		case 3 :
			str = str + num;
			break;
		case 4 :
			str = str + num;
			break;
		case 5 :
			str = str + num;
			break;
		case 6 :
			str = str + num;
			break;
		case 7 :
			str = str + num;
			break;
		case 8:
			str = str + num;
			break;
		case 9 :
			str = str + num;
			break;
			
		}
		
		System.out.printf("(실습문제%s 실행)", num);
		
		
	}
	
}























