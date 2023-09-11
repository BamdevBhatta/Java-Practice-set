package PracticeSet;

import java.util.Scanner;

//Write a Program to accept three sides of triangle and display which kind of triangle is formed.
public class PracticeDemo17 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three value for triangle");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		sc.close();
		triangleFormat(x, y, z);
	}
	 static void triangleFormat(int a, int b, int c) {
		if(a<b+c && b<a+c && c<+a+b ) {
			if(a==b && b==c) {
				System.out.println("Equilateral triangle");
			}else if(a==b || b==c||c==a){
				System.out.println("Isosceles triangle");
		}else {
			System.out.println("Scalene triangle");
		}
	}else {
		System.out.println("can't form triangle:");
	}
	}	
}
