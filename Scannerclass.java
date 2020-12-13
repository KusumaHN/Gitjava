package Praticejava;

import java.util.Scanner;

public class Scannerclass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Marks");
		
		int marks = sc.nextInt();
		
		if(marks>=0 && marks<35)
			System.out.println("Fail");
			
		else if(marks>=35 && marks<50)
			System.out.println("Pass");  			
		   			
		else if(marks>=50 && marks<60)
			System.out.println("SC");  			
		   			
		else if(marks>=60 && marks<75)
			System.out.println("FC"); 
		
		else if(marks>=75 && marks<100)
			System.out.println("FCD"); 
		
		else
				System.out.println("invalid"); 
	}

}
