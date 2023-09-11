package ArrayPracrice;

import java.util.Scanner;

public class ArrayPractice7 {
public static void main(String[] args) {
	int []marks = new int[5];
	String []subjects = new String[5];
	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter marks of students: ");
//	for(int i=0;i<marks.length;i++) {
//		marks[i] = sc.nextInt();
//	}
//	System.out.println("Enter subjects: ");
//	for(int j=0;j<subject.length;j++) {
//		subject[j] = sc.next();
//	}
	System.out.println("Enter marks and subjects:");
	for(int i=0;i<marks.length;i++) {
		System.out.println("Subjects: ");
		subjects[i] = sc.next(); 
		System.out.println("marks: ");
		marks[i] = sc.nextInt();

	}
	System.out.println("Subjects----------Marks");
	for(int k=0;k<marks.length;k++) {
		System.out.println(subjects[k]+"          "+marks[k]);
	}
	
}
}
