//Write a Java program to remove a specific element from an array.

package Assignment_1;

import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) {
		
    int[] arr = {10,20,30,40,50,60,70,80,90};
    
    System.out.println(Arrays.toString(arr));    
    int remove = 1;
    
    for(int i =remove; i<arr.length-1; i++) {
    	
    	arr[i]=arr[i+1];
    }
    
    System.out.println("after removing index 1 number is: "+Arrays.toString(arr));
	}

}
