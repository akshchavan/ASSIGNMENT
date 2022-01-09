//Java Program to Swap Two Numbers

package Assignment_9;

public class SwapTwoNum {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		
		System.out.println(x+" "+y);
		
		swap(x,y);
		

	}

	private static void swap(int x, int y) {
		int temp=x;
		 x=y;
		y =temp;
		
		System.out.println(x+" "+y);
	}

}
