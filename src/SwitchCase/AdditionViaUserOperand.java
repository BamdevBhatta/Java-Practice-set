package SwitchCase;

import java.util.Scanner;

public class AdditionViaUserOperand {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		System.out.println("Enter operator here");
		String c = sc.next();
		if(c.equalsIgnoreCase("+")) 
	     System.out.println("sum is:"+(a+b));
		else
			System.out.println("Subtraciton is:"+(a-b));
//		int d=a+b;
//		int e=a-b;
//		
//		 int d  = (c>=a) ? c : a;
//			
	}
}
