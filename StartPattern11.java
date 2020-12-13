package Praticejava;

public class StartPattern11 {

	public static void main(String[] args) {
	
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				if(i==j)
				{
					System.out.print(1);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
