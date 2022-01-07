//Write a Java program to convert minutes into a number of years and days

package Assignment_4;

import java.util.Scanner;

public class MinIntoYearAndDay {

	public static void main(String[] args) {
		double mininyear = 60*24*365;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("entered min:");
		
		double min = sc.nextDouble();
		
		long year = (long)(min/mininyear);
		
		int day = (int)(min/60/24)%365;
		
		System.out.println(year+" year "+" and "+day+" day");
		
	}

}
