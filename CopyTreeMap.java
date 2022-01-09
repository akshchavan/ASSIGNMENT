//Write a Java program to copy a Tree Map content to another Tree Map. 

package Assignment_6;

import java.util.TreeMap;

public class CopyTreeMap {

	public static void main(String[] args) {
		TreeMap<Integer,String> tm = new TreeMap<Integer, String>();
		
		tm.put(1, "akshay");
		tm.put(2,"raj");
		tm.put(3, "sayali");
		
		System.out.println(tm);
		
		TreeMap<Integer, String> tm1 = new TreeMap<Integer, String>();
		
		tm1.put(4, "rohan");
		tm1.put(5, "sangeet");
		
		tm.putAll(tm1);
		
		System.out.println(tm1);
		
		System.out.println(tm);


	}

}
