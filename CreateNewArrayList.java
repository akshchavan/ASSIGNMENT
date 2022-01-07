//Write a Java program to create a new array list, add some colors (string) and print out the collection


package Assignment_3;

import java.util.ArrayList;

public class CreateNewArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("mango");
		list.add("appple");
		list.add("banana");
		
		System.out.println(list);

	}

}
