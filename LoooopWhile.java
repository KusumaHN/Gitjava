package Praticejava;

import java.util.Scanner;

public class LoooopWhile {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		String ans = "no";
		while(!ans.equals("yes"))
		{
			System.out.println("Will you Listen to me");
			ans = input.nextLine();
		}
		
	}

}
