package PracticeSet;
//W.r.a.p sort an array and search an element inside it?
public class PracticeSet23 {
public static void main(String[] args) {
	int [] arr= {34,65,54,44,8,67} ;
	for( int i=0;i<5;i++) {
		if(arr[i]<arr[i+1]) {
				arr[i]=arr[i+1];
				
		}
		System.out.println("Greatest array number is: "+arr[i]);
	}
	  
}
}
