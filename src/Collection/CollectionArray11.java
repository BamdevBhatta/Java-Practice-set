package Collection;

import java.util.*;

public class CollectionArray11 {
//Write a Java program to compare two array lists.
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Bamdev");
		list.add("Hari");
		list.add("Krishna");
		list.add("Bikash");
		
		List<String> list1 = new ArrayList<>();
		list1.add("Bamdev");
		list1.add("Hari");
		list1.add("Krishna");
		list1.add("Bikash");
		ArrayList<String> c3 = new ArrayList<String>();
        for (String e : list)
           c3.add(list1.contains(e) ? "Yes" : "No");
        System.out.println(c3);
		
	}
}
