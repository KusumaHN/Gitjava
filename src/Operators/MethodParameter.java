package Operators;

public class MethodParameter {

	public void add(int a, int b) {
		int c = a + b;
		System.out.println(c);

	}

	public static void main(String[] args) {

		MethodParameter m1 = new MethodParameter();
		m1.add(4, 5);

	}

}
