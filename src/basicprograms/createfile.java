package basicprograms;
import java.io.File;
import java.io.IOException;

public class createfile {

	public static void main(String[] args) throws IOException 
	{
		File f1=new File("D:\\kushi123.txt");
		if(f1.createNewFile())
		{
			System.out.println("File Created");
		}
		else{
			System.out.println("File Not Created");
		}
		

	}

}
