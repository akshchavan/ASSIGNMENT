package assignment_16_2_2021;

import java.util.*;

public class RemoveArrayElement {
public static void main(String args[]) {
	ArrayList<Integer> a1 = new ArrayList<Integer>();
	a1.add(20);
	a1.add(35);
	a1.add(83);
	a1.add(16);
	
	System.out.println("Array list of Number:"+a1);
	
	a1.remove(1);
	System.out.println("Array list of Number:"+a1);
}
}
