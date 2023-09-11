package PracticeSet;

import java.util.Scanner;

//	Write a program to print the table of given number.
public class PracticeDemo20 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number of your choice");
	int x = sc.nextInt();
	table(x);
}
 static void table(int no) {
	 System.out.println("Table of "+no+" is: ");
	 for(int i=1;i<=10;i++) {
		 System.out.println(no+" *  "+i+" = "+(i*no));
	 }
	
}
}
