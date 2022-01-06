///Write a Java program to clone an array list to another array list

package Assignment_2;

import java.util.ArrayList;

public class CloneArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> c1 = new ArrayList<>();
		
		c1.add("red");
		c1.add("yellow");
		c1.add("white");
		
		System.out.println("original array list: "+ c1);
		
		ArrayList<String> clone = (ArrayList<String>)c1.clone(); 

		System.out.println("clone array list: "+clone);
	}

}
