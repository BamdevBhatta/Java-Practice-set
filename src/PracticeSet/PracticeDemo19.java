package PracticeSet;
import java.util.Scanner;
/*
 * Program to input the number of (1...7) and translate to its equivalent name of 
 * the day of the week
 */
public class PracticeDemo19 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number of day you want to findout the number of day:");
		int day_no = sc.nextInt();
		switch(day_no) {
		case 1:
			System.out.println("Your entered number "+day_no+" is Sunday:");
			break;
		case 2:
			System.out.println("Your entered number "+day_no+" is Monday:");
			break;
		case 3:
			System.out.println("Your entered number "+day_no+" is Tuesday:");
			break;
		case 4:
			System.out.println("Your entered number "+day_no+" is Wednesday:");
			break;
		case 5:
			System.out.println("Your entered number "+day_no+" is Thusday:");
			break;
		case 6:
			System.out.println("Your entered number "+day_no+" is Friday:");
			break;
		case 7:
			System.out.println("Your entered number "+day_no+" is Saturday:");
			break;
			default:
				System.out.println("Please enter number between 1 to 7");
		}
}
}
