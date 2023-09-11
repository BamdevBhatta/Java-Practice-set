package Collection;

import java.util.*;

public class CollectionArray9 {
//Write a Java program to reverse elements in a array list.
	public static void main(String[] args) {
			List<String> list = new ArrayList<>();
			list.add("Audi");
			list.add("Ducati");
			list.add("BMW");
			list.add("roles Royal");
			System.out.println("Actual ArrayList is: "+list);
			Collections.reverse(list);
			System.out.println("After Reverse new Array list is: "+list);
	}
}
