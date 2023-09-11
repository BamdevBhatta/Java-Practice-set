package Collection;

import java.util.*;

public class CollectionArray5 {
//Write a Java program to remove the third element from a array list.
	public static void main(String[] args) {
       List<String> list = new ArrayList<>();
       list.add("bamdev");
       list.add("Hari");
       list.add("Nabin");
       list.add("Mahesh");
       list.add("Ganesh");
       list.add("Kirt");
       System.out.println(list);
      // System.out.println("After Removing third element from arry list:");
       System.out.println("removed Array List is:"+list.remove(3));
       System.out.println("New Array List is:"+list);
       
	}
}
