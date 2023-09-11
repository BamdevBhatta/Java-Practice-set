package PracticeSet;
import java.util.Scanner;
/*
 * Write a program to create the equivalent of a four-function calculator. 
 * The program to enter two integer’s numbers and an operator. It then carries out the specified 
 * arithmetic operator operation: addition, subtraction, multiplication or division of the
 *  two numbers. Finally, it displays the result.
 */
public class PracticeDemo18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first value: ");
		int first = sc.nextInt();
		System.out.println("Enter Second value: ");
		int second = sc.nextInt();
		System.out.println("Enter operator here for performing arithmetic operation: ");
		String opr =sc.next();
		sc.close();
		switch(opr) {
			case "+" :
				System.out.println("Additon of two number is:"+(first+second));
				break;
			case "-" : 
				System.out.println("Subtraction of two number is: "+(first-second));
				break;
			case "*":
				System.out.println("Multiplication of two number is: "+(first*second));
				break;
			case "/":
				System.out.println("Division of two number is: "+(first/second));
				break;
				default:
					System.out.println("Plese enter valid operator");
				
		
		}
		
		
	}
	}
