package assignment_16_2_2021;
import java.util.*;
public class LinklistArray {

	public static void main(String[] args) {
		LinkedList<String>linkedlist = new LinkedList<String>();
		
		linkedlist.add("red");
		linkedlist.add("yellow");
		linkedlist.add("pink");
		linkedlist.add("brown");
		System.out.println(linkedlist);
		linkedlist.add(2,"white");
		System.out.println("LinkedList String is Appened:"+linkedlist);
	for (String m:linkedlist) {
		System.out.println(m);
	}

}
}
