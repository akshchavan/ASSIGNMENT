//Write a Java program to insert elements into the linked list at the first and last position.  

package Assignment_2;

import java.util.LinkedList;

public class InsertElement {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>();
		list.add("rose");
		list.add("lotuse");
		list.add("lily");
		
		System.out.println("LinkedList is: "+list);
		
		//Add element at first and last index..
		list.addFirst("orchids");
		list.addLast("jasmine");
		
		System.out.println("LinkedList is: "+list);

	}

}
