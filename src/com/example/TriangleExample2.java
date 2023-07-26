package com.example;

public class TriangleExample2 {
	
	static class Show{
		boolean test(int i, int j) {
			return i==j;
		}
	}
	
	static void drawShape(Show s) {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(s.test(i, j)) 
					System.out.print('*');
				else
					System.out.print(' ');
				}
			System.out.println();
			}
			
		}
	
	
	public static void main(String[] args) {
		
		System.out.println("1.");
		Show s = new Show();
		drawShape(s);
		System.out.println("2.");
		drawShape(s);
		System.out.println("3.");
		drawShape(s);
		System.out.println("4.");
		drawShape(s);
		System.out.println("5.");
		drawShape(s);
		System.out.println("6.");
		drawShape(s);
		
		
	}

}
