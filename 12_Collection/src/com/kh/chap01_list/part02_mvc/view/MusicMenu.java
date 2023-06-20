package com.kh.chap01_list.part02_mvc.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.chap01_list.part02_mvc.controller.MusicController;
import com.kh.chap01_list.part02_mvc.model.vo.Music;

// 화면을 담당하는 클래스 (출력문, 입력문)
/**
 * @author hmj
 * @since 2023.06.20
 *  @version 1.0
 *  
 */
public class MusicMenu {
	
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	
	// 메인화면 : 프로그램 실행시 처음 보여주는 화면
	public void mainMenu() {
		
		while(true) {
			System.out.println("\n================ Welcome 별밤 ====================");
			System.out.println("1. 새로운 곡 추가");
			System.out.println("2. 곡 전체 조회");
			System.out.println("3. 특정 곡 삭제");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 수정");
			System.out.println("0. 프로그램 종료");
			
			System.out.print(">> 메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1:
				insertMusic();
				break;
			case 2:
				selectMusic();
				break;
			case 3:
				deleteMusic();
				break;
			case 4:
				searchMusic();
				break;
			case 5:
				updateMusic();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다. 이용해주셔서 감사합니다.");
				return; // 이 메소드를 호출했던 곳으로 감(Run클래스에서 메소드실행코드로)
			default :
				System.out.println("메뉴를 잘못 선택했습니다. 다시 선택해주세요.");
				break;
			}
		}
		
	}//
	
	/** alt shift J : 메소드 주석
	 * 1. 새로운 곡 추가하는 서브화면
	 */
	public void insertMusic() {
	
		System.out.println("\n=================== 곡 추가 ======================");
		System.out.print("추가하고자 하는 곡명 : ");
		String title = sc.nextLine();
		System.out.print("가수 : ");
		String artist = sc.nextLine();
		
		mc.insertMusic(title,artist);
		
		System.out.println("곡 추가가 완료되었습니다.");
		
	}
	
	/**
	 * 2. 전체 곡 조회용 서브화면
	 */
	public void selectMusic() {
		
		System.out.println("\n=================== 곡 전체 ======================");
		ArrayList<Music> list = mc.selectMusic();
		
		if(list.isEmpty()) {
			System.out.println("존재하는 곡이 없습니다.");
		} else {
			for(Music m:list) {
				System.out.println(m);
			}
		}
	}
	
	/**
	 * 3. 특정 곡 삭제시켜주는 서브화면
	 */
	public void deleteMusic() {
		
		System.out.println("\n=================== 곡 삭제 ======================");
		System.out.print("삭제하고자하는 곡명 : ");
		String title = sc.nextLine();
		
		int result = mc.deleteMusic(title);
		
		if(result == 0) {
			System.out.println("곡을 찾지 못했습니다.");
		} else {
			System.out.println("삭제 성공!");
			selectMusic();
		}
	}
	
	/**
	 * 4. 특정 곡 검색하는 서브화면
	 */
	public void searchMusic() {
		
		System.out.println("\n=================== 곡 검색 ======================");
		while(true) {
			
			System.out.println("1) 가수로 검색 ");
			System.out.println("2) 곡명으로 검색");
			System.out.print("번호 입력 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			if(menu ==1 || menu ==2) {
				
				System.out.print("검색명 : ");
				String search = sc.nextLine();
				
				ArrayList<Music> searchList = mc.searchMusic(menu, search);
				
				if(searchList.isEmpty()) {
					System.out.println("검색결과 없음");
				}else {
					for(Music m : searchList) {
						System.out.println(m);
					}
					break;
				}
			} else {
				System.out.println("다시 입력해주세요");
			}
				
		}
		
		
	}
	
	
	/**
	 * 5. 특정 곡 수정해주는 서브화면
	 */
	public void updateMusic() {
		
		System.out.println("\n=================== 곡 수정 ======================");
		System.out.print("수정하고자하는 곡명 : ");
		String title = sc.nextLine();
		System.out.print("제목 수정 : ");
		String upTitle = sc.nextLine();
		System.out.print("가수 수정 : ");
		String upArtist = sc.nextLine();
		
		int result = mc.updateMusic(title, upTitle, upArtist);
		
		if(result==1) {
			System.out.println("수정완료");
			selectMusic();
		} else {
			System.out.println("곡을 찾지못했습니다.");
		}
		
	}
	
	
	
	
}
