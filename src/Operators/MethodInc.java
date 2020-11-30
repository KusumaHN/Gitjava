package Operators;

public class MethodInc {

	
	static int test(int a)
	{
		a++;
		return a++;
	}
	public static void main(String[] args) {
	
		int a=1; int b=5;
		int c= a++ + b++ + test(a++);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		test(2);
	}

}
