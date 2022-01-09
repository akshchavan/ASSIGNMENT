//Write a Java program to search a value in a Tree Map. 

package Assignment_6;

import java.util.TreeMap;

public class SearchValue {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<>();
		
		tm.put(1, "red");
		tm.put(2, "black");
		tm.put(3, "pink");
		
		System.out.println(tm);
		
		if(tm.containsValue("red")) {
			System.out.println("value red is containing..");
		}
		else {
			System.out.println("value red is Not containing..");
		}
		if(tm.containsValue("purple")) {
			System.out.println("value red is containing..");
		}
		else {
			System.out.println("value purple is Not containing..");
		}
		
	}

}
