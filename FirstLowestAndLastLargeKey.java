//Write a Java program to get the first (lowest) key 
//and the last (highest) key currently in a map. 

package Assignment_6;

import java.util.TreeMap;

public class FirstLowestAndLastLargeKey {

	public static void main(String[] args) {
		TreeMap<Integer,Integer> tm = new TreeMap<Integer, Integer>();
		tm.put(1, 420);
		tm.put(2, 520);
		tm.put(3, 720);
		
		System.out.println(tm);
		
		System.out.println(tm.firstKey());
		
		System.out.println(tm.lastKey());

	}

}
