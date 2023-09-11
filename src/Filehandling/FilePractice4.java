package Filehandling;

import java.io.File;

public class FilePractice4 {
//Write a Java program to check if a file or directory has read and write permission.
	public static void main(String[] args) {
		File file = new File("D://bway");
		System.out.println(file.canWrite());
		System.out.println(file.canRead());
	}
}
