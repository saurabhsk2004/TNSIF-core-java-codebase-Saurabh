package com.daysevenPolymorphism;

public class Point {
	
	private float x;
	private float y;
	
	public Point(float x) {
		x=10.60f;
		
		
	}

	public Point(float x) {
		
		this.x = x;
	}

	public Point(float x, float y) {
		
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	

}
