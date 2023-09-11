package All;
import java.util.Scanner;

public class LoopsTestDemo {
public static void main(String[] args) {
	//WAP  to accept an integer from the user and print its factorial. 
	//Make sure that your program should print 1 if 0 is entered ?
     Scanner sc  = new Scanner(System.in);
      int fact=1;
      System.out.println("Enter a number");
      int a = sc.nextInt();
      while(a>=1) {
    	  fact = fact*a;
    	  a--;
    	  
      }
      System.out.println("Factorail is:"+fact);
     
}
}
