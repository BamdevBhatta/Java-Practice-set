package Collection;

import java.util.Scanner;

public class UseNew {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array: ");
		int a = sc.nextInt();
		New []n1 = new New[a];
		for(int i=0;i<n1.length;i++) {
			  n1[i] = new New();
			  System.out.println("Enter id: ");
			  n1[i].setId(sc.nextInt());
			  System.out.println("Enter Name:");
			  n1[i].setName(sc.next());
		}
		sc.close();
		for(New x:n1) {
			System.out.println(x);
		}
	}
}
