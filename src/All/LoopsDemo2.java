package All;
import java.util.Scanner;

public class LoopsDemo2 {
/*
 * two numbers are entered through the keyboard wap to find the value of one number raised to the power
 * of another (do not use java in-built method)
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number:");
		int a = sc.nextInt();
		System.out.println("Enter second number:");
		int b =sc.nextInt();
		int sum =1;
		for(int i=1; i<=b;i++) {	
			sum =sum*a;
		}
		System.out.println("Answer is: "+sum);
	}
}
