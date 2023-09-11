package Collection;

import java.util.*;

public class CollectionArray10 {
//Write a Java program to extract a portion of a array list.
	public static void main(String[] args) {
			List<String> list = new ArrayList<>();
			list.add("RBB");
			list.add("NIC ASIA");
			list.add("Kumari");
			list.add("Kanchan");
			System.out.println("Actual ArrayList is: "+list+"\n");
			System.out.println("After Extract the Array List:");
			List<String > list1 = list.subList(0, 2);
		//System.out.println(list.subList(0, 2));
			System.out.println("Extract List is: "+list1);
	}
}
