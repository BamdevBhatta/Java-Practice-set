package All;
import java.util.Scanner;

public class ArrayReturnFormMain {
public static void main(String[] args) {
	int[] x = array();
	System.out.println("Your array is: ");
	for(int a:x) {
		System.out.print(a+" ");
		System.out.println();
	}
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number:");
	int c = sc.nextInt();
	System.out.println("Your value of index "+c+" is "+x[c]);
}
 static int[] array() {
	 int[] arr= new int[4] ;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter array: ");
	 for( int i=0;i<arr.length;i++) {
		 arr[i] = sc.nextInt();
	 }
	return arr;
}
}
