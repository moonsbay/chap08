package com.example;

public class InterfaceFieldExample {
	interface Showable{
		int num1 = 0;
		public static final int num2 = 0; // 인터페이스에서는 public static final은 무조건..안써줘도..마찬가지
		
		void show();
		public abstract void hide();   // 인터페이스에서는 public abstract은 무조건.. 안써줘도..마찬가지 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
