package ArrayPracrice;

import java.util.Arrays;

// 		WAP sort an array and insert an element inside it?
public class ArrayPractice9 {
	public static void main(String[] args) {
		int [] arr = {34,56,2,4,55,9,23};
		int given_number = 1;
		//creating new array with increasing size
		int new_array[] = new int[arr.length +1];
		//storing values in array
		for(int i=0;i<arr.length;i++) {
			new_array[i] = arr[i];
		}
			//adding element in array
			new_array[new_array.length-1] = given_number;
			//sorting array
			Arrays.sort(new_array);
		for(int  i=0;i<new_array.length;i++) {
			System.out.print(new_array[i]+" ");
		}
	}
}
