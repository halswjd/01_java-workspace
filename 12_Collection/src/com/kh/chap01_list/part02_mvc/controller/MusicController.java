package com.kh.chap01_list.part02_mvc.controller;

import java.util.ArrayList;

import com.kh.chap01_list.part02_mvc.model.vo.Music;

// 사용자의 요청을 처리해주는 클래스! 출력문 쓰지 않기!
public class MusicController {
	
	private ArrayList<Music> list = new ArrayList<>();
	{
		list.add(new Music("소녀시대", "소녀시대"));
		list.add(new Music("블루문", "엔플라잉"));
		list.add(new Music("소녀", "이문세"));
	}
	
	public void insertMusic(String title, String artist) {

		list.add(new Music(title, artist));
		
	}
	
	public ArrayList<Music> selectMusic() {
		
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
	
	public ArrayList<Music> searchMusic(int menu, String search) {
		
		ArrayList<Music> searchList = new ArrayList<Music>();
		
		if(menu==1) {
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getArtist().contains(search)) {
					searchList.add(list.get(i));
				}
			}
		} else {
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getTitle().contains(search)) {
					searchList.add(list.get(i));
				}
			}
		}
		
		return searchList;
		
	}
	
	public int updateMusic(String title, String upTitle, String upArtist) {
		
		int result = 0;
		
		for(int i=0; i<list.size(); i++) {
			Music m = list.get(i);
			if(m.getTitle().equals(title)) {
				m.setArtist(upArtist);
				m.setTitle(upTitle);
				result = 1;
				break;
			}
		}
		
		return result;
		
	}
	
	
}
