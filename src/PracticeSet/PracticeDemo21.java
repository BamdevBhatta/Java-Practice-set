package PracticeSet;

import java.util.Scanner;

//	Write a Program to sum 1 to nth natural numbers.
public class PracticeDemo21 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a natural number:");
	int x = sc.nextInt();
	int y = sumOfnNumber(x);
	System.out.println("Total sum of your entered natural number "+x+" is: "
			+ ""+y);
}
 static int sumOfnNumber( int n) {
	int sum =0;
	for(int i=1;i<n;i++) {
		sum = sum+i;
	}
	return sum;
}
}
