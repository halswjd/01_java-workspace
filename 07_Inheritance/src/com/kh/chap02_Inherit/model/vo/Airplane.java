package com.kh.chap02_Inherit.model.vo;

public class Airplane extends Vehicle {

	// 필드
		private int wing;
		
		// 생성자
		public Airplane() {
			
		}
		
		public Airplane(String name, double mileage, String kind, int wing) {
			super(name, mileage, kind);
			this.wing = wing;
		}
		
		public int getPropeller() {
			return wing;
		}
		public void setTire(int wing) {
			this.wing = wing;
		}
		
		public String information() {
			return super.information() + ", " + wing;
		}
		
		@Override
		public void howToMove() {
			System.out.println("바퀴를 굴리다가 날개를 휘저으며 움직인다.");
		}
}
