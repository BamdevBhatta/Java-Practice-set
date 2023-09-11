package Exception_Handling;

import java.util.Scanner;

public class PgmWithException {
	public static void main(String[] args) {
		int first = 30;
		int second = 0;
		Scanner sc = new Scanner(System.in);
		try {
			int third = first/second;
			System.out.println("tNumber is:"+third);
			System.out.println("Enter the id");
//			int id = sc.nextInt();
//			System.out.println(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Enter name ");
		String  name =  sc.next();
		System.out.println(name);
		
	}
}
