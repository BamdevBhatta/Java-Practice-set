package PracticeSet;

import java.util.Scanner;

//Write a program to print the factorial number of given number.
public class PracticeDemo22 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter a number you want to  calculte factorial:");
	int a = sc.nextInt();
	factorial(a);
}
 static void factorial( int x) {
	 int fact =1;
	for(int i=x;i>=1;i--) {
		fact = fact*i;
	}
	System.out.println("Factorial of "+x+" is: "+fact);
}
}
