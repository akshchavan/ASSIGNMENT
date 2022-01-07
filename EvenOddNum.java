//Write a program to print even or odd numbers in a range between 1:20 using recursion.

package Assignment_3;

public class EvenOddNum {

	public static void main(String[] args) {
		
		int[] arr = new int[20];
		
		for(int i=1; i<=arr.length; i++) {
			System.out.println(i);
			if(i%2 ==0) {
				System.out.println("even number");
			}
			else {
				System.out.println("odd number");
			}
		}
		
		

	}

}
