package Filehandling;

import java.io.File;

public class FilePractice3 {
//Write a Java program to get specific files by extensions from a specified folder. 
	public static void main(String[] args) {
		File file = new File("D://bway");
		if(file.exists()) {
			System.out.println("File Exit");
		}
		else
		System.out.println("Sorry file can't found");
		//System.out.println(file.isDirectory());
	}
}
