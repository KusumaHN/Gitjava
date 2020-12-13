package Praticejava;

public class Pattern7 {

	public static void main(String[] args) {


		int num=10;
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(" ");
			}
			for(int k=4; k>=i; k--)
			{
				System.out.print(num + " ");
				num --;
			}
			System.out.println();
		}
	}

}
