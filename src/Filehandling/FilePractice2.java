package Filehandling;

import java.io.File;

public class FilePractice2 {
//Write a Java program to get a list of all file/directory names from the given.
	public static void main(String[] args) {
		File file = new File("D://bway");
		String [] list =file.list();
		for(String x: list) {
			System.out.println(x);
		}
	}
}
