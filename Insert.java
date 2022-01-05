//Write a Java program to insert an element (specific position) into an array.  

package Assignment_1;

import java.util.Arrays;

public class Insert {

	public static void main(String[] args) {
		String arr[]= {"rahul","ramesh","reshma","pratik"};
		
		System.out.println(Arrays.toString(arr));
		
		int indexPosition=2;
		String value="akshay";
		
		for(int i=arr.length-1; i>indexPosition; i--) {
			arr[i] = arr[i-1];
		}
		 arr[indexPosition]=value;
		 
		 System.out.println(Arrays.toString(arr));
	}

}
