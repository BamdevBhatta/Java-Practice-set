package PracticeSet;

import java.util.Scanner;

//Write a program to display largest number from given three values.
public class ProgramDemo16 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three number of your choice:");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		largestNumber(x,y,z);
	}
	 static void largestNumber(int a, int b, int c) {
		if(a>b&&a>c) {
			System.out.println("Gretest number is: "+a);
		} else if(b>a&&b>c) {
			System.out.println("Gretest number is :"+b);
		}else {
			System.out.println("Gretest number is: "+c);
		}
		
	}
}
