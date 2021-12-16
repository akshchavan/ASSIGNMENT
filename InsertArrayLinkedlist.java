package assignment_16_2_2021;

import java.util.LinkedList;

public class InsertArrayLinkedlist {
	public static void main(String[] args) {
		LinkedList<String>linkedlist = new LinkedList<String>();
		
		linkedlist.add("red");
		linkedlist.add("yellow");
		linkedlist.add("pink");
		linkedlist.add("brown");
		System.out.println(linkedlist);
		
		linkedlist.addFirst("black");
		linkedlist.addLast("white");
		
		System.out.println("LinkedList String is Insert:"+linkedlist);
	}
}
