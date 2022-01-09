//Write a Java program to delete all elements from a given Tree Map. 

package Assignment_6;

import java.util.TreeMap;

public class DeleteAllElement {

	public static void main(String[] args) {
		TreeMap<Integer, Integer> tm = new TreeMap<Integer, Integer>();
		
		tm.put(1, 100);
		tm.put(2, 500);
		tm.put(3, 1000);
		 System.out.println(tm);
		 
		 tm.clear();
		 
		 System.out.println(tm);
		 

	}

}
