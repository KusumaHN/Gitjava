package Praticejava;

public class NestedForLoopCode {

	public static void main(String[] args) {

/*
		for(int i=1; i<=10; i++)   //row
		{
			for(int j=1; j<=10; j++)   //column
			{
				System.out.print(j); 
			}
			System.out.println();
		}*/
		
		/*for(int i=1; i<=10; i++)   
		{
			System.out.println("5x" + i + "=" + (i*5)); 
		}
		*/
		
	/*	for(int i=1; i<=10; i++)
		{
			for(int j=1; j<=10; j++)
			{
				System.out.println(i + "x" + j + "="  + (i*j));
			}
		}*/
		
		int num=1;
		for(int i=1; i<=10; i++)
		{
			for(int j=1; j<=10; j++)
			{
				System.out.print(num++ + " ");
			}
			System.out.println();
		}
	}

}
