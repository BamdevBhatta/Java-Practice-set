package ConstructorDemo;

import java.util.Scanner;

public class ParamConstructor {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter accid, name and balance");
		int a = kb.nextInt();
		String b = kb.next();
		double c = kb.nextDouble();
		Constructor1 c1 = new Constructor1(a,b,c);
		c1.display();
	}
}

class Constructor1 {
	private int accid;
	private String name;
	private double bal;

	public Constructor1(int accid, String name, double bal) {
		this.accid = accid;
		this.name = name;
		this.bal = bal;

	}

	public void display() {
		System.out.println();
		System.out.println("Id: " + accid );
		System.out.println("Name of Employee: "+name);
		System.out.println("Salary of Employee is: "+bal);
	}
}
