package com.nissan.oops;

/*
 * Create a Box class with three instance variables as width, height, depth. Create a method
	inside this class which returns the volume. Create two different objects in other class assign
	values for instance variable and calculate the volume and print it.
 * */

public class Box {
	
	private int width;
	private int height;
	private int depth;
	
	public Box(int width,int height,int depth) {
		
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	public int calculateVolume() {
		
		return this.width * this.height * this.depth;
	}

}
