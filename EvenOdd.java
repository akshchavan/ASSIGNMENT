package assignment_14_2_2021;
import java.util.*;

public class EvenOdd {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Entered value:");
	int a = sc.nextInt();
	
	if (a%2==0) {
		System.out.println("your value is even");
	}
	else{
		System.out.println("your value is odd ");
	}
	
  }
}
