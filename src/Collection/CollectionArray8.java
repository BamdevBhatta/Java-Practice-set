package Collection;

import java.util.*;

public class CollectionArray8 {
//Write a Java program to shuffle elements in a array list.
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("6");
		System.out.println("before Suffeling: "+list+"\n");
		Collections.shuffle(list);
		System.out.println("Afer Suffeling: "+list);
	}
}
