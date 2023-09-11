package ArrayPracrice;

import java.util.Arrays;
import java.util.Scanner;

//W.r.a.p sort an array and search an element inside it?
public class ArrayPractice13 {
	public static void main(String[]args) {
	int arr[] = {23,45,776,232,1,2,4};
	//System.out.println(arr.length);
	Arrays.sort(arr);
	System.out.println("Your array is:"+Arrays.toString(arr));
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter index of array");
	int ind = sc.nextInt();
	System.out.println("Your value is: "+arr[ind]);
	
	}
}
