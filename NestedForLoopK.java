package Praticejava;

public class NestedForLoopK {

	public static void main(String[] args) {


		int num=10;
		for(int i=1; i<=4; i++)
		{
			for(int k=1; k<=4-i; k++)
				System.out.print(" ");
			
			for(int j=1; j<=i; j++)
				System.out.print(num-- + " ");
		}
		System.out.println();

	}

}
