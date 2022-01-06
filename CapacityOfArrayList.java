//Write a Java program to trim the capacity of an array list the current list size.

package Assignment_2;

import java.util.ArrayList;

public class CapacityOfArrayList {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		a.add("mumbai");
		a.add("delhi");
		a.add("pune");
		
		System.out.println("ArrayList is: "+a);
		
		a.trimToSize();
		
		System.out.println("After trim ArrayList is: "+a);
		

	}

}
