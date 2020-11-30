package Operators;

public class Method {

	
	public static int sum(int n1, int n2)
	{
		return n1+n2;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(Method.sum(3, 6));
		System.out.println(sum(sum(3, 3),5));
	}

}
