package ArrayPracrice;

//W.r.a.p search the minimum and the maximum element in an array
public class ArrayPractice12 {
public static void main(String[] args) {
	int []arr = {23,34,56,76,12,67};
	    int min=arr[0];
	    int max =arr[0];
		for(int i =0;i<arr.length;i++) {
			if(min>arr[i]) {
				min =arr[i];
			}		
					}
		System.out.println("minimum value in array is:"+min);
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}	
		}
System.out.println("Maximum value is: "+max);
	}
}
