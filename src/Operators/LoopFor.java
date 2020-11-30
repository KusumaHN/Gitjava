package Operators;

public class LoopFor {

	public static void main(String[] args) {
		int countk =0;
		for(int i=10; i>0; i--)
		{
			for(int j=0; j<10; j++)           //
			{
				for(int k=0; k<10; k++)
				{
					countk++;
				System.out.print(k);
				}
				
				System.out.print(j);
			}
			System.out.println(i);
		}

		System.out.println(countk);
	}

}
