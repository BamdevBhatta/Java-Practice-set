package PracticeSet;

import java.util.Scanner;

//Write a program to find sum and average of two numbers input by User (using Scanner class).
public class PracticeProgramTestDemo {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number:");
		int a = sc.nextInt();
		System.out.println("Enter Second Number:");
		int b = sc.nextInt();
		System.out.println("The sum of given Number is: "+(a+b));
		System.out.println("Average of Given Number is: "+(a+b)/2);
	}
}
