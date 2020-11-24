package basicprograms;

import java.util.Scanner;

public class sample123 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int no=sc.nextInt();
		int sum=0;
		int rem=0;
		while(no!=0)
		{
		 rem=no%10;
			sum=sum+rem;
			no=no/10;
			
		}
		System.out.println(sum);
	}

}
