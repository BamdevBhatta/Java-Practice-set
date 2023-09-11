package Filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FilePractice6 {
//Write a Java program to compare two files lexicographically. 
	public static void main(String[] args) throws IOException {
		FileWriter file0 = new FileWriter("D://bway/user1.txt", true);
		//System.out.println(file0.createNewFile() + " Created:");
		file0.write("this is next file ");
		file0.write(System.lineSeparator());
		file0.write("now we are comparing two files");
		//
//		

		File file = new File("D://bway/user.txt");
		File file1 = new File("D://bway/user1.txt");
		System.out.println(file1.compareTo(file));
		System.out.println(file.compareTo(file1));
	}
}
