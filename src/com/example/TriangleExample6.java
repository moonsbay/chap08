package com.example;

import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.font.ShapeGraphicAttribute;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class TriangleExample6 {
	
	interface Shape{   // Shape를 new로 할 필요가 있나? 추상으로 해보자
		                           // 상속으로 해결했으나.. 상속의 의미가 없다 뭘 받은게 없다
		                           // 인터페이스로 해보자
		public abstract boolean test(int i, int j); //인터페이스는 무조건 퍼블릭 추상이다
	}
	
	
	
	
	static void drawShape(Shape s) {
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
		drawShape(new Shape() {
			
			@Override
			public boolean test(int i, int j) {
				// TODO Auto-generated method stub
				return i >= j;
			}
		});
		System.out.println("2.");
        drawShape(new Shape() {
			
			@Override
			public boolean test(int i, int j) {
				// TODO Auto-generated method stub
				return i <= j;
			}
		});
		System.out.println("3.");
        drawShape(new Shape() {
			
			@Override
			public boolean test(int i, int j) {
				// TODO Auto-generated method stub
//				return i==0 || i==4 || j==0 || j==4;
				return i+j <= 4;
			}
		});
		System.out.println("4.");
        drawShape(new Shape() {
			
			@Override
			public boolean test(int i, int j) {
				// TODO Auto-generated method stub
				return i+j >= 4;
			}
		});
		System.out.println("5.");
        drawShape(new Shape() {
			
			@Override
			public boolean test(int i, int j) {
				// TODO Auto-generated method stub
				return i==0 || i==4 || j==0 || j==4;
			}
		});
		System.out.println("6.");
        drawShape(new Shape() {
			
			@Override
			public boolean test(int i, int j) {
				// TODO Auto-generated method stub
				return i==j || i+j==4;
			}
		});
		
//		if(s instanceof Triangle1) {
//			Triangle1 t = (Triangle1)s;
		}
	}


