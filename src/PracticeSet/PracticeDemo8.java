package PracticeSet;

import java.util.Scanner;
//T(°C) × 9/5 + 32
//Write a program to convert Fahrenheit to Celsius and Celsius to Fahrenheit
public class PracticeDemo8 {
	public static void main(String []args) {
		Scanner sc = new Scanner (System.in);
		 System.out.println("Enter value in Fahrenheit : ");
		 double f = sc.nextDouble();
		 System.out.println("Enter value in Celsius: ");
		 double c = sc.nextDouble();
		 double Celsius =(f-32)*5/9;
		 System.out.println("The Celsius  conversion of  given Fahrenheit "+f+" is: "+Celsius);
		 double fahrenheit = c*9/5+32;
		 System.out.println("The Fahrenhiet conversion of given Celsius "+c+" is: "+fahrenheit);

	}
}
