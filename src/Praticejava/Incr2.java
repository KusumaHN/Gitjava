package Praticejava;

public class Incr2 {

	public static void main(String[] args) {
		int i=1;
		
		int j=i++;                 //j=1
		if((i==++j)| (i++==j))     
		{
			i+=j;
			
		}
		System.out.println(i);
	}

}
