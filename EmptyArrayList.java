//Write a Java program to empty an array list. 

package Assignment_2;

import java.util.ArrayList;

public class EmptyArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> s = new ArrayList<>();
		
		s.add("red");
		s.add("black");
		s.add("white");
		
		System.out.println("ArrayList: "+s);
		
		ArrayList<String> s1 = new ArrayList<>();
		
		s1.removeAll(s);
		
		System.out.println("After remove ArrayList: "+s1);		

	}

}
