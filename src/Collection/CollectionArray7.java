package Collection;

import java.util.*;

public class CollectionArray7 {
//Write a Java program to sort a given array list
	public static void main(String[] args) {
		List<String> list  = new ArrayList<>();
		list.add("Bobby");
		list.add("Mahesh");
		list.add("Nabin");
		list.add("Ganesh");
		System.out.println("Array List is: "+list);
		System.out.println("After sorting :");
		Collections.sort(list);
		System.out.println("Array list is:" +list);
		
	}
}
