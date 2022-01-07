//Write a Java program to sort a given array list.

package Assignment_3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {
		ArrayList <String> a = new ArrayList<>();
		 a.add("akshay");
		 a.add("sayali");
		 a.add("pranali");
		 //before sorting..
         System.out.println(a);
         
         Collections.sort(a);
         //after sorting..
         System.out.println(a);
	}

}
