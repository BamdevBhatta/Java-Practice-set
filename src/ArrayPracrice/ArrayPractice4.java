package ArrayPracrice;

import java.util.Scanner;

public class ArrayPractice4 {
public static void main(String[] args) {
	int []arr = new int[4];
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter all element of array: ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("YOur array is: ");
		for(int x:arr) {
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println("Enter index of array you want to show the value:");
		int a = sc.nextInt();
		System.out.println("value of array in index"+a+" is "+arr[a]);
	
}
}
