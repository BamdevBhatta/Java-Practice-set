package TrenaryOperator;

import java.util.Scanner;

public class TraneryOptrTest {
public static void main(String[] args) {
	//WAP to accept an integer via command line argument and print its absolute 
	  //value. (If user enters -1 then result should be 1)
	Scanner sc = new Scanner(System.in);
	//int a = Integer.parseInt(args[0]);
	System.out.println("Enter a Number:");
	int a = sc.nextInt();
	 System.out.println("The absolute vlaue of your number is:"+((a>=0) ? a : -a));
}
}
