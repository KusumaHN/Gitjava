package Praticejava;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Number");
			int num =sc.nextInt();
			
		int i, r, temp, sum=0;
		
		temp=num;
		
		while(num>0)
		{
			r=num%10;
			sum=sum*10+r;
			num=num/10;
			
		}
		
		if(temp==sum)
		{
			System.out.println("Number is Palindrome");
		}
		else
		{
			System.out.println("Number is not a Palindrome");
		}

	}

}
