package com.kh.chap04_assist.part01_buffer.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferDao {

	/*
	 * 보조스트림 : 기반스트림만으로 부족했던 성능을 보다 향상 시켜주는 스트림
	 * 			 기반스트림에서 제공하지 않는 추가적인 메소드 제공 / 데이터전송속도 향상 + a
	 * 			>> 외부매체와 직접적으로 연결되는 스트림은 아님!!
	 * 			   절대로 단독 사용은 불가(반드시 기반스트림과 함께 사용)
	 * 
	 */
	
	// 프로그램 ---------> 파일 (출력)
	public void fileSave() {
		// FileWriter 기반스트림 가지고 해보자 (기반스트림 필수!)
		// 파일과 직접적으로 연결해서 2byte 단위로 출력할 수 있는 스트림
		
		// BufferdWriter : 버퍼라는 공간을 제공해주는 보조스트림 (속도향상) : 기반스트림이랑 이름 맞춰야함
		
//		BufferedWriter bw = new BufferedWriter("c_buffer.txt"); 기반스트림없이 단독 사용 불감
		
		// 1. 기반스트림 먼저 생성
//		FileWriter fw = new FileWriter("c_buffer.txt");
		
		// 2. 보조스트림 생성시 기반 스트림 객체를 전달하면서 생성
//		BufferedWriter bw = new BufferedWriter(fw);
		
		// 위의 두줄을 한줄로
		/*
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("c_buffer.txt"));
			
			// write 메소드 이용해서 데이터 출력
			bw.write("안녕하세요\n");
			bw.write("반갑습니다");
			bw.newLine(); // 개행 -> 추가적인 메소드 활용가능 
			bw.write("저리가세요");
			
			// 버퍼라는 공간에 계속 쌓아놨다가 한 번에 출력해줌 => 속도향상에 도움을 줌
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		*/
		
		// try ~ with ~ resource 구문으로 자원반납까지 더 간단하게 작업할 수 있음
		// jdk 7버전 이상부터 지원
		/*
		 * [표현법]
		 * try(try 블럭 내에서 사용할 스트림 객체 생성구문) { // 알아서 try 다 끝나면 해당 스트림 반납까지 다해줌
		 * 
		 * } catch(예외클래스 e) {
		 * 		
		 * }
		 */
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.txt"))) {
			// write 메소드 이용해서 데이터 출력
			bw.write("안녕하세요\n");
			bw.write("반갑습니다");
			bw.newLine();
			bw.write("저리가세요");
		} catch (IOException e) {
			e.printStackTrace();
		} // 자원반납 구문 안써도됨! 자동으로 반납까지 해줄거임
		
	}//
	
	// 프로그램 <------- 파일 (입력)
	public void fileRead() {
		// FileReader : 파일과 연결해서 2byte 단위로 데이터를 입력 받을 수 있는 기반스트림
		// BufferedReader : 속도향상에 도움이되는 보조스트림
		
		try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"))){
			
			/*
//			br.readline(); 한문장씩 가져오게 돼있음, 반환형 String
			System.out.println(br.readLine()); // 안녕하세요
			System.out.println(br.readLine()); // 반갑습니다
			System.out.println(br.readLine()); // 저리가세여
//			System.out.println(br.readLine()); // null => 파일의 끝을 만나면 null이 나옴
			*/
			
			String value = null;
			while((value = br.readLine()) != null) { // null과 비교할때는 equals(x), null 값은 static영역에 존재하는 박스에 담겨있으므로
				System.out.println(value);
			}
		} catch (FileNotFoundException e) { // FileNot~ 는 IOException의 자식클래스이므로 이 catch문 없어도 됨, 그래도 존재하게하려면 reach되게 부모클래스보다 위에 존재해야함
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}
	
	
}
