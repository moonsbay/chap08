package com.example;

public class InterfaceMemberExample {
	interface Moveable{
		int BlACK = 0; //public static final
		void move();   // public abstract 
		
		default void xxx() {
			System.out.println("Moveable.xxx()");
		}
/*		void yyy() {  default없이 이런 매소드는 올 수 없다
			
		}*/
		
		static void zzz() {
			System.out.println("Moveable.zzz()");
		}
		
		
	}
	
	static class A implements Moveable{
		@Override
		public void move() {
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println(Moveable.BlACK);
		A a = new A();
		a.xxx();
		Moveable.zzz();
	}

}
