package basicprograms;
import java.io.File;

public class Filehandling {

	public static void main(String[] args) {
		File f1= new File("D:\\Kusuma");
		if(f1.mkdirs())
		{
			System.out.println("Folder Created");
		}
		else{
			System.out.println("Folder not  Created");
		}

		if(f1.exists())
		{
			System.out.println("Folder exists");
		}
		else{
			System.out.println("Folder not  exists");
		}
		if(f1.delete())
		{
			System.out.println("Folder deleted");
		}
		else{
			System.out.println("Folder not  deleted");
		}
	}

}
