package Operators;

import java.util.Scanner;

public class CaseTraffic {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		String color = s1.nextLine();
		
 
		switch (color.toLowerCase()) {
		case "red":
			System.out.println("red color");
			break;

		case "green":
			System.out.println("red color");
			break;

		case "yellow":
			System.out.println("red color");
			break;

		default:
			System.out.println("invalid");
			break;
		}

	}

}
