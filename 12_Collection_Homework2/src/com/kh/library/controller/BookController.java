package com.kh.library.controller;

import java.util.ArrayList;

import com.kh.library.model.vo.Book;
import com.kh.library.model.vo.Magazine;

//BookManager 인터페이스 구현
public class BookController implements BookManager  {
	ArrayList<Book> list = new ArrayList<Book>();

	@Override
	public void addBook(Book nBook) {
		list.add(nBook);
	}
	

	@Override
	public ArrayList<Book> getAllBook() {
		return list;
	}

	@Override
	public Book searchBookBybNo(String bNo) {
		
		Book b = null;
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getbNo().equals(bNo)) {
				b = list.get(i);
				break;
			}
		}
		
		return b;
	}

	@Override
	public ArrayList<Book> searchBookByTitle(String title) {
		
		ArrayList<Book> searchList = new ArrayList<Book>();
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().contains(title)) {
				searchList.add(list.get(i));
			}
		}
		return searchList;
	}
	
	
	@Override
	public ArrayList<Book> onlySearchBook() {
		ArrayList<Book> bList = new ArrayList<Book>();
		for(int i=0; i<list.size(); i++) {
			boolean result = !(list.get(i) instanceof Magazine);
			if(result) {
				bList.add(list.get(i));
			}
		}
		
		return bList;
	}

	@Override
	public ArrayList<Book> onlySearchMagazine() {
		ArrayList<Book> mList = new ArrayList<Book>();
		for(int i=0; i<list.size(); i++) {
			if(list.get(i) instanceof Magazine) {
				mList.add(list.get(i));
			}
		}
		
		return mList;
		
	}

	@Override
	public ArrayList<Book> magazineOfThisYearInfo(int year) {
		ArrayList<Book> yList = new ArrayList<Book>();
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i) instanceof Magazine) {
				if(((Magazine)list.get(i)).getYear() == year) {
					yList.add(list.get(i));
				}
			}
		}
		
		return yList;
	}

	@Override
	public ArrayList<Book> searchBookByPublisher(String publisher) {
		return null;
	}

	@Override
	public ArrayList<Book> searchBookByPrice(int price) {
		return null;
	}

	@Override
	public int getTotalPrice() {
		return 0;
	}

	@Override
	public int getAvgPrice() {
		return 0;
	}
	

}
