package com.kh.practice.token.run;

import com.kh.practice.token.controller.TokenController;
import com.kh.practice.token.view.TokenMenu;

public class Run {

	public static void main(String[] args) {
		
		TokenMenu m = new TokenMenu();
		m.mainMenu();
//		m.tokenMenu();
//		m.inputMenu();
		
		/*
		TokenController t = new TokenController();
		System.out.println(t.afterToken("가   나  다라마  바 사"));
		
		System.out.println(t.firstCap("banana"));
		
		System.out.println(t.findChar("application", 'a'));
		*/
	}

}
