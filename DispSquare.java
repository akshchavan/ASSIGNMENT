//. Write a Java program that reads a number and display the square, cube, and fourth power

package Assignment_4;

import java.util.Scanner;

public class DispSquare {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value:");
		int val =sc.nextInt();
		
		System.out.println("squre: "+val*val);
		System.out.println("cube: "+val*val*val);
		System.out.println("fourth power: "+ Math.pow(val,4));
	}

}
