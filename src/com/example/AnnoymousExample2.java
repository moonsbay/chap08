package com.example;

public class AnnoymousExample2 {
    // 익명 자식 객체   부모가 클래스
	// 익명 구현 객체   부모가 인터페이스
	
	interface Showable{
		void show();
		void hide();
	}
	
	static class A implements Showable{

		@Override
		public void show() {
			
		}

		@Override
		public void hide() {
			
		}
		
		void move() {
			
		}
		
	}
	
	public static void main(String[] args) {
		Showable a = new A();
		a.show();
		a.hide();
//		a.move();  이것은 안됨
		
		Showable b = new Showable() { //익명 구현 객체
			
			@Override
			public void show() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void hide() {
				// TODO Auto-generated method stub
				
			}
			
			void left() {
				
			}
		};
		b.show();
		b.hide();
//		b.left();     b타입으로 호출 안됨
	}

}
