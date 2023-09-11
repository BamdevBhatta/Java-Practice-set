package All;
import java.util.Scanner;

public class ArrayClass {
public static void main(String[] args) {
	int arr[] = {3,455,23,6,67};
	 int a = array(arr);
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter index is :");
	 int x = sc.nextInt();
	 System.out.println("vlaue in "+x+" is :"+arr[x]);
	 System.out.println();
}
 static int array(int []a1) {
	 System.out.print("YOur array is: ");
	for(int x:a1) {
		System.out.print(x+" ");
	}
	System.out.println();
	return 0;
	
}
}
