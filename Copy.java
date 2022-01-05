//Write a Java program to copy an array by iterating the array.

package Assignment_1;

import java.util.Arrays;

public class Copy {

	public static void main(String[] args) {
		
		String arr[]= {"rahul","ramesh","reshma","pratik"};
		
		System.out.println(Arrays.toString(arr));
		
		String arr1[]= new String[4];
		
		for(int i=0; i<arr.length; i++) {
		 arr1[i] =  arr[i];
		}
		
		System.out.println("New Array: "+Arrays.toString(arr1));
	}

}
