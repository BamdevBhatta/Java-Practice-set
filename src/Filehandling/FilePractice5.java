package Filehandling;

import java.io.File;

public class FilePractice5 {
//Write a Java program to check if given pathname is a directory or a file. 
	public static void main(String[] args) {
		File file = new File("D://bway");
		File file1 = new File("D://bway/user.txt");
		
		//this is for first object.
		System.out.println("====================");
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		
		//this is for secong object
		System.out.println("=====================");
		System.out.println(file1.isDirectory());
		System.out.println(file1.isFile());
	}
}
