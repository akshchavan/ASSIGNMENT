package assignment_14_2_2021;

import java.util.*;

//radius = Math.PI *r*r

public class Area {
public static void main (String aregs[]) {
	Scanner sc = new Scanner (System.in);
	System.out.println("entered value of radius:");
	double r = sc.nextDouble();
	
	Double areaOfCircle = Math.PI*r*r;
	
	System.out.println("Area of circle is: "+areaOfCircle);
}
}
