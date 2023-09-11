package ArrayPracrice;

public class ArrayPractice8 {
public static void main(String[] args) {
	int arr[] = {23,34,12,6,667};
	 int a = array(arr);
	 System.out.println("Smallest value is:"+a);
   
}
 static int array(int data[]) {
	int y = data[0];
	for(int x:data) {
		if(y>x) {
			y = x;
			
		}

	}
	return y;
	
	
}
}
