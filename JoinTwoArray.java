//Write a Java program to join two array lists.  

package Assignment_2;

import java.util.ArrayList;

public class JoinTwoArray {

	public static void main(String[] args) {
		ArrayList<String> n = new ArrayList<>();
		n.add("akshay");
		n.add("vishal");
		n.add("ashish");
		
		ArrayList<String> s = new ArrayList <>();
		s.add("chavan");
		s.add("ambala");
		s.add("patil");
		
		ArrayList<String> a = new ArrayList<>();
		
		a.addAll(n);
		a.addAll(s);
		
		System.out.println("Join two array list is:"+a );

	}

}
