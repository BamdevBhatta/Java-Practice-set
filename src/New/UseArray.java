package New;

import java.util.Scanner;

public class UseArray {
	public static void main(String[] args) {
		Arrray[] a = new Arrray[4];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter the data for " + (i + 1) + " Student");
			System.out.println("Enter id");
			int id = sc.nextInt();
			a[i] = new Arrray();
			a[i].setId(id);
			System.out.println("enter name ");
			String name = sc.next();
			a[i].setName(name);
			System.out.println("enter clz name");
			String clz = sc.next();
			a[i].setClz(clz);
			sc.close();

		}
		UseArray obj = new UseArray();
		obj.print(a);

	}

	void print(Arrray[] r) {
		for (int i = 0; i < r.length; i++) {
			System.out.println("Id: " + r[i].getId() + " Name: " + r[i].getName() + " Clz: " + r[i].getClz());
		}
	}
}
