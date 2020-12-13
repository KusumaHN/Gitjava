package Praticejava;

public class ForEachLoopCode1 {

	public static void main(String[] args) {


		/*int val=10;
		
		for(int i=1; i<=3; i++)
		{
			for(int j=1; j<=3; j++)
			{
				System.out.print(val + " ");
				val+=10;
			}
			System.out.println();
		}*/
		
		
		int num=1;
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(num++ + " ");
			}
			System.out.println();
		}

	}

}
