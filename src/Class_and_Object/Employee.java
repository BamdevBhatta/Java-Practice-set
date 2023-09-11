package Class_and_Object;

import java.util.Scanner;

/*
 * Write a program that would print the information (name, year of joining, salary, address) of three 
 * employees by creating a class named 'Employee'. The output should be as follows:
Name        Year of joining        Address
Robert            1994                64C- WallsStreat
Sam               2000                68D- WallsStreat
John              1999                26B- WallsStreat
 */
public class Employee {
	String name;
	String address;
	int year;

	Employee(String name, int year, String address)

	{
		this.name = name;
		this.year = year;
		this.address = address;
		System.out.println(" Name          Year of Joining          Address");
	for(int i=1;i<=3;i++) {
		System.out.println(name+"          "+year+"                 "+address);
	}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 3; i++) {
			System.out.println("enter name of student:");
			String name = sc.next();
			System.out.println("Enter Year of joining:");
			int year = sc.nextInt();
			System.out.println("Enter Address of Employee:");
			String address = sc.next();
		}
		Employee e1 = new Employee(name, year, address);

		sc.close();
	}
}
