package Collection;

import java.util.*;

public class CollectionArray6 {
//Write a Java program to search an element in a array list.
	public static void main(String[] args) {
		List<Integer> in = new ArrayList<>();
		in.add(5);
		in.add(3);
		in.add(3);
		in.add(34);
		in.add(123);
		in.add(2312);
		System.out.println("Array list is: "+in);
//		System.out.println(in.remove(3));
//		System.out.println("After Removing: "+in);
		//System.out.println("finding value is: "+in.get(3));
		System.out.println("getting element of index 2: "+in.get(2));
	}
}
