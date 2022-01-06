//. Write a Java program to insert the specified element at the end of a linked list. 

package Assignment_2;

import java.util.LinkedList;

public class EnsertElementEnd {

	public static void main(String[] args) {
		
		LinkedList<String> a = new LinkedList<>();
		
		a.add("akshay");
		a.add("kunal");
		a.add("pranav");
		
		System.out.println("original linkedList : "+a);
		
		a.offerLast("Amu");
		
		System.out.println("after offerlast linkedList : "+a);

	}

}
