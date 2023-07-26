package com.example;

public class TriangleExample3 {
	
	static class Show{   // Show를 new로 할 필요가 있나? 추상으로 해보자
		boolean test(int i, int j) {
			return i==j;
		}
	}
	
	static class Triangle1 extends Show{
		boolean test(int i, int j) {
			return i>=j;
		}
	}
	
	static class Triangle2 extends Show{
		boolean test(int i, int j) {
			return i<=j;
		}
	}
	
	static class Triangle3 extends Show{
		boolean test(int i, int j) {
			return i+j <=4;
		}
	}
	
	static class Triangle4 extends Show{
		boolean test(int i, int j) {
			return i+j >=4;
		}
	}
	
	static class Rectangle extends Show{
		boolean test(int i, int j) {
			return (i==0 || i==4 ||j==0 || j==4);
		}
	}
	
	static class Cross extends Show{
		boolean test(int i, int j) {
			return (i==j || i+j==4);
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
		Show s = new Triangle1();
		drawShape(s);
		System.out.println("2.");
		s = new Triangle2();
		drawShape(s);
		System.out.println("3.");
		s = new Triangle3();
		drawShape(s);
		System.out.println("4.");
		s = new Triangle4();
		drawShape(s);
		System.out.println("5.");
		s = new Rectangle();
		drawShape(s);
		System.out.println("6.");
		s = new Cross();
		drawShape(s);
		
		
	}

}
