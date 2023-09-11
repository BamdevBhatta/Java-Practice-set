package Collection;

import java.util.*;

public class CollectionPractice1 {
//Write a Java program to insert an element into the array list at the first position.
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Ram");
		list.add("hari");
		list.add("Krishna");
		list.add("bikash");
		System.out.println(list);
		list.add(0,"Mahesh");
		System.out.println(list);

	}
}
