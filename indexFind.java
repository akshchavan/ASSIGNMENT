//Write a Java program to find the index of an array element.

package Assignment_1;

public class indexFind {
	 public static int  findIndex (int[] my_arr, int n) {
		for(int i=0; i<my_arr.length; i++) {
			if(n == my_arr[i]) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int my_arr[]= {5,8,2,9,1};
		
		System.out.println("index position of 2 is: "+ findIndex(my_arr, 2));
		
		System.out.println("Index position of 25 is: " + findIndex(my_arr, 25));
		
		

	}

}
