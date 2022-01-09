//Write a Java program to get all keys from the given a Tree Map. 

package Assignment_6;

import java.util.Set;
import java.util.TreeMap;

public class GetAllKey {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		
		tm.put(1, "mumbai");
		tm.put(2, "pune");
		tm.put(3, "delhi");
		
		System.out.println(tm);
		
		Set<Integer> keys = tm.keySet();
		
		System.out.println(keys);
	}

}
