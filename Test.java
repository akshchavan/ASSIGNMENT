//. Write a Java program to test if an array contains a specific value.

package Assignment_1;

public class Test {
		  public static boolean test(int[] arr, int num) {
		      for (int n : arr) {
		         if (num == n) {
		            return true;
		         }
		      }
		      return false;
		   }
		   public static void main(String[] args) {
			   
		          int[] RollNum = {5,8,2,7,1,6,10};
		          
		      System.out.println(test(RollNum, 2));
		      
		      System.out.println(test(RollNum, 15));
	 }
}


