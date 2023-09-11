package PracticeSet;

import java.util.Scanner;

//Write a program to find the given number is even or odd.
public class ProgramDemo14 {
public static void main(String[] args) {
	System.out.println("Enter a Numer: ");
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	findOddEven(x);
	
}
 static void findOddEven( int a) {
	if(a%2==0)
		System.out.println("the number "+a+" is Even.");
	else
		System.out.println("Given number is "+a+" is Odd");
}
}
