package Praticejava;

import java.util.Scanner;

public class TrafficSignal {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Color");
		               String color = sc.nextLine();
		               
		               switch(color.toLowerCase())
		               {
		               case "red" : System.out.println("Stop");
		               break;
		              
		               case "yellow" : System.out.println("get ready");
		               break;
		               
		               case "green" : System.out.println("start");
		               break;
		               
		              default : System.out.println("Invalid");
		             
		               }

	}

}
