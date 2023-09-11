package PracticeSet;

import java.util.Scanner;

//Write a program to calculate Simple Interest input by user. Simple Interest = P*T*R/100
public class PracticeProgram4 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principle: ");
		double p = sc.nextDouble();
		System.out.println("Enter time: ");
		double t = sc.nextDouble();
		System.out.println("Enter  Interest rate for principle :");
		double r = sc.nextDouble();
		System.out.println("Total Interest of "+p+" is: "+(p*t*r)/100);
		
	}
}
