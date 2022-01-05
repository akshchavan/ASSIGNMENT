//Write a Java program to find the maximum and minimum value of an array

package Assignment_1;

import java.util.Arrays;

public class MaxAndMinValue {

	public static void main(String[] args) {
		
		int arr[]= {5,8,9,2,6,1,4,3,15};
		
		Arrays.sort(arr);
		
		System.out.println("Min="+arr[0]);
		
		System.out.println("min= "+ arr[arr.length-1]);
	}

}
