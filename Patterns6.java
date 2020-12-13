package Praticejava;

public class Patterns6 {

	public static void main(String[] args) {
		  
		int num=1;
		for(int i=1; i<=4; i++)
		{
			for(int j=3; j>=i; j--)
			{
				System.out.print(" ");
			}
			
			for(int k=1; k<=i; k++)
			{
			System.out.print(num++ + " ");
			}
			System.out.println();
		}
		
	}

}
