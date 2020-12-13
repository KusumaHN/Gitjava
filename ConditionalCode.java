package Praticejava;

import java.util.Scanner;

public class ConditionalCode {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name");
		String name = sc.nextLine().toLowerCase();
		
		System.out.println("Enter Your Marks");
		int marks = sc.nextInt();
		
		
		String res = marks>0 && marks<35 ? "Fail" : marks>35 && marks<50 ? "Pass" : marks>50 && marks<60 ? "SC" :  marks>60 && marks<75 ? "FC" : marks>75 && marks<100 ? "FCD" : "iNVALID"; 
   System.out.println(res);
   
   
   System.out.println(name + " Your Result is  = " + marks);

	}

}
