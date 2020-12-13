package Praticejava;

public class NestedForLooOP {

	public static void main(String[] args) {


		for(int i=1; i<=10; i++)
		{
			if(i!=5)
			{
				for(int j=1; j<=10; j++)
				{
					if(i==1 || i==10)
						System.out.print("|");
					else
						System.out.print(" ");
				}
			}
			else
			{
				for(int k=1; k<=10; k++)
					System.out.print("-");
			}
			System.out.println();
		}

	}

}
