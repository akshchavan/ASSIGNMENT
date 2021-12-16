package assignment_15_2_2021;

import java.util.*;

//we have to checked str1 & str2 are equal or not..

public class ChechString {
public static void main(String args[]) {
	
	Scanner sc = new Scanner (System.in);
	
	System.out.println("entered 1st string:");
	String s1 = sc.nextLine();
	
	System.out.println("entered 2nd string:");
	String s2 = sc.nextLine();
	
	if(s1.equals(s2)) {
		System.out.println("Both the strings are equal.");
	}
	else {
		System.out.println("Both the strings are not equal.");
	}
}
}
