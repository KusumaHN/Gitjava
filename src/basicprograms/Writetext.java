package basicprograms;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writetext {

	public static void main(String[] args) throws IOException
	{
		File f1=new File("D:\\kushi123.txt");
		FileWriter fw = new FileWriter(f1,true);
		fw.write("Hello");
		fw.write("  Java Mava");
		fw.write("  Javaclass");
		System.out.println("Written");
		fw.flush();
		
	}

}
