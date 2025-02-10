package com.tnsif.polymorphism;

import java.awt.Point;

public class point {
	private float x;
	private float y;
	
	public void Point() {
		x=9.0f;
		y=8.07f;
	}
	
	public void Point(float f) {
		this.x=x;
		y=6.5f;
	}
	
	public void Point(float x, float y) {
		this.x=x;
		this.y=y;
	}
	
	public static void main(String[] args) {
		Point p=new Point();
		System.out.println(p);
		Point p1=new Point();
		System.out.println(p1);
		Point p2=new Point();
		System.out.println(p2);
		
	}

}


