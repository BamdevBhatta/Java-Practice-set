package ArrayPracrice;
// WAP reverse an array?
public class ArrayPractice11 {
	public static void main(String[] args) {
		int []arr = {23,45,12,34,34};
		System.out.println("Original Array:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("The reverse array is: ");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
			
		}
	}
}
