package Operators;

public class CaseSwitch {

	
	enum value{
		high(40),
		low(30),
		midium(35);
		private int value;
		value(int value){
			this.value = value;
		}
		public int getValue() {
			return value;
		}
		public void setValue(int value) {
			this.value = value;
		}
	} 
	
	public static void main(String[] args) {
		/*int num = 30;

		switch (num) {
		case 1:
		System.out.println("case 1");
		break;
		
		case 10:
		System.out.println("case 10");
		break;
		
		case 20:
		System.out.println("case 20");
		break;
		
		default :	
		System.out.println("invalid");*/
		
		
		/*String num = "kusuma";

		switch (num) {
		case "kusuma":
		System.out.println("case 1");
		break;
		
		case "Kushi":
		System.out.println("case 10");
		break;
		
		case "suma":
		System.out.println("case 20");
		break;
		
		default :	
		System.out.println("invalid");*/
		
		
		/*char a = 'K';

		switch (a) {
		case 'A':
		System.out.println("case 1");
		break;
		
		case 'K':
		System.out.println("case 10");
		break;
		
		case 'S':
		System.out.println("case 20");
		break;
		
		default :	
		System.out.println("invalid");*/

		
	/*	CaseSwitch a = new CaseSwitch();      // we cann't do switch cases for our own class, it's done only for int, string , char and enum

		switch (a) {
		case 'A':
		System.out.println("case 1");
		break;
		
		case 'K':
		System.out.println("case 10");
		break;
		
		case 'S':
		System.out.println("case 20");
		break;
		
		default :	
		System.out.println("invalid");
		}*/
		
	
		
		  

		switch (value.low) {
		case high:
		System.out.println("case 1 =" + value.high.getValue());
		break;
		
		case low:
		System.out.println("case 10 =" + value.low.getValue());
		break;
		
		case midium:
		System.out.println("case 20 =" + value.midium.getValue());
		break;
		
		default :	
		System.out.println("invalid");
		}
	}

}
