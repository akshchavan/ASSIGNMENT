//. Write a Java program to get a reverse order view of the keys contained in a given map. 

package Assignment_6;

import java.util.TreeMap;

public class ReverseOrderKey {

	public static void main(String[] args) {
		TreeMap<Integer, Integer> tm = new TreeMap<Integer, Integer>();
		tm.put(10, 5000);
		tm.put(20, 5000);
		tm.put(30, 10000);
		
		System.out.println(tm);
		
		System.out.println(tm.descendingKeySet());

	}

}
