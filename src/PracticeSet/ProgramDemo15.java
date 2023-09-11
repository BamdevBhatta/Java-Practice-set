package PracticeSet;

import java.util.Scanner;

//Write a program to calculate leap year
public class ProgramDemo15 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter year of your choice:");
	int x = sc.nextInt();
	leapYear(x);
	
}
 static void leapYear( int a) {
	if(a%4==0)
		System.out.println("Your entered Year "+a+" is  leap year.");
	else
		System.out.println("Your entered Year "+a+" is not leap year");
}
}
