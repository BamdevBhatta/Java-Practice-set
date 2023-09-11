package Exception_Handling;

import java.util.Scanner;

public class Exception2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		try {
			int a;

			System.out.println("Age is:");
			a = sc.nextInt();
			
			System.out.println("a: " + a);
sc.close();
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		Scanner a1 = new Scanner(System.in);
		System.out.println("Enter value for name");
		name = a1.next();
		System.out.println("name: " + name);
		a1.close();
	}

}
