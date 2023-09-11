package Collection;

import java.util.*;

public class CollectionArray2 {
//Write a Java program to insert an element into the array list at the last and specified position.
	public static void main(String[] args) {
			List<String> list = new ArrayList<>();
			list.add("Hari");
			list.add("Ram");
			list.add("Nabin");
			list.add("Mahesh");
			list.add("Ganesh");
			System.out.println(list);
			System.out.println("After Adding the specied position ie 3");
			list.add(3, "Bobby");
			System.out.println(list);
			System.out.println("list After Adding last position:");
			list.add("bamdev");
			list.add("Bhatta");
			System.out.println("Array list is: "+list);
		
	}
}
