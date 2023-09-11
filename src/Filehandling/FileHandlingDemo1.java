package Filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingDemo1 {
public static void main(String[] args) throws IOException   {

	FileWriter file = new FileWriter("d://bamdev.txt",true);
	//System.out.println("Created:");
	file.write("Hii Guys .");
	file.write(System.lineSeparator());
	file.write("This is our First program in file ");
	file.write(System.lineSeparator());
	file.write("Now we are creating and writing text on file");
	file.write(System.lineSeparator());
	System.out.println("Written:");
	//System.out.println(file.exists());
	file.close();
}
}
