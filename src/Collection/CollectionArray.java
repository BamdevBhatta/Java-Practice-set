package Collection;

import java.util.*;

public class CollectionArray {
//Write a Java program to copy one array list into another.
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Bamdev");
		list.add("Hari");
		list.add("Krishna");
		list.add("bhojraj");
		System.out.println("First list: "+list+"\n");
		
		
		List<String> list1 = new ArrayList<>();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		list1.add("4");
		System.out.println("Second List is: "+list1+"\n");
		
		//copying values from list1 to list.
		Collections.copy(list, list1);
		System.out.println("After Copy:"+list);
		System.out.println("After copy Second:"+list1);
		
	}
}
