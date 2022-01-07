//. Write a Java program that reads a number in inches, converts it to meters. 

package Assignment_4;

import java.util.Scanner;

public class ReadNum {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter value of inches:");
		 double inches = sc.nextDouble();
		 
		 System.out.println("inches "+inches);
		 
		 double meter = inches * 0.0254;
		 
		 System.out.println("meter "+meter);

	}

}
