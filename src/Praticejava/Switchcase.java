package Praticejava;

import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Automatic Number");
		int AutomicNum = sc.nextInt();
		
		switch(AutomicNum)
		{
		case 1 : System.out.println("Oxygen");
		break;
		
		
		case 2 : System.out.println("Oxygen");
		break;
		
		case 3 : System.out.println("Oxygen");
		break;
		
		default : System.out.println("Invalid") ;
		}
	}

}
