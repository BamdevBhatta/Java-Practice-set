package Class_and_Object;

import java.util.Scanner;

/*
 * Write a program to print the area of a rectangle by creating a class named 'Area' having two 
 * methods. First method named as 'setDim' takes length and breadth of rectangle as parameters and 
 * the second method named as 'getArea' returns the area of the rectangle. Length and breadth of 
 * rectangle are entered through keyboard.
 */
public class Area {
int length;
int breadth;
	void setDim(int length, int breadth) {
	this.length = length;
	this.breadth = breadth;
}
	int getArea() {
		int Area = length*breadth;
		return Area;
	}
	public static void main(String[] arg) {
		Area a = new Area();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length ");
		int c = sc.nextInt();
		System.out.println("enter the breadth");
		int b = sc.nextInt();
		sc.close();
		a.setDim(c, b);
		int Area = a.getArea();
		System.out.println("Area is = "+Area);
	}
}
