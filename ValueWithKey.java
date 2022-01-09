//Write a Java program to associate the specified value with the specified key in a Tree Map. 

package Assignment_6;

import java.util.Map;
import java.util.TreeMap;

public class ValueWithKey {

	public static void main(String[] args) {
		TreeMap<Integer,String> tm = new TreeMap<Integer, String>();
		
		tm.put(1,"red");
		tm.put(2, "yellow");
		tm.put(3, "black");
		for(Map.Entry<Integer, String> entry: tm.entrySet()) {
			System.out.println(entry.getKey() + "=>" + entry.getValue());
		}

	}

}
