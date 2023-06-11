package com.kh.variable;

import java.util.Scanner;

// 사용자가 키보드로 입력한 값을 받아들이는 Scanner 실습
public class B_KeyboradInput {
	 public void inputTest1() {
		 
		 /*
		  * 키보드로 값을 입력 받는 방법
		  * Scanner를 사용한다!
		  * 즉 java.util.Scanner 클래스를 이용하는 것!
		  * Scanner 클래스 내부의 메소드를 호출해서 입력받는 것
		  * 
		  */
		 
		 // 스캐너 생성(new)
		 Scanner sc = new Scanner(System.in); // 입력 후 Scanner 상의 빨간 밑줄 생김 -> 커서 가져가서 import 생성 클릭 
		 // 기본적으로로 Scanner 메소드 생성하는 방법
		 // System.in : 입력받은 값을 바이트 단위로 받아들이겠다는 의미
		 
		 System.out.print("아무거나 입력해보세요 : "); // pintln이 아닌 print 
		 // sc.nextLine(); 콘솔창에 입력할 수 있게 바뀜
		 String message = sc.nextLine(); 
		 // 값을 입력하면 처음엔 버퍼(임시공간)라는 곳에 저장이 되고 이걸 소스로 활용을 하려면 메모리에 적재가 되어야 함 => 변수 사용
		 System.out.println("입력받은 내용 : " + message);
		 
		 sc.close(); // Scanner 클래스는 사용 후 반납
	 }
	 
	 public void inputTest2() {
	 
		 Scanner sc = new Scanner(System.in);
		 System.out.print("당신의 이름은 무엇 입니까? : ");
		 String name = sc.nextLine();
		 System.out.println("이름 : " + name);
		 
		
	 
		 /*
		  * 1. inputTest2()  메소드 생성
		  * 2. 스캐너 생성
		  * 3. 당신의 이름은 무엇입니까? 가이드 문구 출력
		  * 4. 이름을 변수에 저장
		  * 5. 변수에 저장된걸 출력
		  * 6. 스캐너 닫기
		  * 7. Run 클래스에서 inputTest2 메소드 호출
		  * 
		  */
		 
		 
		// 사용자가 입력한 값을 문자열로 받아오는 메소드 : nextLine(), next()
		// next() : 사용자가 입력한 값 중 공백이 있는 경우 공백 이전까지의 값만 읽어 옴, 공백이 있는 데이터는 제대로 된 값을 못 가져옴
		// 입력값을 경상남도 거제시를 출력하고 싶으면 nextLine()메소드를 사용해야 함
		// nextLine() : 사용자가 입력한 값 모두 읽어옴 (엔터 전 까지의 모든 값)
		 
		 System.out.print("당신의 나이는 몇 살 입니까? : ");
		 int age = sc.nextInt(); // nextInt() 는 사용자가 입력한 값을 정수로 읽어들이는 메소드
	
		 
		 System.out.print("당신의 키는 몇 입니까? (소수점 첫째 자리까지) : ");
		 double height = sc.nextDouble(); // nextDouble() 은 사용자가 입력한 값을 실수로 읽어들이는 메소드
		
	 }
	 
	 // 키보드로 값을 입력 받을 때 종종 발생되는 문제
	 public void inputTest3() {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("이름 : ");
		 String name = sc.nextLine();
		 
		 System.out.print("나이 : ");
		 int age = sc.nextInt();
		 
		 sc.nextLine(); // ★ 버퍼에 남아있는 개행문자(/n)를 제거해주는 코드
		 System.out.print("주소 : ");
		 String address = sc.nextLine();
		 
		 System.out.print("키 : ");
		 double height = sc.nextDouble();
		 
		 System.out.println(name + "님은 " + age + "살이며, 사는 곳은 " + address + "이고, 키는 " + height + "cm입니다.");
		 System.out.printf("%s님은 %d살이며, 사는 곳은 %s이고, 키는 %.1fcm입니다.", name, age, address, height);
		 // nextLine(); 메소드 제외 다른 메소드는 버퍼에서의 \n(개행문자)를 제거하지 않음, 그대로 버퍼에 /n 남아있기때문에 이 개행문자가 메모리로 넘어가 값을 이미 입력한것처럼 넘어가짐
		 // 그래서 주소 입력 전에 개행문자 제거 필요가 있음 -> nextLine(); 메소드 이용
		 
		 
	 }
	 
	 public void inputTest4() {
		 
		 //스캐너 생성
		 Scanner sc = new Scanner(System.in);
		 
		 // 문자열을 입력 받을 때 => sc.nextLinne(), sc.next() : 공백전까지만 출력
		 // 정수값을 입력 받을 때 => sc.nextInt()
		 // 실수값을 입력 받을 때 => sc.nextDouble()
		 
		
		 System.out.print("이름 : ");
		 String name = sc.nextLine();
		 
		 System.out.print("성별(M/F) : ");
		 // char gender = sc.nextChar(); => nextChar() 와 같은 메소드는 존재하지 않음!
		 char gender = sc.nextLine().charAt(0); // 스캐너로 입력된 값에서 인덱스 0번째 문자를 변수 gender에 저장
		 // 문자열.charAt(인덱스) : 해당 문자열로부터 해당 인덱스의 문자를 추출해주는 메소드
		 // ** 인덱스 : 순번 같은 존재, ★ 단 0부터 시작!
		 
		 System.out.print("나이 : ");
		 int age = sc.nextInt();
		 
		 System.out.print("키 : ");
		 double height = sc.nextDouble();
		 
		 System.out.println(name + "님의 개인정보");
		 System.out.println("성별 : " + gender);
		 System.out.println("나이 : " + age);
		 System.out.println("키 : " + height);
		 
	 }
	 
	 public void charAtTest() {
		 
		 String str = "Hello";
		 
		 // 변수에 기록하여 출력하는 방식
		 char ch = str.charAt(4); // 인덱스 4인 문자 'o' 가 변수에 저장 
		 System.out.println(ch);
		 
		 // 바로 출력하는 방식
		 System.out.println(str.charAt(4)); // 'o' 출력
		 // System.out.println(str.charAt(12)); -> 출력안됨, 입력된 숫자가 인덱스 범위를 벗어나서 "StringIndexOutOfBoundsException" 에러 발생
	 
		 
		 /*
		  * ★ 정리
		  * 1. 콘솔창에 (모니터) 출력하기 위해 : System.out.println() 메소드 이용
		  * 2. 콘솔창에 (키보드) 입력받기 위헤 : Scanner 이용해서 nextLine(), next(), nextInt(), nextDouble() 등을 이용
		  * 
		  * <주의사항>
		  * 1. sc.nextXXX() 메소드 뒤에 sc.nextLine() 메소드가 와야 될 경우, nextLine() 메소드를 한번 더 써줘서 버퍼에 남아있는 개행문자를 제거해주는 과정 필수!
		  * 	-> line 75
		  * 2. '문자'값을 입력받아야 될 경우, sc.nextLine() 메소드를 통해 우선 문자열로 받고 그 뒤에 .charAt(인덱스값) 메소드를 통해서 문자하나 추출
		  *	
		  */
	 }
	 
	 
}














