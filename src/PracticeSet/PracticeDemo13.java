package PracticeSet;

import java.util.Scanner;

//Write a program to relate two integers entered by user using = =or > or < sign
public class PracticeDemo13 {
public static void main(String []args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter values for a and b:");
	int a = sc.nextInt();
	int b = sc.nextInt();
	compareTwoNumber(a,b);
	
}
 static void compareTwoNumber( int a, int b) {
	if(a>b) {
		System.out.println(+a+" is greater than "+b);
	}
	else if(a<b) {
		System.out.println(a+" is less than "+b);
	}else {
		System.out.println(a+" is equal to "+b);
	}
}
}
