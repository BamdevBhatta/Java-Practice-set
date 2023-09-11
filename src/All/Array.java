package All;
import java.util.Scanner;
public class Array {
public static void main(String[] args) {
	int x[] =array1();
	System.out.println("Your array is: ");
	for(int a:x) {
		System.out.println(a);
	}
}
 static int[] array1() {
	int[] arr = new int[3];
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter array");
	for(int i=0;i<arr.length;i++) {
		arr[i] = sc.nextInt();
	}
	return arr;
}
}
