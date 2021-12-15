package assignment_14_2_2021;
import java.util.*;

public class SumOfDigit {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		
	System.out.println("Entered number..");
	int sum = sc.nextInt();
	
	int num = sum%10;
	
	System.out.println(num);
	
	int remainder = sum/10;
	
	System.out.println(remainder);
	
	int add = num + remainder;
	
	System.out.println(add);
	}

}
