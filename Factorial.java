package Praticejava;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Num");
		int num = sc.nextInt();
		
		int Fact=1; 
		
		for(int i=1; i<=num; i++)
		{
			Fact=Fact*i;
			
		}
		System.out.print("Fact of " + num + " = " + Fact);
	}

}
