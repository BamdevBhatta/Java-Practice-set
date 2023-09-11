package PracticeSet;

import java.util.Scanner;

/*
 * Write a program to print the number entered by
 *  user only if the number entered is negative
 */
public class PracticeDemo12 {
public static void main(String []args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number of your choice:");
	int a=sc.nextInt();
	if(a<0) 
		System.out.println("Your number is: "+a);
	else
		System.out.println("Please enter negative number:");
}
}
