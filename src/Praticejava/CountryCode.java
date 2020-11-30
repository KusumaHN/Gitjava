package Praticejava;

import java.util.Scanner;

public class CountryCode {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Contry Name");
		String s = sc.nextLine();
		// char ch = s.toUpperCase().charAt(0);
		switch(s.toUpperCase().charAt(0))
		{
		
		case 'I' : System.out.println("INDIA");
		break;
		
		case 'J' : System.out.println("JAPAN");
		break;
		
		case 'A' : System.out.println("AMERICA");
		break;
		
		default : System.out.println("Invalid");
		
		}
		
	}

}
