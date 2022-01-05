//1. Write a Java program to sort a numeric array and a string array 

package Assignment_1;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		//number aaray..
		int [] num = {5,9,2,8,3,10};
		//string array..
		String [] name = {"yogesh","raj","rohan","swati","swheta","mayur","akshay"};
		
		//Sorting num..
	    Arrays.sort(num);
		 
		 System.out.println("Sorting num array: "+ Arrays.toString(num));
		 
		 //sorting name..
		 Arrays.sort(name);
		 
		 System.out.println("Sorting num array: "+ Arrays.toString(name));
		

	}

}
