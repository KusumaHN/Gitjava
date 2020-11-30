package Operators;

public class ExamMethod {

	
	 static int test (int a)
	 {
		 return a;
	 } 
	 
	public static void main(String[] args) {
		
		
		int a=2; int b=5;
		int c= a++ + b++ + test(a++);
		 System.out.println(c);
		 
		

	}

}
