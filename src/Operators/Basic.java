package Operators;

public class Basic {
 
	public static void main(String[] args) {
		int marks = 25;
		String result = marks>0 && marks<34 ? "Fail": marks>=35 && marks<50 ? "SC" : marks>=50 && marks<75 ? "FC" : marks>=75 && marks<100 ? "FCD" : "Invalid";
		System.out.println(result);
	}
	

}
