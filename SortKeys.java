//Write a Java program to sort keys in Tree Map by using comparator. 

package Assignment_6;

import java.util.Comparator;
import java.util.TreeMap;

public class SortKeys {

	public static void main(String[] args) {
	    TreeMap<String, String> tm = new TreeMap<String, String>();
	    
	    tm.put("m", "mom");
	    tm.put("d", "dad");
	    tm.put("a", "me");
	    tm.put("b", "babu");
	    
	    System.out.println(tm);
	    
	    class sort_key implements Comparator<String>{
	    	
	    	public int compare(String str1, String str2) {
	    		return str1.compareTo(str2);
	    	}
	    	
	    }

	}

}
