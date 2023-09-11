package ArrayPracrice;

import java.util.Scanner;

public class ArrayPractice6 {
public static void main(String[] args) {
	int arr[] = new int[5];
	Scanner sc = new Scanner(System.in);
	System.out.println("enter values: ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println("vlaues are: "+arr[i]);
		}
}
}
