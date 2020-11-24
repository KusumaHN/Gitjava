package basicprograms;

import java.util.Scanner;

public class scannerclass {

	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number");
		int fact=1;
		int no=sc.nextInt();
		for(int i=1; i<=no; i++){
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
