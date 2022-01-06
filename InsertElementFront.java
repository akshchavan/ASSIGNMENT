//Write a Java program to insert the specified element at the front of a linked list.  

package Assignment_2;

import java.util.LinkedList;

public class InsertElementFront {

	public static void main(String[] args) {
		
		LinkedList<String> a = new LinkedList<>();
		
		a.add("thane");
		a.add("sion");
		a.add("diva");
		
		System.out.println("LinkedList is: "+a);
		
		a.offerFirst("dadar");
		
		System.out.println("LinkedList is: "+a);

	}

}
