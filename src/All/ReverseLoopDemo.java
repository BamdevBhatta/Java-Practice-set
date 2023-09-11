package All;
import java.util.Scanner;

public class ReverseLoopDemo {
/*
 * wap that prompts the user input an integer then output the number which digits reversed
 * eg input 12345 
 * output:54321
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		int temp=a;
		int remainder=0;
		int reverse = 0;
		while(temp>0) {
			remainder = temp%10;
			reverse = reverse*10 +remainder;
			temp /= 10;
			
		}
		System.out.println("Reverse of number is: "+a+" is: "+reverse);
	}
}
