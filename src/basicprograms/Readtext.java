package basicprograms;

import java.io.File;
import java.io.*;

public class Readtext {

	public static void main(String[] args) throws Exception {
		File f1=new File("D:\\kushi123.txt");
		FileReader fr=new FileReader(f1);
		char[] arr= new char[(int)f1.length()];
		fr.read(arr);
		String s1= new String(arr);
		System.out.println(s1);

	}

}
