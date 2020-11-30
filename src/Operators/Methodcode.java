package Operators;

public class Methodcode {

	int i=10;
	public static  void print(){
		
		System.out.println("I Love Java");
	}
	
	static int sum(int i, int j)
	{
		int res = i+j;
		return res;
	}
	
	static double sum(double k, double l)
	{
		double res = k+l;
		return res;
	}
	
	public static void main(String[] args) {
		
		Methodcode.print();
		
		Methodcode m = new Methodcode();

		System.out.println(m.i);
		
		System.out.print(Methodcode.sum(3, 8));
		System.out.print(Methodcode.sum(2.0 , 8.0));
	}

}
