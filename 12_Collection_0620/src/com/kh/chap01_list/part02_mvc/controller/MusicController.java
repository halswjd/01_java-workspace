package com.kh.chap01_list.part02_mvc.controller;

import java.util.ArrayList;

import com.kh.chap01_list.part02_mvc.model.vo.Music;

// 사용자의 요청을 처리해주는 클래스! 출력문 쓰지 않기!
public class MusicController {
	
	private ArrayList<Music> list = new ArrayList<>(); // []
	{
		// 초기화 블럭
		// 필드부에서 객체 생성시 중괄호안에서 생성
		list.add(new Music("Attention", "뉴진스"));
		list.add(new Music("새삥", "지코"));
		list.add(new Music("새삥말고 헌삥", "김시연"));
		
	}
	

	public void insertMusic(String title, String artist) {
		list.add(new Music(title, artist));
	}
	
	public ArrayList<Music> selectMusic() {
		// 돌려준다 => return
		return list;
	}
	
	public int deleteMusic(String title) {
		
		int result = 0;
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.remove(i);
				result = 1;
				break;
			}
		}
		return result;
	}
	
	public ArrayList<Music> searchMusic(String keyword) {
		
		ArrayList<Music> searchList = new ArrayList();
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().contains(keyword)) {
				searchList.add(list.get(i));
			}
		}
		
		// searchList => 텅 비어있을 수도 있음 | 검색된 Music 객체들이 담겨있을수도 있음
		return searchList;
		
	}
	
	public ArrayList<Music> searchMusic(int menu, String keyword) {
		
		ArrayList<Music> searchList = new ArrayList<>();
		
		if(menu == 1) {
			for(int i=0; i<list.size();i++) {
				if(list.get(i).getTitle().contains(keyword)) {
					searchList.add(list.get(i));
				}
			}
		} else {
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getArtist().contains(keyword)) {
					searchList.add(list.get(i));
				}
			}
		}
		return searchList;
	}
	
	public int updateMusic(String title, String upArtist, String upTitle) {
		
		int result = 0;
		
		/*
		 * 선생님 코드
		 * Music m = list.get(i);
		 * if(m.getTile().equals(title)){
		 * 	m.setTiltle(upTitle)
		 * 	m.setArtist(upArtist)
		 * 	result =1;
		 * 	break;
		 * 
		 */
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.set(i, new Music(upTitle, upArtist));
				result = 1;
				break; // 결과값이 바로 나왔으면 반복 더 이상 안하고 빠져나오게
			}
		}
		return result;
	}
	
	
	
}
