package basicprograms;
import java.util.Scanner;

public class strongnumber {

	public static void main(String[] args) {
    int no=145;
    int copy=no;
     int sum=0;
     int fact=1;
     
     while(no!=0)
     {
    	 int rem=no%10;
    	 for(int i=1; i<=rem; i++){
    		 fact=fact*i;	 
    	 }
    	 sum=sum+fact;
    	 no=no/10;
     }
     
     if(sum==copy){
    	 System.out.println("number is strong");
     }
     else{
    	 System.out.println("number is not a strong");
     }

	}}
