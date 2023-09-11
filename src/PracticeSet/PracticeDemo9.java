package PracticeSet;

import java.util.Scanner;

//Write a program that converts pounds into kg. The program prompts 
//the user to enter number of pounds.converts it to kg and displays the result [1 pound is 0.454 kg].
public class PracticeDemo9 {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter value in pound: ");
	double a = sc.nextDouble();
	poundToKg(a);
}
 static void poundToKg(double pnd) {
	
	double kg = pnd * 0.45;
	System.out.println(" The value of "+pnd+" in kg is= "+kg);
}

}