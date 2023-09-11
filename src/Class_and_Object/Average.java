package Class_and_Object;

import java.util.Scanner;

/*
 * Print the average of three numbers entered by user by creating a class named 'Average' having a method
 *  to calculate and print the average.
 */
public class Average {
	
	void avg(int a, int b, int c) {
		float average = (a + b + c) / 3;
		System.out.println("Average of given number is: " + average);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three number:");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		sc.close();
		Average a1 = new Average();
		a1.avg(x, y, z);

	}
}
