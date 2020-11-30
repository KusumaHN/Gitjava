package Operators;

import java.util.Scanner;

public class CountName {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter char");

		char ch = sc.nextLine().toUpperCase().charAt(0);
		if (ch == 'I') {

			switch (Country.INDIA) {
			case INDIA:
				System.out.println("Ind =" + Country.INDIA.getName());
				break;

			default:
				System.out.println("Invalid");
				break;

			}
		} else if (ch == 'J') {
			switch (Country.JAPAN) {

			case JAPAN:
				System.out.println("JAP =" + Country.JAPAN.getName());
				break;

			default:
				System.out.println("Invalid else if 1");
				break;

			}
		} else if (ch == 'A') {
			switch (Country.AMERICA) {

			case AMERICA:
				System.out.println("AME =" + Country.AMERICA.getName());
				break;

			default:
				System.out.println("Invalid else if 2");
				break;

			}
		} else {
			System.out.println("Invalid else");
		}
	}

}
