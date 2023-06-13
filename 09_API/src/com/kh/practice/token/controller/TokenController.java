package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	
	public TokenController() {
		
	}
	
	public String afterToken(String str) {
		// 매개변수로 받아온 str을 StringTokenizer를 이용하여
		// 띄어쓰기를 없애고 없앤 문자열 반환
		StringTokenizer stn = new StringTokenizer(str," ");
		String result = "";
		while(stn.hasMoreTokens()) {
			result += stn.nextToken();
		}
		return result;
	}
	
	public String firstCap(String input){
		// 매개변수로 받아온 input의 첫 번째 글자만 대문자로 바꾼 문자열 반환
		String str = (input.charAt(0)+"").toUpperCase().concat(input.substring(1));
		return str;
		}
	
	public int findChar(String input, char one){
		// 매개변수의 문자가 문자열 안에 몇 개가 들어가 있는지 반환
		int count = 0;
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i) == one) {
				count++;
			}
		}
		return count;
		}


}



