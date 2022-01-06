//Write a Java program to test an array list is empty or not.   

package Assignment_2;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		
		//create empty array list...
		ArrayList a1 = new ArrayList();
		
		//test array list empty or not..
		if(a1.isEmpty()) {
			System.out.println("ArrayList is Empty..");
		}
		else {
			System.out.println("ArrayList is Not Empty..");
		}

	}

}
