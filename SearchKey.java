//Write a Java program to search a key in a Tree Map. 

package Assignment_6;

import java.util.TreeMap;

public class SearchKey {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		
		tm.put(1, "akshay");
		tm.put(2, "sayali");
		tm.put(3, "rohan");
		
		System.out.println("TreeMap => "+tm);
		
		if(tm.containsKey(1)) {
			System.out.println("key 1 is containing..");
		}
			else {
				System.out.println("Key 1 is not containing..");
			}
		if(tm.containsKey(5)) {
			System.out.println("key 5 is containing..");
		}
			else {
				System.out.println("Key 5 is not containing..");
			}
	}	
}
