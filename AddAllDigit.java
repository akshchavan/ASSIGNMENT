//Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer. 

package Assignment_4;

import java.util.Scanner;

public class AddAllDigit {

	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Enter your number: ");
	   
	   int num = sc.nextInt();
	   
	   int firstdigit = num % 10;
	   int remainingnum = num / 10;
	   
	   int secounddigit = remainingnum % 10;
	   remainingnum = remainingnum /10;
	   
	   int thirddigit = remainingnum % 10;
	   remainingnum = remainingnum /10;
	   
	   int fourthdigit = remainingnum % 10;
	   remainingnum = remainingnum /10;
	   
	   int sum = firstdigit + secounddigit +thirddigit + fourthdigit;
	   
	   System.out.println(sum);

	}

}
