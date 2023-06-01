package com.kh.practice.comp.func;

import java.util.Scanner;

public class RockPaperScissors {
	
	public void rps() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		int win = 0;
		int lose = 0;
		int same = 0;
		int sum = 0;
		
		while(true) {
			
			System.out.print("가위바위보 : ");
			String input = sc.nextLine();
			
			if(!(input.equals("exit"))) {
				
				int num = (int)(Math.random()*3+1);
				String str = " ";
				
				switch(num) {
				case 1:
					str = "가위";
					break;
				case 2:
					str = "바위";
					break;
				case 3:
					str = "보";
					break;
				}
				
				System.out.println("컴퓨터 : " + str);
				System.out.println(name + " : " + input);
				
				String result = " ";
				
				if(str.equals("가위")) {
					switch(input) {
					case "바위":
						result = "이겼습니다 !";
						win++;
						sum++;
						break;
					case "보":
						result = "졌습니다 ㅠㅠ";
						lose++;
						sum++;
						break;
					case "가위":
						result = "비겼습니다.";
						same++;
						sum++;
						break;
					}
				}else if(str.equals("바위")) {
					switch(input) {
					case "바위":
						result = "비겼습니다.";
						same++;
						sum++;
						break;
					case "보":
						result = "이겼습니다 !";
						win++;
						sum++;
						break;
					case "가위":
						result = "졌습니다 ㅠㅠ";
						lose++;
						sum++;
						break;
					}
					
				}else if(str.equals("보")) {
					switch(input) {
					case "바위":
						result = "졌습니다 ㅠㅠ";
						lose++;
						sum++;
						break;
					case "보":
						result = "비겼습니다.";
						same++;
						sum++;
						break;
					case "가위":
						result = "이겼습니다 !";
						win++;
						sum++;
						break;
					}
				}
				
				System.out.println(result);
				System.out.println();
				
			} else if(input.equals("exit")) {
				System.out.printf("%d전 %d승 %d무 %d패", sum, win, same, lose);
				break;
			}
			
			
			
			
			
		}
		
		
	}

}
