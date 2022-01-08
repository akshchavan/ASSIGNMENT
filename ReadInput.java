//. Write Java program to read input from java console

package Assignment_5;

import java.util.Scanner;

public class ReadInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Entered your name: ");
		String name = sc.nextLine();
		System.out.println("your name is: "+name);

	}

}
