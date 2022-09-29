package com.nissan.app;

import java.util.Scanner;

import com.nissan.oops.Box;

public class DemoBox {

	public static void main(String[] args) {
		
		// Declaring box variable 
		int width, height, depth;
		
		// reading box variables from user 
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter width (in meter):");
		width = input.nextInt();
		
		System.out.print("Enter height (in meter):");
		height = input.nextInt();
		
		System.out.print("Enter width (in meter):");
		depth = input.nextInt();
		
		
		//Creating new box with given input.
		Box boxOne = new Box(width,height,depth);
		
		//Displaying the volume of the box
		System.out.println("Volume of the box: "+boxOne.calculateVolume());
		input.close();
		
	}

}
