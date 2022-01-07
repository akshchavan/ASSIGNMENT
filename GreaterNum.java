//Write a Java program to find the numbers greater than the average of the numbers of a given array

package Assignment_4;

import java.util.Arrays;

public class GreaterNum {

	public static void main(String[] args) {
		int sum = 0;
		int num[]= {1, 4, 17, 7, 25, 3, 100};
		
		System.out.println(Arrays.toString(num));
		
		for(int i=0; i<num.length; i++) {
			sum = sum+num[i];
		}
		
		double avg = sum/num.length;
		
		System.out.println(avg);
		
		System.out.println("The numbers in the said array that are greater than the average are: ");
		
		for(int i=0; i<num.length; i++) {
			if(num[i]>avg) {
				System.out.println(num[i]);
				
			}
		}

	}

}
