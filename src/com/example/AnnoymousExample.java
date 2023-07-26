package com.example;

public class AnnoymousExample {
    // 익명 자식 객체   부모가 클래스
	// 익명 구현 객체   부모가 인터페이스
	
	static abstract class A{
		abstract void  show();
	}
	
	static class B extends A{

		@Override
		void show() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public static void main(String[] args) {
		A a1 = new B();
		A a2 = new A() { //익명 자식 개체
			@Override
			void show() {
				System.out.println("Annoymous.show()...");
			}
		};
	}

}
