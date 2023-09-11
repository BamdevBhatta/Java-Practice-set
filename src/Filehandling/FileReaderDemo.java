package Filehandling;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReaderDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("D://bamdev.txt");
		BufferedInputStream br = new BufferedInputStream(file);
		int data;

		while ((data = br.read()) != -1) {
         System.out.print((char)data);
		}
		file.close();
	}
}
