//Write a Java program to insert the specified element at the specified position in the linked list.

package Assignment_2;

import java.util.LinkedList;

public class InsertElementSpecific {

	public static void main(String[] args) {
		LinkedList <String> l_list = new LinkedList <String> ();
		
		l_list.add("Red");
		l_list.add("Green");
		l_list.add("Black");
		l_list.add("White");
		l_list.add("Pink");
		
		System.out.println("Original linked list: ");
		
		System.out.println("Let add the Yellow color after the Red Color: " + l_list);
		
		l_list.add(1, "Yellow");
		
		System.out.println("The linked list:" + l_list);
		
		

	}

}
