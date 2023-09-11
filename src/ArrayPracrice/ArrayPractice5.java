package ArrayPracrice;

public class ArrayPractice5 {
public static void main(String[] args) {
	int arr[] = {23,455,34,12,23};
	arrayMethod(arr);
}
 static void arrayMethod(int data[]) {
	 int x = data[0]; 
	 for(int y:data) {
		 if(x>y) {
			 x=y;
		 }
			 
	 }
	 System.out.println("Smallest value is:"+x);
}
}
