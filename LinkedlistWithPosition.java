package assignment_16_2_2021;
import java.util.*;
public class LinkedlistWithPosition {

	public static void main(String[] args) {
		LinkedList<String>list = new LinkedList<String>();
		list.add("akshay");
		list.add("meet");
		list.add("sayali");
		list.add("jayesh");
		list.add("vishal");
		System.out.println(list);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(i+" "+list.get(i));
		}

	}

}
