package com.example;

import java.util.TimerTask;

public class InterfaceExample {
	static class A { //일반클래스
		class AA{
			
		}
		static int count;
		int num;
		static {
			
		}
		public A() {
			
		}
		void show() {
			
		}
		static int getCount() {
			return count;
		}
	}
	
	static abstract class B{  //추상클래스
		static int count = 0;
		int num;
		static {  //스태틱필드
			
		}
		public B() {
			
		}
		void show() {
			
		}
		static int getCount() {
			return count;
		}
		abstract void hide();  //추상메소드
	}
	
	static class AA extends A{
		
	}
	
	static class BB extends B{ // B에 있는 추상메소드를 반드시 BB에서 정의해줘야 한다

		@Override
		void hide() {
			
		}
		                        
	}
	
	static class Task extends TimerTask{

		@Override
		public void run() {
			
		}
		
	}
	
	static abstract class D{  //순수 추상 클래스(only 추상 매소드로만 이루어진 class)
		abstract void show();
		abstract void hide();
	} // --> 인터페이스로 구현 가능
	
	interface Showable{
		void show();     // abstract 안붙여도 됨
		void hide();
	}
	
	interface Moveable{
		void left();
		void right();
		void up();
		void down();
	}
	
	static class E implements Showable, Moveable{ //Showable외 N개의 인터페이스가 올 수 있다
                // E는 구현class라고 한다, 인터페이스가 마치 부모처럼 실행
		@Override
		public void show() {
			
		}

		@Override
		public void hide() {
			
		}

		@Override
		public void left() {
			
		}

		@Override
		public void right() {
			
		}

		@Override
		public void up() {
			
		}

		@Override
		public void down() {
			
		}
		
	}
	
	static class DD extends D{

		@Override
		void show() {
			
		}

		@Override
		void hide() {
			
		}
		
	}
	
	
	
	public static void main(String[] args) {
		A a = new A();  //일반클래스 인스턴스 생성이 목적
//		B b = new B();  추상클래스이므로 안된다. 상속목적
//		Showable s = new Showable(); 불완전 class로 역시 생성안됨
		B b = null;         //타입으로 사용 가능
		Showable s = null;  //타입으로 사용 가능
		
		A a1 = new AA();
		B b1 = new BB();  //B를 상속한 BB를 B로 대입하는 것은 문제 없음
		
		Showable s1 = new E(); // 인터페이스를 구현한 E를 인터페이스로 대입하는 것은 문제 없음
		Moveable m1 = new E();
		
		s1.show();
		s1.hide();
		
		m1.left();
		m1.right();
		m1.up();
		m1.down();
		
		
		
	}

}
