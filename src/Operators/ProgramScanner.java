package Operators;

import java.util.Scanner;

public class ProgramScanner {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Your Name");
		 String name = sc.nextLine();
		 
		 System.out.println("Enter Marks");
		 int marks = sc.nextInt();
		 
		/* String res = marks>=0 && marks<50 ? "pass" : marks>50 && marks<60 ? "SC" : marks>=60 && marks<75 ? "FC":
			 marks>=75 && marks<100 ? "FCD" : "invalid";
			 
			 System.out.println(res);*/
			 
			 
			 String s = (marks>=75)? "FCD": (marks>=60)? "FC": (marks>=35)? "SC": (marks>=0)? "Fail": "Invalid";
			 System.out.println(s);
 
	}

}
