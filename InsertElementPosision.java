///Write a Java program to insert some elements at the specified position into a linked list.

package Assignment_2;

import java.util.LinkedList;

public class InsertElementPosision {

	public static void main(String[] args) {
		LinkedList<Integer> num = new LinkedList<>();
		
		num.add(5);
		num.add(10);
		num.add(15);
		num.add(20);
		
		System.out.println("LinkedList:"+num);
		
		LinkedList<Integer> num1 = new LinkedList<>();
		
		num1.add(50);
		num1.add(100);
		
		System.out.println("LinkedList:"+num1);
		
		num.addAll(1, num1);
		
		System.out.println("LinkedList:"+num);

	}

}
