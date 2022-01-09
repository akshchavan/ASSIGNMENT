//Write a Java program to get a key-value mapping associated with
//the greatest key and the least key in a map. 

package Assignment_6;

import java.util.TreeMap;

public class GreatestAndLatestKey {

	public static void main(String[] args) {
		TreeMap<Integer, Integer> tm = new TreeMap<Integer, Integer>();
		tm.put(1, 1000);
		tm.put(2, 2000);
		tm.put(3, 3000);
		
		System.out.println(tm);
		
		System.out.println(tm.firstEntry());
		
		System.out.println(tm.lastEntry());
		

	}

}
