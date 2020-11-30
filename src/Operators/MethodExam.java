package Operators;

public class MethodExam {
	
	static int test(int a)
	{ 
			System.out.println("a =" + a++);
		return a++;
	}

	public static void main(String[] args) {
	
		int i=0, j=1;
		j=test(i) + ++j + ++i;
		System.out.println(j);
		test(2);
		

	}

}
