package Class_and_Object;

import java.util.Scanner;

/*
 * Write a program to print the area of a rectangle by creating a class named 'Area' taking the values of
 *  its length and breadth as parameters of its constructor and having a method named 'returnArea' which 
 *  returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.
 */
public class Rectangle1 {
	int length;
	int breadth;
Rectangle1(int length,int breadth){
	this.length=length;
	this.breadth = breadth;
}
int returnarea() {
	 int area = length*breadth;
	return area;
}
	
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Eneter values for length and breadth:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		Rectangle1 r1 = new Rectangle1(a,b);
		int x = r1.returnarea();
		System.out.println("Area of rectangle is:"+x);			
	}
}
