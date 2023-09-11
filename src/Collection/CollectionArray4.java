package Collection;

import java.util.*;

public class CollectionArray4 {
//Write a Java program to update specific array element by given element
	public static void main(String[] args) {

			List<String> list = new ArrayList<>();
			list.add("Bobby");
			list.add("Ganesh");
			list.add("Mahesh");
			list.add("Nabin");
			System.out.println(list);
			System.out.println("After Updating the array list the new array list is:");
			list.add(3, "Shrawan");
			System.out.println("New List is: "+list);
	}
}
